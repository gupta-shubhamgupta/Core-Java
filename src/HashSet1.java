import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("shubham");
		hs.add("gupta");
		hs.add("shubham");
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
