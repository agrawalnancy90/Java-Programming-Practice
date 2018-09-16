
public class FirstAndLastPositionInSortedArray {
	public static void main(String[] args) {
		
		int[] nums = {1,2,  3,  3,3  ,3,4,5,9};		
		int[] res = searchRange(nums, 3);
		System.out.println(res[0] + " " + res[1]);		
	}
	
	public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) {
        	return new int[] {-1, -1};
        }
        if(nums.length == 1) {
        	if(nums[0] == target) {
        		return new int[] {0, 0};
        	} else {
        		return new int[] {-1, -1};
        	}
        }
        
        return search(nums, target, 0, nums.length - 1, -1, -1);
    }
	

	public static int[] search(int[] nums, int target, int start, int end, int startIndex, int endIndex) {
		
		if(start >= nums.length) {
			return new int[] {startIndex, endIndex};
		}
		
		//only one element to consider
		if(end == start) {
			if(nums[start] == target) {
				if(startIndex == -1 || startIndex > start) {
					startIndex = start;
				}
				if(endIndex == -1 || endIndex < end) {
					endIndex = end;
				}
			}
			
			return new int[] {startIndex, endIndex};
		}
		
			
		int mid = (start + end)/2;
		//Need work on left side? 
		if(nums[mid] >= target) {
			//left side
			int[] ans = search(nums, target, start, mid, startIndex, endIndex);
			startIndex = ans[0];
			endIndex = ans[1];
		}

		if((mid+1) < nums.length && nums[mid+1] <= target) {
			//right side
			int[] ans = search(nums, target, mid+1, end, startIndex, endIndex);
			startIndex = ans[0];
			endIndex = ans[1];
		}
		
		return new int[] {startIndex, endIndex};
	}
}
