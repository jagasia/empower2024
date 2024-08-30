/**
 * 
 */
package com.empower.demo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.empower.demo.model.Mathematics;

/**
 * 
 */
public class MathematicsTest {

	int x=0;
	int y=0;
	
	Mathematics maths=null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		x=2;
		y=3;
		maths=new Mathematics();
		System.out.println("Before method is executed");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After method");
	}
	

	/**
	 * Test method for {@link com.empower.demo.model.Mathematics#sum(int, int)}.
	 */
	@Test
	public void testSum() {		
		int expected=5;
		int actuals=maths.sum(x, y);
		assertEquals(expected, actuals);
	}

	/**
	 * Test method for {@link com.empower.demo.model.Mathematics#difference(int, int)}.
	 */
	@Test
	public void testDifference() {
		int expected=-1;
		int actuals=maths.difference(x, y);
		assertEquals(expected, actuals);
	}

	/**
	 * Test method for {@link com.empower.demo.model.Mathematics#product(int, int)}.
	 */
	@Test
	public void testProduct() {
		int expected=6;
		int actuals=maths.product(x, y);
		assertEquals(expected, actuals);
	}

}
