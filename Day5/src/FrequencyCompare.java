import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;


public class FrequencyCompare implements Comparator<Map.Entry<String, Integer>> {
	 public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
	        return e2.getValue()-e1.getValue();
	    }
}
