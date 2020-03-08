import java.util.Arrays;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int a[]= {10,3,44,6,22,77,2};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		System.out.println(a[0]);
	}

}
