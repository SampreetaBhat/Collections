import java.util.*;
public class Create_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> clr = new HashMap<Integer,String>();
		System.out.println(clr);
		clr.put(1, "One");
	    clr.put(2, "Two");
	    clr.put(3, "Three");
	    clr.put(4, "Four");
	    System.out.println(clr.put(4, "Four"));//
	    clr.put(4, "six");//if key is already present in the map put method replaces the old value with new one and returns old value 
	    clr.put(5, "Four");
	    System.out.println(clr);
	    System.out.println(clr.get(1));
	    clr.remove(1);
	    clr.remove(2,"Two");
	    for(Map.Entry<Integer, String> entry : clr.entrySet()) {
	        System.out.println(entry.getKey()+" : "+entry.getValue());
	      }
	    System.out.println(clr.size());

	}
	//containsKey();
	//containsValue();
	//isEmpty();
	//putAll(Map m);

}
