import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("shubham");
		list.add("gupta");
		list.add("shubham");
		System.out.println(list);
		LinkedHashSet<String> set=new LinkedHashSet<String>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
	}

}
