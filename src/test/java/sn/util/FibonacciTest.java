package sn.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void test1stFibonocci(){
		Fibonacci fibonacci = new Fibonacci();
		
		int result = fibonacci.get(1);
		
		assertEquals("Incorrect value of 1st Fibonacci", 0, result);
	}
	
	@Test
	public void test2ndFibonocci(){
		Fibonacci fibonacci = new Fibonacci();
		
		int result = fibonacci.get(2);
		
		assertEquals("Incorrect value of 2nd Fibonacci", 1, result);
	}
	
	@Test
	public void test3rdFibonocci(){
		Fibonacci fibonacci = new Fibonacci();
		
		int result = fibonacci.get(3);
		
		assertEquals("Incorrect value of 3rd Fibonacci", 1, result);
	}
	
	@Test
	public void test4thFibonocci(){
		Fibonacci fibonacci = new Fibonacci();
		
		int result = fibonacci.get(4);
		
		assertEquals("Incorrect value of 4th Fibonacci", 2, result);
	}
	
	@Test
	public void test46thFibonocci(){
		Fibonacci fibonacci = new Fibonacci();
		
		int result = fibonacci.get(47);
		
		assertEquals("Incorrect value of 46th Fibonacci", 1836311903   , result);
	}
	
	@Test (expected = java.lang.IllegalArgumentException.class)
	public void testBelowLowerBound(){
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.get(0);
	}
	
	
	@Test (expected = java.lang.IllegalArgumentException.class)
	public void testAboveUpperBound(){
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.get(48);
	}
}
