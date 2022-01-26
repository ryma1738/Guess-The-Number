
import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void guessRight() {
        assertEquals("true", App.guess(6, 6));
    }

    @Test
    public void guessHigh() {
        assertEquals("You guess is too high.", App.guess(5, 20));
    }

    @Test
    public void guessLow() {
        assertEquals("You guess is too low.", App.guess(20, 5));
    }
}
