
public class TwoSumSorted {
	
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		int[] sol = twoSum(nums, target);
		if(sol.length > 1) {
			System.out.println("[" + sol[0] + ", " + sol[1] + "]");
		}
		
	}

	
	public static int[] twoSum(int[] numbers, int target) {
        for(int e=numbers.length - 1, s=0; e>s;){
            if(numbers[e] + numbers[s] > target){
                s=0;
                e--;
                continue;
            }
            if(numbers[e] + numbers[s] == target){
                return new int[] {s+1, e+1};
            }
            ++s;
        }
        
        throw new IllegalArgumentException("No solution");
    }
}
