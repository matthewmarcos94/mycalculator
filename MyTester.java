import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void testAddFloatPositive() {
		MyCalculator calc = new MyCalculator();
		float actual = calc.add(1, 2);
		assertEquals("1 + 2 = 3", 3, actual, 0.0);
		
	}
	
	@Test
	public void testAddFloatNegative() {
		MyCalculator calc = new MyCalculator();
		float actual = calc.add(-1, -2);
		assertEquals("-1 + -2 = -3", -3, actual, 0.0);
		
	}
	
	@Test
	public void testAddFloatOnePositive() {
		MyCalculator calc = new MyCalculator();
		float actual = calc.add(1, -2);
		assertEquals("1 + -2 = -1", -1, actual, 0.0);
		
	}

	@Test
	public void testSubtract() {
	}

	@Test
	public void testMultiply() {
	}

	@Test
	public void testDivide() {
	}

	@Test
	public void testSquare() {
	}

	@Test
	public void testCube() {
	}

	@Test
	public void testNfactorial1() {
		MyCalculator calc = new MyCalculator();
		assertEquals("5! = 120", 120, calc.nfactorial(5), 0);
	}

	@Test
	public void testNfactorial2() {
		MyCalculator calc = new MyCalculator();
		assertEquals("0! = 1", 1, calc.nfactorial(0), 0);
	}
	
	@Test
	public void testNfactorial3() {
		MyCalculator calc = new MyCalculator();
		assertEquals("1! = 1", 1, calc.nfactorial(1), 0);
	}
	
	@Test
	public void testBinarySearch1() {
		// Must be able to find all 5 values
		MyCalculator calc = new MyCalculator();
		int testCase[] = new int[5];
		for(int i = 0 ; i < 5 ; i++) testCase[i] = i;
		for(int i = 0 ; i < 5 ; i++)
			assertEquals("Find all", i, calc.binarySearch(testCase, i), 0);
		
	}
	
	@Test
	public void testBinarySearch2() {
//		Must be able to return -1 if value does not exist in the array
		MyCalculator calc = new MyCalculator();
		int[] testCase = {0, 1, 2};
		
		assertEquals("Value is not in array", -1, calc.binarySearch(testCase, 5), 0);
		
		
	}

}
