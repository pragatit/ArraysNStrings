import org.junit.Assert;
import org.junit.Test;

public class PalindromePermutationTest {

    PalindromePermutation palindromePermutation = new PalindromePermutation();

    @Test
    public void shouldReturnTrue(){
        Assert.assertTrue(palindromePermutation.isPalindromePermutation("Ta ct Coa"));
    }
}
