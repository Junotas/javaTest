import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {


    @Test
    void twoPLusTwoShouldEqualFour() {

        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));


        /* assertNotEquals(4, calculator.add(2, 2));
        assertTrue(calculator.add(2, 2) == 4);
        assertFalse();
        assertNull();
        assertNotNull(); */

    }

    @Test
    void threePLusSevenShouldEqualTen() {

        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));
    }
}