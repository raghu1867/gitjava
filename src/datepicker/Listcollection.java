package datepicker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Listcollection {

	public static void main(String[] args) {
//list
		/*
		 * List<String>list=new ArrayList<String>(); list.add("apple");
		 * list.add("apple"); list.add("mango");
		 * 
		 * 
		 * 
		 * for(String st:list) { System.out.println(st); }
		 * 
		 */

		/*
		 * //how to convert array to list String []arr= {"apple","mango","guva"};
		 * 
		 * //System.out.println((Arrays.toString(arr)));
		 * 
		 * 
		 * 
		 * List<String>lst=new ArrayList<String>();
		 * 
		 * lst.add("apple"); lst.add("mango"); lst.add("guva");
		 * 
		 * for(String str1:arr) { lst.add(str1); }
		 * 
		 * System.out.println(lst);
		 */
		
		
		/*
		 * List<String>lst=new ArrayList<String>();
		 * 
		 * lst.add("apple"); lst.add("mango"); lst.add("guva"); System.out.println(lst);
		 * 
		 * 
		 * 
		 */
		
		List<String>city=Arrays.asList("ap","ts","tn","hyd");
		Iterator<String>str=city.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
