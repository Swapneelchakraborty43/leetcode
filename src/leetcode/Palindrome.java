package leetcode;

public class Palindrome {

	public static boolean isPalindrome(int x) {
		int sum = 0;
		int num = x;
		while (x > 0) {

			int mod = x % 10;
			sum = sum * 10 + mod;
			x = x / 10;
		}
		//System.out.println(sum);
		if(num==sum) {
		return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Boolean x = isPalindrome(121);
		System.out.println(x);
		System.out.println(5==3);
	}
	
}
