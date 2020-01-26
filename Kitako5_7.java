import java.util.*;
public class Kitako5_7{
	public static void main(String[] args){
		int[][] kuku =new int[9][9];
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				kuku[x][y]=(x+1)*(y+1);
			}
		}
		int a =new Scanner(System.in).nextInt();
		int b =new Scanner(System.in).nextInt();
		System.out.println(kuku[a-1][b-1]);
	}
}
