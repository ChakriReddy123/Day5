import java.util.*;
public class OwnHashSet {

	public static void main(String[] args) {

		Set s=new HashSet(5);
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
		System.out.println(s);
	}

}
