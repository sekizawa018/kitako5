public class Kitako5_6{
	public static void main(String[] args){
		int[][] kuku =new int[9][9];
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				kuku[x][y]=(x+1)*(y+1);
			}
		}
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.printf(" %2d",kuku[i][j]);
			}
			System.out.println();
		}
	}
}
