import java.util.HashMap;
import java.util.Map.Entry;

public class RansomNote {
	
	public static void main(String args[]) {
		String ransomNote = "aaac";
		String magazine = "aaaaabc";
		
		HashMap<Character, Integer> ransomMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
		
		for(Character l: ransomNote.toCharArray()) {
			if(ransomMap.containsKey(l))
                ransomMap.put(l, (ransomMap.get(l) + 1));
			else 
				ransomMap.put(l, 1);
		}
		
		for(Character l: magazine.toCharArray()) {
			if(magazineMap.containsKey(l))
				magazineMap.put(l, (magazineMap.get(l) + 1));
			else 
				magazineMap.put(l, 1);
		}
		
		for(Entry<Character, Integer> entry: ransomMap.entrySet()) {
			System.out.println("ransom key: " + entry.getKey() + " value: " + entry.getValue());
			
			if(!magazineMap.containsKey(entry.getKey())) {
				System.out.println("False and exit!!!!");
			} else {
				if(magazineMap.get(entry.getKey()) < entry.getValue()) {
					System.out.println("False and exit!!!!");
				}
			}
		}
		
		System.out.println("True!!");
		
		
	}

}
