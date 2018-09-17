	/* The guess API is defined in the parent class GuessGame.
	   @param num, your guess
	   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
	      int guess(int num); */

public class GuessNumber {
	
		public static void main(String args[]) {
			System.out.println(guessNumber(10));
		}

		public static int guessNumber(int n) {
	        int low = 1;
	        int high = n;
	        while(low <= high){
	            int mid = low + (high-low)/2;
	            int res = 0; // = guess(mid); //res = guess(mid);
	            
	            if(res > 0){
	                low = mid + 1;
	            }
	            
	            if(res < 0){
	                high = mid - 1;
	            }
	            
	            if(res == 0){
	                return mid;
	            }
	        }
	        return -1;
	                
	    }

}
