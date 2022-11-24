import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculationsTest {
    Calculations calculations;
    @BeforeEach
    void setUp() {
        calculations = new Calculations();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assertEquals(9, calculations.calc(4, 5),
                "Regular multiplication should work");
    }
}
