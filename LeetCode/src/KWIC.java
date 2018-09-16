import java.util.TreeSet;

public class KWIC {
	
	public static void main(String[] args) {
		String[] lines = {"comparisons programming languages either take", 
				"the form religious wars undergraduate", 
				"textbooks determinedly neutral that they"};
		
		System.out.println("Input:");
		int i = 1;
		for(String s: lines) {
			System.out.println("Line " + i + ": " + s);
			i++;
		}
		
		TreeSet<String> output = new TreeSet<String>();
		
		for(String s: lines) {
			String[] words = s.split(" ");
			for(int j=0; j<5; j++) {
				String val = "";
				for(int k=j; k<j+5; k++) {
					val += words[k%5] + " ";
				}
				output.add(val);
			}
		}
		
		System.out.println("Output:");
		for(String s: output) {
			System.out.println(s);
		}
		
		
	}
	

}
