package pynnsilvania.JUnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTestingTest {


    NumberTesting numberTesting;

    @BeforeEach
    void setUp() throws Exception {
        this.numberTesting = new NumberTesting();
    }

    @Test
    void incrementNumber() {

        assertTrue(this.numberTesting.incrementNumber() == 1);
        assertTrue(this.numberTesting.incrementNumber() == 2);
        assertTrue(this.numberTesting.incrementNumber() == 3);

        assertEquals(4,this.numberTesting.incrementNumber());

    }

    @Test
    void decrementNumber() {

        assertTrue(this.numberTesting.decrementNumber() == -1);
        assertTrue(this.numberTesting.decrementNumber() == -2);
        assertTrue(this.numberTesting.decrementNumber() == -3);

        assertEquals(-4,this.numberTesting.decrementNumber());
    }
}