
public class DublicateElementArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,5,2};
		String s="hsdjh";
		int b=s.length();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
