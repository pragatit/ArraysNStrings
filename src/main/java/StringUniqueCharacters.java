import java.util.ArrayList;
import java.util.List;

public class StringUniqueCharacters {

    public boolean hasAllUniqueCharacters(final String string){
        return useBooleanArray(string);
    }

    private boolean useBooleanArray(final String string){
        boolean[] resultArray = new boolean[256];
        char[] chars = string.toCharArray();
        for (char ch : chars
             ) {
            if(resultArray[ch]){
                return false;
            }
            resultArray[ch] = true;
        }
        return true;
    }

    private boolean useBitwiseOperator(String string) {
        char[] stArr = string.toCharArray();
        int checker = 0;
        for (char ch: stArr
             ) {
            long intValue = (long)ch - 'a';
            if((checker & (1 << intValue)) > 0){
                return false;
            }
            checker |= (1 << intValue);
        }
        return true;
    }
}
