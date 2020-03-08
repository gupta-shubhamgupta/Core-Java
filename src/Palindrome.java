class Palindrome{
	static boolean par(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String []args) {
		//String st="ABCCAA";
		int a=121;
		String st=String.valueOf(a);
		if(par(st)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}