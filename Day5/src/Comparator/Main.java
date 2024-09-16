package Comparator;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		List<Student> ls=new ArrayList<Student>();
		Student s1=new Student("Chakri",100);
		Student s2=new Student("Harsha",90);
		Student s3=new Student("Mahesh",80);
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		Collections.sort(ls,new SalaryComparator());
		System.out.println(ls);
	} 

}
