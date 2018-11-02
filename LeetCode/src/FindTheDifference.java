
public class FindTheDifference {

	public static void main(String[] args) {
		String s = "Hello World!";
		String t = "WHelool eldr!";
		System.out.println(findTheDifference(s, t));

	}

	public static char findTheDifference(String s, String t) {
        int result = 0;
        char[] tArray = t.toCharArray();
        for(char c: tArray){
            result ^= c;
        }
        char[] sArray = s.toCharArray();
        for(char c: sArray){
            result ^= c;
        }
        return (char)result;
    }


}
