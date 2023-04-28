package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    public void testAdd(){
        myCalc = new Calculator();
        assertEquals(200, myCalc.add(100,100));
    }
    @Test
    public void testMinus(){
        myCalc = new Calculator();
        assertEquals(50, myCalc.minus(200,100));
    }
}
