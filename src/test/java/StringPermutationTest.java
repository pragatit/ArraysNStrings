import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationTest {

    private StringPermutation permutation = new StringPermutation();

    @Test
    public void shouldReturnTrue(){
        boolean result = permutation.isPermutationString("abcdef", "dcefba");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse(){
        boolean result = permutation.isPermutationString("abcdef", "ghijkl");
        assertFalse(result);
    }

}