import java.util.*;
public class Create_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> city=new LinkedList<String>();
		System.out.println(city);
		city.add("Delhi");
		city.add("Kolkata");
		city.add("bengaluru");
		city.add("karwar");
		city.add(" ");
		city.add(2,"karwar");
		System.out.println(city);
		city.remove("karwar");
		System.out.println(city);
		System.out.println(city.remove(1));
		System.out.println(city);
		System.out.println(city.get(3));
		System.out.println(city.size());
		for(String ooru:city)
			System.out.println(ooru);
		

	}

}
