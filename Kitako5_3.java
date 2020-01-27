//次のプログラムを作成しなさい。
//
//10 個の数値を入力する。
//入力された数値を偶数と奇数に分類して表示する。
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
