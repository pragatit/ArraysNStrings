import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyStringTest {

    private URLifyString urLifyString = new URLifyString();

    @Test
    public void shouldReturnURLifiedString(){
        assertEquals("Mr%20John%20Smith", urLifyString.urlify("Mr John Smith    ", 13));
    }

}