import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "nancyagrawal";
		System.out.println(firstUniqCharUsingHashMap(s));
		
	}
	
	/**
	 * Using HashSet and HashMap
	 * Time Complexity would be O(n)
	 * @param s
	 * @return
	 */
	public static int firstUniqCharUsingHashMap(String s) {

        HashSet<Integer> indicesSet = new HashSet<Integer>(s.length());
        for(int i=0; i<s.length(); i++){
            indicesSet.add(i);
        }
        
        HashMap<Character, Integer> lettersMap = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(lettersMap.containsKey(c)){
                indicesSet.remove(lettersMap.get(c));
                indicesSet.remove(i);
            } else 
                lettersMap.put(c, i);            
        }
        if(indicesSet.isEmpty())
            return -1;
        return Collections.min(indicesSet);
    }
	
}
