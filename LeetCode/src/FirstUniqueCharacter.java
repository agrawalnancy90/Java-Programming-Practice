import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "nancyagrawal";
		System.out.println(firstUniqCharWithHashMapAndHashSet(s));
		System.out.println(firstUniqCharWithHashMap(s));
		
		
	}
	
	/**
	 * Using HashSet and HashMap
	 * Time Complexity would be O(n)
	 * @param s
	 * @return
	 */
	public static int firstUniqCharWithHashMapAndHashSet(String s) {

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
	
	
	/**
	 * Using only HashMap
	 * Time Complexity would still be O(n) but practically faster.
	 * @param s
	 * @return
	 */
	public static int firstUniqCharWithHashMap(String s) {
        if(s.isEmpty())
            return -1;
        
        HashMap<Character, Integer> lettersMap = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(lettersMap.containsKey(c))
                lettersMap.put(c, s.length());
            else 
                lettersMap.put(c, i);            
        }
        
        int minIndex = Collections.min(lettersMap.values());
        if(minIndex == s.length())
            return -1;
        return minIndex;
    }
	
}
