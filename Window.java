import javax.swing.JFrame;
import javax.swing.*;
public class Window {
	
	public static final int WIDTH = 600, HEIGHT = 1200;
	private JFrame window;
	private Board board;
	
	public Window(){

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 780);
		panel.setVisible(true);
		JButton button = new JButton("hello");
		button.setLocation(0,0);
		panel.add(button);
		frame.add(panel);

		window = new JFrame("Tetris Game");
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);

		board = new Board();

		window.add(board);
		window.addKeyListener(board);
		window.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Window();
	}

}
