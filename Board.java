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
}
