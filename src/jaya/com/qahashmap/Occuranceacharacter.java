package jaya.com.qahashmap;

public class Occuranceacharacter {

	public static void main(String[] args) {

		
		String str ="java#is#programming#language";
		int len=str.length();
		
		String s1=str.replaceAll("#", "");
		
		System.out.println(s1);
		int count=str.replace("a","").length();
		
		int total_count=len-count;
		System.out.println(total_count);
		
		
		
		
		
		
		
		
		
		
		
	}

}
