import java.util.*;
public class Kitako5_8{
	public static void main(String[] args){
		int[] Arr=new int[10];
		for(int i=0;i<Arr.length;i++){
			Arr[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<Arr.length-1;i++){
			for(int j=i+1;j<Arr.length;j++){
				if(Arr[i] > Arr[j]){
					int temp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(Arr));
	}
}
