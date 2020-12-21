import java.util.*;
public class Create_linkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> dress=new LinkedHashSet<String>();
		System.out.println(dress);
		dress.add("kurta");
		dress.add("ghghra");
		dress.add("saari");
		dress.add("kurta");
		dress.add("lehenga");
		System.out.println(dress);
		dress.remove("lehenga");
		for(String angi:dress)
			System.out.println(angi);
		System.out.println(dress.size());
		
		
		

	}

}
