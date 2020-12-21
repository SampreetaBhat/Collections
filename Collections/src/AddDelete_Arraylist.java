import java.util.*;
public class AddDelete_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("grapes");
		System.out.println(fruits);
		fruits.remove("apple");
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);

	}

}
