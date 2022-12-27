package jaya.com.qahashmap;

public class Dupl {

	public static void main(String[] args) {

		
		
		int arr[]= {1,2,3,3,1,2,4,5,6,78};
		
		/*
		 * int count=0; for(int i=0;i<arr.length;i++) 
		 * { for(int j=i+1;j<arr.length;j++)
		 * { if(arr[i]==arr[j]) { count++; } } if(count==1) {
		 * System.out.println(arr[i]); count=0; } }
		 */
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		
		if(count==1) {
			System.out.println(arr[i]);
			count=0;
		}
		
		
		
}}
}