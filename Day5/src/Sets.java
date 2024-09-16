import java.util.*;
public class Sets {
		public static void main(String[] args) {
			Set<Integer> s=new HashSet<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements you want to enter :");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("enter number "+(i+1) +" :");
				s.add(sc.nextInt());
			}
			Iterator<Integer> iter= s.iterator();
			System.out.println("The numbers you have entered :");
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
		}
}
