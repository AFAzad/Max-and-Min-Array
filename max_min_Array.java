/* Problem Statement
Given an array A[ ] of size N containing positive integers, find maximum and minimum elements from the array. */
import java.io.*; 
import java.util.*; 
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
		long [] arr = new long[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextLong();

		}
			long max =1 ;
			//for(int  i=0;i<n;i++){
			//int min = Math.max(arr[i]-1);
			long min = 10000000;
		//	}
			for(int i=0;i<n;i++){
					if(arr[i]>max){
						max= arr[i];
					}
					if(arr[i]<=min){
						min = arr[i];
					}
			}
			System.out.println(max +" "+min);
		
			t--;
		}
		
		
	}		
}