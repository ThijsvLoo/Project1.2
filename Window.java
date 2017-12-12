import javax.swing.JFrame;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;

/**
 * The main class, the constructer creates the frame bard etc, and then the main function starts everything off
 * @author Maaike, Jonas, Andreas, Thijs
 */
public class Window {
	
	public static final int WIDTH = 250, HEIGHT = 780;
	private JFrame frame2;
	private Board board;
	
	public Window(){

		/**
		 * make a frame and put the gameboard in it
		 */
		frame2 = new JFrame("Tetris Game");
		frame2.setSize(WIDTH, HEIGHT);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);

		board = new Board();

		frame2.add(board);
		frame2.addKeyListener(board);
		frame2.setVisible(true);

		/**
		 * A try catch to play some background music in a loop
		 */
		try{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("tetris.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}
		catch(Exception ex){
		}
	}
	
	
	
	public static void main(String[] args) {
		Window window = new Window();

	}

}
