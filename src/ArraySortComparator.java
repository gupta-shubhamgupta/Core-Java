import java.util.Arrays;
import java.util.Comparator;
 class sort1 implements Comparator<ArraySortComparator>{
	public int compare(ArraySortComparator a, ArraySortComparator b) {
	//	return a.roll - b.roll;
	 if(a.roll>b.roll)
		 return 1;
	 else if(a.roll<b.roll)
		 return -1;
	 else
		 return 0;
	}
}
 class sort2 implements Comparator<ArraySortComparator>{
	 public int compare(ArraySortComparator a, ArraySortComparator b) {
		 return a.ame.compareTo(b.ame);
	 }
 }
public class ArraySortComparator {

	
		int roll;
		String ame;
		ArraySortComparator(int r, String n){
			roll=r;
			ame=n;
		}
		 
	
	public static void main(String []args) {
		ArraySortComparator arr[]=new ArraySortComparator[3];
		
		ArraySortComparator s1=new ArraySortComparator(1,"shubham");
		ArraySortComparator s2=new ArraySortComparator(4,"gupta");
		ArraySortComparator s3=new ArraySortComparator(3,"ok");
		
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		Arrays.sort(arr, new sort1());
		for(ArraySortComparator a : arr)
		System.out.println(a.ame+"  "+a.roll);
		
		
	}
}
