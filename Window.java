import javax.swing.*;


public class Window {
	private JFrame window;
	private Board board;
	public static final int WIDTH = 250, HEIGHT = 800;
	
	public Window(){
		window = new JFrame("Pentris Game");
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		board = new Board();
		window.add(board);
	}
	

	public static void main(String[] args){
	   new Window();
	}
}