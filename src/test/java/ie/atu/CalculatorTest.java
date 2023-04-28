package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    @Test
    public void testAdd(){
        myCalc = new Calculator();
        assertEquals(200, myCalc.add(100,100));
    }
    @Test
    public void testMinus(){
        myCalc = new Calculator();
        assertEquals(100, myCalc.minus(200,100));
    }
    @Test
    public void testMultiply(){
        myCalc = new Calculator();
        assertEquals(100, myCalc.multiply(10,10));
    }

    @Test
    public void testDivide(){
        myCalc = new Calculator();
        assertEquals(10, myCalc.divide(100,10));
    }
}
