public class Pentomino{

	public char[][] getPentomino(){
		char[][] p = {{'p','p'},{'p','p'},{'p','0'}};
		char[][] x = {{'0','x','0'},{'x','x','x'},{'0','x','0'}};
		char[][] f = {{'0','f','f'},{'f','f','0'},{'0','f','0'}};
		char[][] v = {{'v','0','0'},{'v','0','0'},{'v','v','v'}};
		char[][] w = {{'w','0','0'},{'w','w','0'},{'0','w','w'}};
		char[][] y = {{'0','y'},{'y','y'},{'0','y'},{'0','y'}};
		char[][] i = {{'i'},{'i'},{'i'},{'i'},{'i'}};
		char[][] t = {{'t','t','t'},{'0','t','0'},{'0','t','0'}};
		char[][] z = {{'z','z','0'},{'0','z','0'},{'0','z','z'}};
		char[][] u = {{'u','0','u'},{'u','u','u'}};
		char[][] n = {{'n','n','0','0'},{'0','n','n','n'}};
		char[][] l = {{'0','0','0','l'},{'l','l','l','l'}};
		char[][][] pentList = {p,x,f,v,w,y,i,t,z,u,n,l};
		
		int random = (int) Math.random()*12;
		return pentList[random];
	}
	public char[][] rotateRight(char[][] pent){
		int height = pent.length;
		int width = pent[0].length;
		char[][] tempMatrix = new char[width][height];
 		for(int i=0; i<height; i++){
 			for(int j=0; j<width; j++){
 				tempMatrix[i][j] = pent[pent.length-1-j][i];
 			}
 		}
 		return tempMatrix;
	}
	
	public char[][] rotateLeft(char[][] pent){
		int height = pent.length;
		int width = pent[0].length;
		char[][] tempMatrix = new char[width][height];
 		for(int i=0; i<height; i++){
 			for(int j=0; j<width; j++){
 				tempMatrix[i][j] = pent[j][pent[0].length-1-i];
 			}
 		}
 		return tempMatrix;
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
