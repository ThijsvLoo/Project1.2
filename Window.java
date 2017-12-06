import javax.swing.JFrame;
import javax.swing.*;
public class Window {
	
	public static final int WIDTH = 250, HEIGHT = 780;
	private JFrame frame2;
	private Board board;
	
	public Window(){
		

		frame2 = new JFrame("Tetris Game");
		frame2.setSize(WIDTH, HEIGHT);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);

		board = new Board();

		frame2.add(board);
		frame2.addKeyListener(board);
		frame2.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Window window = new Window();
		
	}

}
