
public class LongestSlice {

	static int a[] = {2,1, 2, 1, 2};
	//static int a[] = {1, 3, 2, 3, 2, 3, 1};
	//static int a[] = {1, 3, 2, 3, 2, 3, 1};
	//static int a[] = {1, 3, 2, 3, 2, 3, 1};
	//static int a[] = {1, 3, 2, 3, 2, 3, 1};
	
	
	
	public static void main(String[] args) {
		int ans = ls(a, 0, a.length-1);
		System.out.println(ans);
	}

	public static int ls(int[] a, int start, int end) {
		
		
		if(end-start <= 2) {
			return (end-start+1);
		}
		
		int mid = (end-start-1)/2;
		int max = Math.max(ls(a, start, mid), ls(a, mid, end));
		int left = mid-1;
		int right = mid + 1;
		int count = 0;
		int pivot = -1;
		do {
			System.out.println("l: " + left + " r: " + right + " s: " + start + " e: " + end);
			if(a[left] == a[right]) {
				left--;
				right++;
				max += 2;
				count++;
				if(count%2 == 0) {
					pivot = a[mid+1];
				} else {
					pivot = a[mid];
				}
			} else {
				return Math.max(max, Math.max(ls(a, start, mid), ls(a, mid, end)));
			}
		} while(right <= end && a[right] == pivot);
		
		if(right > end) {
			return (end-start);
		} else {
			return Math.max(max, Math.max(ls(a, start, mid), ls(a, mid, end)));
		}
	}
}
