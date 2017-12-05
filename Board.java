import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static java.lang.System.*;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.*;
import java.io.*;

public class Board extends JPanel implements KeyListener{

	private BufferedImage blocks;
	private final int blockSize = 50;
	private final int boardWidth = 5, boardHeight = 15;
	private int[][] board = new int[boardHeight][boardWidth];
	private Shape[] shapes = new Shape[12];
	private Shape currentShape;
	private Timer timer;
	private final int FPS = 60;
	private final int delay = 1000/FPS;
	private boolean gameOver = false;
	private static int score = 0;
	private int scoreLength = 3;

	public Board(){

		try {
			blocks = ImageIO.read(Board.class.getResource("/tiles.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		timer = new Timer(delay, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				repaint();
			}
		});

		timer.start();

		// Created shapes, but they require the base image to work
		shapes[0] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
				{1,1,1,1,1} //I shape
		}, this, 1);

		shapes[1] = new Shape(blocks.getSubimage(blockSize, 0, blockSize, blockSize), new int[][] {
				{1,1,1},
				{1,1,0}//P shape
		}, this, 2);

		shapes[2] = new Shape(blocks.getSubimage(blockSize*2, 0, blockSize, blockSize), new int[][] {
				{0,1,0},
				{1,1,1},
				{0,1,0} //X shape
		}, this, 3);

		shapes[3] = new Shape(blocks.getSubimage(blockSize*3, 0, blockSize, blockSize), new int[][] {
				{0,1,1},
				{1,1,0},
				{0,1,0} //F shape
		}, this, 4);

		shapes[4] = new Shape(blocks.getSubimage(blockSize*4, 0, blockSize, blockSize), new int[][] {
				{1,1,1},
				{0,0,1},
				{0,0,1} //V shape
		}, this, 5);

		shapes[5] = new Shape(blocks.getSubimage(blockSize*5, 0, blockSize, blockSize), new int[][] {
				{1,1,0},
				{0,1,1},
				{0,0,1} //W shape
		}, this, 6);

		shapes[6] = new Shape(blocks.getSubimage(blockSize*6, 0, blockSize, blockSize), new int[][] {
				{1,1,1,1},
				{1,0,0,0} //Y shape
		}, this, 7);

		shapes[7] = new Shape(blocks.getSubimage(blockSize*7, 0, blockSize, blockSize), new int[][] {
				{1,1,1},
				{0,1,0},
				{0,1,0} //t shape
		}, this, 8);

		shapes[8] = new Shape(blocks.getSubimage(blockSize*8, 0, blockSize, blockSize), new int[][] {
				{1,1,0},
				{0,1,0},
				{0,1,1} //Z shape
		}, this, 9);

		shapes[9] = new Shape(blocks.getSubimage(blockSize*9, 0, blockSize, blockSize), new int[][] {
				{1,0,1},
				{1,1,1} //U shape
		}, this, 10);

		shapes[10] = new Shape(blocks.getSubimage(blockSize*10, 0, blockSize, blockSize), new int[][] {
				{1,1,0,0},
				{0,1,1,1} //N shape
		}, this, 11);

		shapes[11] = new Shape(blocks.getSubimage(blockSize*11, 0, blockSize, blockSize), new int[][] {
				{1,1,1,1},
				{1,0,0,0}, //L shape
		}, this, 12);

		setNextShape();

	}

	public void update(){
		currentShape.update();
		if(gameOver) {
			timer.stop();
			gameOver();
		}
	}


	public void paintComponent(Graphics g){
		super.paintComponent(g);

		currentShape.render(g);

		for(int row = 0; row < board.length; row++)
			for(int col = 0; col < board[row].length; col++)
				if(board[row][col] != 0)
					g.drawImage(blocks.getSubimage((board[row][col]-1)*blockSize, 0, blockSize, blockSize),
					col*blockSize, row*blockSize, null);



		for(int i = 0; i < boardHeight; i++){
			g.drawLine(0, i*blockSize, boardWidth*blockSize, i*blockSize);
		}
		for(int j = 0; j < boardWidth+1; j++){
			g.drawLine(j*blockSize, 0, j*blockSize, boardHeight*blockSize);
		}

	}

	public void setNextShape(){

		int index = (int)(Math.random()*shapes.length);

		Shape newShape = new Shape(shapes[index].getBlock(), shapes[index].getCoords(),
				this, shapes[index].getColor());

		currentShape = newShape;

		for(int row = 0; row < currentShape.getCoords().length; row++)
			for(int col = 0; col < currentShape.getCoords()[row].length; col++)
				if(currentShape.getCoords()[row][col] != 0){

					if(board[row][col] != 0)
						gameOver = true;
				}



	}


	public int getBlockSize(){
		return blockSize;
	}

	public int[][] getBoard(){
		return board;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int score) {
		this.score += score;
		System.out.println(this.score);
	}

	public int getBoardWidth() {
		return boardWidth;
	}

	public int getBoardHeight() {
		return boardHeight;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			currentShape.setDeltaX(-1);
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			currentShape.setDeltaX(1);
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			currentShape.speedDown();
		if(e.getKeyCode() == KeyEvent.VK_UP)
			currentShape.rotate();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			currentShape.normalSpeed();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void gameOver() {
		String name = JOptionPane.showInputDialog("What's your name?");
		String[] nameList = new String[scoreLength + 1];
		int[] scoreList = new int[scoreLength + 1];
		try{
			FileReader reader = new FileReader("scoreList.txt");
			Scanner in = new Scanner(reader);
			for(int i = 0; i < scoreLength; i++){
				nameList[i] = in.next();
				scoreList[i] = Integer.parseInt(in.next());
			}
			reader.close();
		} catch(Exception e) {
			System.out.println("Someting wong");
		}

		for(int k = scoreLength-1; k >= 0; k--){
			if(score > scoreList[k]){
				scoreList[k+1] = scoreList[k];
				nameList[k+1] = nameList[k];
			} else {
				scoreList[k+1]= score;
				nameList[k+1] = name;
			}
		}


		try{
			FileWriter writer = new FileWriter("scoreList.txt");
			for(int l = 0; l < scoreLength; l++){
				writer.write(nameList[l] + " " + scoreList[l] + System.lineSeparator());
			}
			writer.close();
		} catch(Exception f){
			System.out.println("Someting else wong");
		}
	}
}
