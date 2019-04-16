package com.jiyun0524.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2,3));
	}
	
	public void testSub() {
                assertEquals(5, calculator.sub(2,3));
        }
	
	public void testMul() {
                assertEquals(5, calculator.mul(2,3));
        }

	public void testDiv() {
                assertEquals(5, calculator.div(2,3));
        }


}
