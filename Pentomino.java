public class Pentomino{

	public int[][] getPentomino(){
		int[][] p = {{1,1},{1,1},{1,0}};
		int[][] x = {{0,2,0},{2,2,2},{0,2,0}};
		int[][] f = {{0,3,3},{3,3,0},{0,3,0}};
		int[][] v = {{4,0,0},{4,0,0},{4,4,4}};
		int[][] w = {{5,0,0},{5,5,0},{0,5,5}};
		int[][] y = {{0,6},{6,6},{0,6},{0,6}};
		int[][] i = {{7},{7},{7},{7},{7}};
		int[][] t = {{8,8,8},{0,8,0},{0,8,0}};
		int[][] z = {{9,9,0},{0,9,0},{0,9,9}};
		int[][] u = {{10,0,10},{10,10,10}};
		int[][] n = {{11,11,0,0},{0,11,11,11}};
		int[][] l = {{0,0,0,12},{12,12,12,12}};
		int[][][] pentList = {p,x,f,v,w,y,i,t,z,u,n,l};

		int random = (int) Math.random()*12;
		return pentList[random];
	}

	public int[][] rotateRight(int[][] pent){
		int height = pent.length;
		int width = pent[0].length;
		int[][] tempMatrix = new int[width][height];
 		for(int i=0; i<height; i++){
 			for(int j=0; j<width; j++){
 				tempMatrix[i][j] = pent[pent.length-1-j][i];
 			}
 		}
 		return tempMatrix;
	}

	public int[][] rotateLeft(int[][] pent){
		int height = pent.length;
		int width = pent[0].length;
		int[][] tempMatrix = new int[width][height];
 		for(int i=0; i<height; i++){
 			for(int j=0; j<width; j++){
 				tempMatrix[i][j] = pent[j][pent[0].length-1-i];
 			}
 		}
 		return tempMatrix;
	}
}
