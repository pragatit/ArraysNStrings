import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {

    public boolean isPermutationString(String str1, String str2) {
        if(str1.length() != str2.length())return false;

        List<Character> characters = new ArrayList<>();
        for (char ch: str1.toCharArray()
             ) {
            characters.add(ch);
        }
        for (char ch: str2.toCharArray()
             ) {
            characters.remove(Character.valueOf(ch));
        }
        return characters.size() == 0;
    }

}
