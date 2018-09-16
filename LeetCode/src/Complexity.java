
public class Complexity {

	public static void main(String[] args) {
		int nArr[] = {10, 20, 100};
		for(int n: nArr) {
			f(n);
		}
		
	}
	
	public static void f(int n) {
		int s = 0;
		double i = 5;
		double count=0;
		double upperi = Math.pow(n, 2) + 7;
		while(i < upperi) {
			for(double j=i; j<(Math.pow(i, 3)*Math.log(i)); j++) {
				s++;
				++count;
			}
			System.out.println("i: " + i);
			i*=4;
		}
		
		double theta = Math.pow(n, 6)*Math.log(n);
		System.out.println("Theta: " + theta + " count: " + count + " count/theta: " + (count/theta));
	}
}
