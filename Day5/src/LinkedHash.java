import java.util.*;
public class LinkedHash {

	public static void main(String[] args) {

		Set s=new HashSet();
		String s1="Chakri";
		String s2="Pavan";
		MyOwnClass moc1=new MyOwnClass("Chakri",21);
		MyOwnClass moc2=new MyOwnClass("Pavan",22);
		Integer a=1;
		Integer b=2;
		Integer c=3;
		s.add(s1);
		s.add(s2);
		s.add(moc1);
		s.add(moc2);
		s.add(a);
		s.add(b);
		s.add(c);
		
		System.out.println("For HashSet :");
		System.out.println(s);


        Set<Object> lhs = new LinkedHashSet<>();;
		lhs.add(s1);
		lhs.add(s2);
		lhs.add(moc1);
		lhs.add(moc2);
		lhs.add(a);
		lhs.add(b);
		lhs.add(c);
		System.out.println(lhs);
		
		List ls=new ArrayList();
		ls.add(s1);
		ls.add(s2);
		ls.add(moc1);
		ls.add(moc2);
		ls.add(a);
		ls.add(b);
		ls.add(c);
		System.out.println(ls);
		
	}



}
