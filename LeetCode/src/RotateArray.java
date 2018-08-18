
public class RotateArray {
	
	public static void main(String[] args) {
		int[] nums = {1,2, 3,4, 5,6,7};
		int k = 3;
		rotate(nums, k);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}

	public static void rotate(int[] nums, int k) {
		if(k <= 0)
			return;
		
		k %= nums.length;
		//right bag - n-k to n-1
		int n = nums.length;
		reverse(nums, n-k, n-1);
		//left bag - 0 to n-k-1
		reverse(nums, 0, n-k-1);
		//reverse the entire thing
		reverse(nums, 0, n-1);
		
	}
	
	public static void reverse(int[] nums, int start, int end) {
		int j = end;
		for(int i=start; i<j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	
}
