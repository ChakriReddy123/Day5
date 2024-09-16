import java.util.*;
public class TopNFrequency {

	public static void main(String[] args) {
		 List<String> words = Arrays.asList(
		            "apple", "banana", "apple", "orange", "banana", "apple",
		            "kiwi", "banana", "grape", "kiwi", "grape", "banana",
		            "pear", "orange", "apple"
		        );
		 Scanner sc=new Scanner(System.in);
		 
		 
		 int n=sc.nextInt();
		 HashMap<String,Integer> hs=new HashMap<>();
		 for(String s: words) {
			 if(!hs.containsKey(s)) {
				 hs.put(s, 1);
			 }
			 else {
				 hs.put(s, hs.get(s)+1);
			 }

		 }
		List<Map.Entry<String,Integer>> ls1=new ArrayList<>(hs.entrySet());
		ls1.sort(new FrequencyCompare());
		
		for(Map.Entry<String,Integer> m: ls1) {
			if(n>0) {
			System.out.println(m.getKey() + " ---- "+m.getValue());
			}
			n--;
		}
		 
	}

}
