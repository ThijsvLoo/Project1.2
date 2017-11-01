public class Board{
	private int height;
	private int width;
	
	
		//constructor
	public Board(){
		height = 15;
		width = 5;
		char[][] board = new[height][width]; //empty board
	}
	
	public char[][] makeBoard(){
		
	}
	
	public void placingPentomino(){
		while(/*falls*/){
			
		}
	}
	
	public void fall(char[][] pent){
		
	}
	
	public void gameOver(){
		
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
	
	public void down(char[][] pent){
		int heightP = pent.length;
		int widthP = pent[0].length;
		for(int i = 0; i<heightP; i++){
			for(int j = 0; j<widthP; j++){
				if(board[i-1][j] == '0' & i != 0){
					pent[i][j] = pent[i-1][j];
				}
				else{
					pent[i][j] = pent[i][j];
				}
			}
		}
	}
}
