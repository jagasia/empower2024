package com.empower.demo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.empower.demo.model.Mathematics;

@RunWith(Parameterized.class)
public class MathematicsTest {
	Mathematics maths=null;
	
	int no1, no2, expectedResult;
	
	public MathematicsTest(int no1, int no2, int expectedResult)
	{
		this.no1=no1;
		this.no2=no2;
		this.expectedResult=expectedResult;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		maths=new Mathematics(no1, no2, expectedResult);
		System.out.printf("Running the test using %d, %d, %d\n",no1, no2, expectedResult);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		int actual = maths.sum();
		assertEquals(actual, expectedResult);
	}

	@Parameterized.Parameters
	public static Collection anything()
	{
		return Arrays.asList(new Object[][] {
			 { 2, 3, 5 },
	         { 6, 3, 9 },
	         { 19, 1, 20 },
	         { 22, 1, 23 },
	         { 23, 1, 24 },
	         {1,2,3},
	         { 2, 11, 13 },
	         { 21, 1, 22 }
		});
	}
	
}
