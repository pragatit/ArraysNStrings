import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUniqueCharactersTest {

    @Test
    public void shouldReturnTrue(){
        StringUniqueCharacters stringUniqueCharacters = new StringUniqueCharacters();
        boolean result = stringUniqueCharacters.hasAllUniqueCharacters("abcde");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse(){
        StringUniqueCharacters stringUniqueCharacters = new StringUniqueCharacters();
        boolean result = stringUniqueCharacters.hasAllUniqueCharacters("abcabc");
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueIfCaseDifferent(){
        StringUniqueCharacters stringUniqueCharacters = new StringUniqueCharacters();
        boolean result = stringUniqueCharacters.hasAllUniqueCharacters("abcABC");
        assertTrue(result);
    }

}