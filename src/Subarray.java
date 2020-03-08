
public class Subarray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					count=count+arr[k];
					
				}
				System.out.print(count);
				System.out.println();
				count=0;
			}
			
		}

	}

}
