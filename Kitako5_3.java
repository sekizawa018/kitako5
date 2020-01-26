import java.util.*;
public class Kitako5_3{
	public static void main(String[] args){
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=new Scanner(System.in).nextInt();
		}
		System.out.print("偶数:");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("奇数");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
