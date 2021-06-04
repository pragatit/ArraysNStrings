public class PalindromePermutation {
    public boolean isPalindromePermutation(String testStr) {
        char[] charArray = testStr.toLowerCase().trim().toCharArray();
        int bitChecker = 0;
        for (char ch: charArray
             ) {
            if(ch != ' ') {
                int current = 1 << (ch - 'a');
                bitChecker ^= current;
            }
        }
        if(bitChecker == 0) return true;
        else {
            return ((bitChecker - 1) & bitChecker) == 0;
        }
    }
}