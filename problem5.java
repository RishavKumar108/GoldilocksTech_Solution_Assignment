// Write a program to store the value in Hashmap (key, store) and then
// search those given value from the hashmap and print it.
// a. Name is key and age is value so store some sample values like
// i. (Ram, 36), (shyam,60)

// Time Using : 10 min
import java.util.HashMap;
public class KeyValueExample {

	public static void main(String[] args) {
		
		 HashMap<String, Integer> map = new HashMap<>();
		 
	     map.put("Rishav", 23);
	     map.put("Rohit", 28);
	       
	      String[] str = {"Rishav","Rohit","Mayank"};
	       
	       for(String s:str) {
	    	   if(map.containsKey(s)) {
	    		   int age = map.get(s);
	    		   System.out.println(s +" is "+ age+ " year old.");
	     	   }else {
	     		  System.out.println(s +" is not found in HashMap.");
	     	   }
	       }
	}

}
