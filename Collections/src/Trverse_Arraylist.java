import java.util.*;
public class Trverse_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add(4,"grapes");
		fruits.add(" ");
		System.out.println(fruits);
		System.out.println(fruits.get(2));// to get a particular element using index valu
		for(String hannu:fruits) 
		System.out.println(hannu);
		System.out.println(fruits.size());// to get the size of the ArrayList
		Collections.sort(fruits);// to sort the elements
		System.out.println(fruits);
		
 
	}

}
