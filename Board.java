public class Board{
	private int height;
	private int width;
	
	
		//constructor
	public Board(){
		height = 15;
		width = 5;
		char[][] board = new[height][width]; //empty board
	}
	
	public void placingPentomino(int x, int y){ //places Pentomino  in the board
		while(/*falls*/){
			
		}
		for(int i =0; i < pent[0].length; i++){
			for(int j = 0; j < pent.length; j++){
				board[x+i][y+j] = pent[i][j];
			}
		}
	}
	
	public void fall(char[][] pent){ //moves the current pentomino one space lower 
		
	}
	
	public void gameOver(char[][] pent; char[][] board){ 
		if (!fits(pent, board, 1, 0) {
			//Game over code here...
		}
	}
	
	public void newPentomino(char[][] pent){
		
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
				if(board[i][j-1] == '0'0 & j != 0){
					pent[i][j] = pent[i][j-1];
				}
				else{
					pent[i][j] = pent[i][j];
				}
			}
		}
	}
	
	public void down (char[][] pent, char[][] board, int x, int y) {
	for (int i = y; i > board.length; i++) {
		if(!fits(pent, board, x, y)) {
			//place the pentomino in [x][y-1]
			break;
			}
		}
	}
		    
	public boolean fits(char[][] pent, char[][] board, int x, int y) { //checks if the Pentomino fits in the given spot
		if (x + pent[0].length > board[0].length || y + pent.length > board.length) { //checks for out of bounds
			return false;
		} else { //if not out of bound, check if there is something
			for(int i=0; i < pent.length; i++) {
				for(int j=0; j < pent[0].length; j++) {
					if (pent[i][j] !='0' && (board[x+i][y+j] ='0' || board[x+i][y+j] = pent)) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
