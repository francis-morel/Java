package Eclipse;

import java.util.Map;
import java.util.TreeMap;

public class TotalStringLetters {
    public static void main(String[] args) {
    
        //Map characterMap = countCharacter("hello this is a very cool string");
        System.out.println(countCharacter("ttttt"));
        
    }

    public static Map countCharacter(String str) {
        Map m = new TreeMap();
        
        for (char letter : str.toCharArray()) {
            if (m.containsKey(letter)) {
                m.put(letter, (int)m.get(letter) + 1);
            } else {
                m.put(letter, 1);
            }

            m.remove(' ');
            
        }

        return m;
    }
}