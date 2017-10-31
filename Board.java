public class Board{
	private int width;
	private int height;
	
	
	//constructor
	public Board(int width, height){
		char[][] board = new[width][height]; //empty board
	}
	
	public char[][] makeBoard(){
		
	}
	
	public void placingPentomino(){
		while(//falls){
			
		}
	}
	
	public void fall(char[][] pent){
		
	}
	
	public void gameOver(){
		
	}
	
	public void newPentomino(char[][] pent){
		
	}
	
	public void rotateRight(char[][] pent, int width, int height){
		Char[][] tempMatrix = a[m][n];
 		for(int i=0; i<m; i++){
 			for(int j=0; j<n; j++){
 				tempMatrix[i][j] = a[j][i];
 			}
 		}
 		rotatedMatrix[][]=flipMatrix(tempMatrix);
 		return rotatedMatrix;
	}
	
	public void rotateLeft(char[][] pent){
		
	}
	
	public void shiftRight(char[][] pent, int width, int height){
		int heightP = pent.length;
		int widthP = pent[0].length;
		for(int i = 0; i<heightP; i++){
			for(int j = 0; j< widthP; j++){
				if(board[i][j+1] == '0' && j != width-1){
					pent[i][j] = pent[i][j+1];
				}
				else{
					pent[i][j] = pent[i][j];
				}
			}
		}
				
	}
	
	public void shiftLeft(char[][] pent){
		int heightP = pent.length;
		int widthP = pent[0].length;
		for(int i = 0; i<heightP; i++){
			for(int j = 0; j< widthP; j++){
				if(board[i][j-1] == 0 & j != 0){
					pent[i][j] = pent[i][j-1];
				}
				else{
					pent[i][j] = pent[i][j];
				}
			}
		}
	}
	
	public void down(char[][] pent){
		
	}
}
