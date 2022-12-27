package jaya.com.qahashmap;

public class Primenumber {

	public static void main(String[] args) {

		// prime number is greater than 1 and divide by 1 and itself.......
		// 0 and 1 are not a prime number and 2 is even prime number..........

		/*
		 * int n = 7; boolean prime =true;
		 * 
		 * for (int i= 2; i < n; i++) { if (n % i > 0) { prime = false; break;
		 * 
		 * } } System.out.println(prime);
		 */

		/*
		 * int n=22; boolean prime=true; for(int i=2;i<n;i++) { if(n%i==0) {
		 * prime=false; break; } } System.out.println(prime);
		 */
		/*
		 * int num = 15; int count = 0;
		 * 
		 * if (num > 1) { for (int i = 1; i < num; i++) { if (num % i == 0) { count++; }
		 * } if (count == 1) { System.out.println("prime number"); } else {
		 * System.out.println("not a primenumber"); } }
		 * 
		 */
		
		  
		  int num=13; 
		  int count=0; 
		  if(num>1) { 
			  for(int i=1;i<=num;i++) { 
				  if(num%i==0)
		  count++; } 
			  if(count==2) {
				  System.out.println("is a prime number"); } 
			  else {
		  System.out.println("not a prime number"); } 
			  }
		  else {
		  System.out.println("not a prime number "); }
		  
		 
	
	}
}