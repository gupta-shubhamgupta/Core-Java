import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");    
	      //Invoking arraylist object   
	       
	      ArrayList<String> list1=new ArrayList<String>();
	      list1.add("Ravi1");//Adding object in arraylist    
	      list1.add("Vijay1");
	      
	      list.addAll(list1);
	      System.out.println(list.isEmpty());
	      System.out.println(list);
	      
	      ArrayList<String> list2=new ArrayList<String>();
	      list2 = (ArrayList)list.clone();
	      System.out.println(list2);
	      
	      System.out.println(list.subList(0, 4));
	}

}
