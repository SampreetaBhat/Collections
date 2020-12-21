import java.util.*;
public class Create_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		System.out.println(hs);
		hs.add("black");
		hs.add("blue");
		hs.add("red");
		hs.add("blue");
		hs.add("white");
		System.out.println(hs);
		hs.remove("red");
		for(String clr:hs)
			System.out.println(clr);
		System.out.println(hs.size());
		
		

	}

}
