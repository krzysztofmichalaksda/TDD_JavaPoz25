package personal;
import org.junit.jupiter.api.Test;
import personal.person.Pesel;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PeselTest {

    @Test
    public void toShortPeselTest() {
        String toLongPesel = "901020123";
        assertThrows(
            StringIndexOutOfBoundsException.class,
            () -> new Pesel(toLongPesel)
        );
    }

    @Test
    public void toShortPeselTestNextAssertion() {
        String toLongPesel = "901020123";
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> new Pesel(toLongPesel));
    }

}