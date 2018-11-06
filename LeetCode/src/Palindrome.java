/**
 * This class deals with all questions involving palindromes.
 * @author nancy
 *
 */
public class Palindrome {
	
	public static void main(String[] args) {
		//Question 1: Find if string is palindromic ignoring case and only consider alphanumeic.
		String s = ".,";
		System.out.println(isPalindrome(s));
	}
	
	 public static boolean isPalindrome(String s) {
		 if(s.length() == 0) {
			return true; 
		 }
	     char[] c = s.toLowerCase().toCharArray();
		 int i = 0; 
		 int j = c.length - 1;
		 while(j > i) {
			 while(i < c.length && !Character.isLetterOrDigit(c[i]))
				 ++i;
			 while(j > 0 && !Character.isLetterOrDigit(c[j]))
				 --j;
			 if(j >= i && c[i] != c[j])
				 return false;
			 i++;
			 j--;

		 }
		 
		 return true;
		 	
	        
	        
	 }

}
