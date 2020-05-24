package personal;
import org.junit.jupiter.api.Test;
import personal.person.Pesel;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PeselTest {

    @Test
    public void toShortPeselTest() {
        String toShortPesel = "901020123";
        assertThrows(
            StringIndexOutOfBoundsException.class,
            () -> new Pesel(toShortPesel)
        );
    }

    @Test
    public void toShortPeselTestNextAssertion() {
        String toLongPesel = "901020123";
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> new Pesel(toLongPesel));
    }

    @Test
    public void isCorrectPositive() throws Exception {
        Pesel pesel = new Pesel("91022406132");
        assertTrue(pesel.isCorrect());
    }

    @Test
    public void isCorrectNegative() throws Exception {
        Pesel pesel = new Pesel("91022406137");
        assertFalse(pesel.isCorrect());
    }

}