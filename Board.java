public class Board{
	private int height; //height of the board
	private int width; //width of the board
	private int currentPent; //number of the current Pentomino
	private int x; //coordinate x
	private int y; //coordinate y

		//constructor
	public Board(){
		height = 15;
		width = 5;
		int[][] board = new[height][width]; //new empty board
	}

	public void showPentomino(int x, int y){ //shows pentomino at a certain spot with the coordinates x, y
		for(int i =0; i < pent[0].length; i++){
			for(int j = 0; j < pent.length; j++){
				board[x+i][y+j] = pent[i][j];
			}
		}
	}

		public void shiftDown(int[][] pent, int[][]board, int x, int y){ //moves the current pentomino one space lower
		if(fits(pent,board,x,y+1){
			for(int i = 0; i<pent.length; i++){
				for(int j = 0; j<pent[0].length; j++){
					board[i][j] = board[i][j+1];
				}
			}
		}
	}

	public void gameOver(int[][] pent, int[][] board){
		if (!fits(pent, board, 1, 0) {
			//Game over code here...
		}
	}

	public void newPentomino(int[][] pent, int[][] board, x, y){ //for placing it at the top
		if(!fits(pent,board,x,y+1){
			for(int i = 0; i<pent.length; i++){
				for(int j = 0; j<pent[0].length; j++){
					if(pent[i][j] !=  0 && pent[i][j]<13){
						pent[i][j] = pent[i][j]+20;
					}
				}
			}
		}
		
		pent = Pentomino.getPentomino();
		
		if(fits(pent, board, 0, 3) && pent.length == 1){
			placingPentomino(0,3);
		}
		else if(fits(pent, board, 0, 2) && pent.length == 2 || pent.length == 3){
			placingPentomino(0,2);
		}
		else if(fits(pent, board, 0, 1) && pent.length == 4){
			placingPentomino(0,1);
		}
		else if(fits(pent, board, 0, 0) && pent.length == 5){
			placingPentomino(0,0);
		}
		else{
			//GAMEOVER!
		}
	}

	public void gameOver(int[][] pent; int[][] board){ //if a new Pentomino can't be made, this method is called (game-over-screen)

	}

	public void newPentomino(int[][] pent){ //for placing it at the top
		pent = Pentomino.getPentomino();

		if(fits(pent, board, 0, 3) && pent.length == 1){
			showPentomino(0,3);
		}
		else if(fits(pent, board, 0, 2) && pent.length == 2 || pent.length == 3){
			showPentomino(0,2);
		}
		else if(fits(pent, board, 0, 1) && pent.length == 4){
			showPentomino(0,1);
		}
		else if(fits(pent, board, 0, 0) && pent.length == 5){
			showPentomino(0,0);
		}
		else{
			//GAMEOVER!
		}
	}

	public boolean isFull(int[][] board, int x) { //checks for line with index x in the bord for being full
		for (int i= 0; i<board[x].length; i++) {
			if (board[x][i]==0) {
				return false;
				}
			return true;
			}
		}
	}
	
	public void deletingRow(int[][] board){
		for(int j = 0; j<board.length; j++){
			if(isFull(board, j)){
				for(int i = 0; i<board[0].length;i++){
					board[j][i] = board[j][i-1];
				}
				for(int i =0; i<board[0].length; i++){
					for(int l = j-1; l>0; l--){
						board[l][i] = board[l-1][i];
						board[0][i] = 0;
					}
				}
				for(int i=0; i<board[0].length; i++){
					board[0][i] = 0;
				}
			}
		}		
	}

	public void shiftLeft(int[][] pent){ //shifts a pentomino to the left
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

	public void down(int[][] pent, int[][] board, int x, int y) { //let's the pentomino move down all the way until it hits something
		for (int i = y; i > board.length; i++) {
			if(!fits(pent, board, x, y)) {
				//place the pentomino in [x][y-1]
				break;
			}
		}
		newPentomino();
	}

	public boolean fits(int[][] pent, int[][] board, int x, int y) { //checks if the Pentomino fits in the given spot with coordinates x, y
		if (x + pent[0].length > board[0].length || y + pent.length > board.length) { //checks for out of bounds
			return false;
		} else { //if not out of bound, check if there is nothing
			for(int i=0; i < pent.length; i++) {
				for(int j=0; j < pent[0].length; j++) {
					if (pent[i][j] != 0 && (board[x+i][y+j] = 0 || board[x+i][y+j] = currentPent)) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
