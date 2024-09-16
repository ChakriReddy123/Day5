import java.util.*;
public class FloatSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Float> s=new HashSet<>();
		s.add(1.5f);
        s.add(2.7f);
        s.add(3.3f);
        float sum=0f;
        Iterator<Float> iter=s.iterator();
        while(iter.hasNext()) {
        	sum=sum+iter.next();
        }
        System.out.println("The sum of the float variables is :"+sum);
	}

}
