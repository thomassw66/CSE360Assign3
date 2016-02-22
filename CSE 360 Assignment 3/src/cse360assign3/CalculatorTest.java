package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator c = new Calculator();
		assertNotNull(c);
	}

	@Test
	public void testGetTotal () {
		Calculator calculator = new Calculator();
		assertEquals(calculator.getTotal(), 0);
		
		calculator.add(6);
		assertEquals(calculator.getTotal(), 6);
	}

	@Test
	public void testAdd () {
		Calculator calculator = new Calculator();
		
		calculator.add(20);
		assertEquals(calculator.getTotal(), 20);

		calculator.add(30);
		assertEquals(calculator.getTotal(), 50);
	}

	@Test
	public void testSubtract () {
		Calculator calculator = new Calculator();
		assertEquals(calculator.getTotal(), 0);
		
		calculator.subtract(5);
		assertEquals(calculator.getTotal(), -5);
		
		calculator.subtract(1);
		assertEquals(calculator.getTotal(), -6);
	}

	@Test
	public void testMultiply () {
		Calculator calculator = new Calculator();
		
		calculator.multiply(5);
		assertEquals(calculator.getTotal(), 0);
		
		calculator.add(1); 
		calculator.multiply(2);
		assertEquals(calculator.getTotal(), 2);
		
		calculator.multiply(12);
		assertEquals(calculator.getTotal(), 24);
		
		calculator.multiply(-2);
		assertEquals(calculator.getTotal(), -48);
	}

	@Test
	public void testDivide () {
		Calculator calculator = new Calculator();
		
		calculator.divide(3);
		assertEquals(calculator.getTotal(), 0);
		
		calculator.add(10);
		calculator.divide(2);
		assertEquals(calculator.getTotal(), 5);
		
		calculator.divide(3);
		assertEquals(calculator.getTotal(), 1);
		
		calculator.divide(0);
		assertEquals(calculator.getTotal(), 0);
	}

	@Test
	public void testGetHistory () {
		Calculator myCalculator = new Calculator();
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.multiply (2); 
		myCalculator.add(5);
		assertEquals(myCalculator.getHistory(), "0 + 4 - 2 * 2 + 5");
	}
}
