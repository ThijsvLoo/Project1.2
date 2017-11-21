import java.awt.*
public class Shape{
	// private BufferedImage block;
	private int[][] coordinates;
	private Board board;
	
	
	public Shape(BufferedImage block, int[][] coordinates, Board board){
		this.block = block;
		this.coordinates = coordinates;
		this.board = board;
	}
	
	// So we can update shape
	public void update(){
		
	}
	//So we can render the shape
	public void render(Graphics g){
		
	}
}
