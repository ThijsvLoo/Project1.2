import javax.swing.*;
import java.awt.*;
public class Board extends JPanel{
	//private BufferedImage blocks;
	private final int blockSize = 50;
	private final int boardWidth = 5;
	private final int boardHeight = 15;
	private int[][] board = new int[boardWidth][boardHeight];
	
	// private Shape[] shapes = new Shape[12];
	public Board(){
		// Where we will insert our "Base" image
		/* try{
			blocks = ImageIO.read(Board.class.getResource("/NAME OF IMAGE FILE WE HAVE"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Created shapes, but they require the base image to work
		/*
		shapes[0] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,1,1,1,1} //I shape
		}, this);
		
		shapes[1] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,1},
			{1,1},
			{1,0} //P shape
		}, this);
		
		shapes[2] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{0,1,0},
			{1,1,1},
			{0,1,0} //X shape
		}, this);
		
		shapes[3] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{0,1,1},
			{1,1,0},
			{0,1,0} //F shape
		}, this);
		
		shapes[4] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,0,0},
			{1,0,0},
			{1,1,1}//V shape
		}, this);
		
		shapes[5] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,0,0},
			{1,1,0},
			{0,1,1} //W shape
		}, this);
		
		shapes[6] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{0,1},
			{1,1},
			{0,1},
			{0,1} //Y shape
		}, this);
		
		shapes[7] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,1,1},
			{0,1,0},
			{0,1,0} //t shape
		}, this);
		
		shapes[8] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,1,0},
			{0,1,0},
			{0,1,1} //Z shape
		}, this);
		
		shapes[9] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,0,1},
			{1,1,1} //U shape
		}, this);
		
		shapes[10] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{1,1,0,0},
			{0,1,1,1} //N shape
		}, this);
		
		shapes[11] = new Shape(blocks.getSubimage(0, 0, blockSize, blockSize), new int[][] {
			{0,0,0,1},
			{1,1,1,1} //L shape
		}, this);
				*/
		
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//drawing horizontal lines
		for(int i = 0; i < boardHeight; i++){
			g.drawLine(0, i*blockSize, boardWidth*blockSize, i*blockSize);
		}
		//drawing vertical lines
		for(int j = 0; j < boardWidth; j++){
			g.drawLine(j*blockSize, 0, j*blockSize, boardHeight*blockSize);
		}
		
		
	}
}