import java.util.*;
public class StringSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<>();
		s.add("Chakri");
		s.add("Pavan");
		s.add("Hemanth");
		s.add("prathik");
		Iterator<String> iter=s.iterator();
		String res="";
		while(iter.hasNext()) {
			res=res+iter.next();
		}
		System.out.println("The resulting Concatenated String : "+res);
	}

}
