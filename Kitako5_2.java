import java.util.*;
public class Kitako5_2{
	public static void main(String[] args){
		int[] arr =new int[10];
		for (int i =0;i<10;i++){
			arr[i]=new Scanner(System.in).nextInt();
		}
		for(int i=9;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}
