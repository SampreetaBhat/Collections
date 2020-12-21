import java.util.*;
public class Create_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TreeSet <String> mv=new TreeSet<String>();
	mv.add("piku");
	mv.add("lunch box");
	mv.add("aptamitra");
	mv.add("ulidavaru kandante");
	mv.add("lunch box");
	//mv.add(null);
	System.out.println(mv);
	mv.remove("lunch box");
	System.out.println(mv);
	System.out.println(mv.size());
	 Iterator<String> itr=mv.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	

	}

}
