package one;

public class StrinPalin {

	public static void main(String[] args) {
		String str[]= {"1254","4556","75657","8875788"};
		for(int i=0;i<str.length;i++) {
			int k=Integer.parseInt(str[i]);
			int n=k;
			int reverse=0;
			while(n>0) {
				int r=n%10;
				reverse=(reverse*10)+r;
				n=n/10;
			}
			if(reverse==k) {
				System.out.println(k+" is a Palindrome");
			}
			else {
				System.out.println(k+" is not a Palindrome");
			}
			
		}

	}

}