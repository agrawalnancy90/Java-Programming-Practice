
public class TrailingZerosInFactorial {
	
	public static void main(String args[]) {
		System.out.println(trailingZeroes(25));
		
	}
	
	public static int trailingZeroes(int n) {
        int zeroes = 0;
        if(n <= 4) {
        	return zeroes;
        }
		
		for(int i = 5; i<=n; i+=5) {
        	int num = i;
        	while(num > 4) {
        		if(num % 5 == 0) {
        			++zeroes;
        			num /= 5;
        		} else {
        			break;
        		}
        	}
        }
		return zeroes;
		
    }

}
