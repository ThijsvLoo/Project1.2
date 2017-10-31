public class Board{
	private int height;
	private int width;
	
	
	//constructor
	public Board(int height, int width){
		height = 15;
		width = 5;
		char[][] board = new[height][width]; //empty board
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
	
	public void rotateRight(char[][] pent){
		int height = pent.length;
		int width = pent[0].length;
		Char[][] tempMatrix = pent[width][height];
 		for(int i=0; i<width; i++){
 			for(int j=0; j<height; j++){
 				tempMatrix[i][j] = pent[j][i];
 			}
 		}
 		rotatedMatrix[][]=flipMatrix(tempMatrix);
 		return rotatedMatrix;
	}
	
	public void rotateLeft(char[][] pent){
		int height = pent.length;
		int width = pent[0].length;
		Char[][] tempMatrix = pent[width][height];
 		for(int i=0; i<width; i++){
 			for(int j=0; j<height; j++){
 				tempMatrix[i][j] = pent[j][i];
 			}
 		}
 		rotatedMatrix[][]=flipMatrix(tempMatrix);
 		return rotatedMatrix;
	}
	
	public static Char[][] flipMatrix(Char[][] pent){
 		int height = pent.length;
		int width = pent[0].length;
		Char[][] flipMatrix = pent[width][height]; 
 		for(int i=0; i<width; i++){
			for(int j=0; j<height; j++){
				flipMatrix[i][j] = pent[i][a[0].length-1-j];
			}
		}
		return flipMatrix;
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

	public boolean isFull(char[][] a, int x) { //checks for line with index x in the bord for being full
		for (int i= 0; i<a[x].length; i++) {
			if (a[x][i]==0) {
				return false;
				}
			return true;
			}
		}
	}
}
