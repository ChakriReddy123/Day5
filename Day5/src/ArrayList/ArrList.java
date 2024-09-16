package ArrayList;
import java.util.*;
public class ArrList {

	public static void main(String[] args) {

		List<Integer> ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(1);
		ls.add(5);
		ls.add(1);
		ls.add(5);
		ls.add(15);
		ls.add(61);
		ls.add(76);
		ls.add(12);
		ls.add(6);
		System.out.println("The odd numbers are ");
		for(Integer i: ls) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int min=Collections.min(ls);
		System.out.println("The min element is : "+min);
		Collections.sort(ls.reversed());
		System.out.println("The descending order is : "+ls);
		
	}

}
