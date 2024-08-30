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
import org.junit.experimental.categories.Category;

import com.empower.demo.model.Mathematics;

/**
 * 
 */
public class MathematicsTest2 {

	int x=0;
	int y=0;
	int total=0;
	int minus=0;
	int multiply=0;
	
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
		x=4;
		y=5;
		total=9;
		multiply=20;
		minus=-1;
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
	@Category(Customer.class)
	public void testSum() {		
		int expected=total;
		int actuals=maths.sum(x, y);
		assertEquals(expected, actuals);
	}

	/**
	 * Test method for {@link com.empower.demo.model.Mathematics#difference(int, int)}.
	 */
	@Test
	@Category(Admin.class)
	public void testDifference() {
		int expected=minus;
		int actuals=maths.difference(x, y);
		assertEquals(expected, actuals);
	}

	/**
	 * Test method for {@link com.empower.demo.model.Mathematics#product(int, int)}.
	 */
	@Test
	@Category(Admin.class)
	public void testProduct() {
		int expected=multiply;
		int actuals=maths.product(x, y);
		assertEquals(expected, actuals);
		
	}

}
