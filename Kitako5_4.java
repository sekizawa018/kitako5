import java.util.*;
public class Kitako5_4{
	public static void main(String[] args){
		int total =0;
		int i=0;
		int[] arr=new int[10]; 
		for (;i<arr.length && total<=100;i++){
			arr[i]=new Scanner(System.in).nextInt();
			total+=arr[i];
		}
		for(int n=0;n<i;n++){
			System.out.println(arr[n]);
		}
	}
}
