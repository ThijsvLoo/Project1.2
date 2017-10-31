public class Pentomino{

	public Pentomino(){
		private char[][] pent = new char[5][5];
	}

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
}
