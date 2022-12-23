//package com.training.junit;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertAll;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@SpringBootTest
//public class CalculatorServiceTest {
//	
//	@Autowired
//	CalculatorService serviceObj;
//	static int beforeClassCount=0;
//	static int afterClassCount=0;
//	static int beforeCount=0;
//	static int afterCount=0;
//	
//	
//	    @Before
//	    public void setUp() {
//	    	System.out.println("Execution count of before method is: "+ ++beforeCount);
//	    }
//	    
//	    @BeforeClass
//	    public static void setUpClass() {
//	    	System.out.println("Execution count of beforeClass method is: "+ ++beforeClassCount);
//	    }
//	
//	    @Test
//	    public void twoAndThreeFive() throws Exception {
//	        final long result = new CalculatorService().add(2, 3);
//	        assertAll("Checking if result is 5L, not 0L and Not null, in a assertAll group",
//	        () -> assertEquals(result, 5L),
//	        () -> assertNotEquals(result,0L),
//	        () -> assertNotNull(result));
////	        
////	        assertEquals(result, 5L);
////	        assertNotEquals(result,0L);
////	        assertNotNull(result);
//	    }
//
//		@Test
//	    public void twoAndZeroTwo() throws Exception {
//	        final long result = new CalculatorService().add(2, 0);
//	        assertEquals(result, 2L);
//	    }
//
//	    @Test
//	    public void twoAndMinusTwoZero() throws Exception {
//	        final long result = new CalculatorService().add(2, -2);
//	        assertEquals(result, 0L);
//	    }
//
//	    @Test
//	    public void threeMinusTwoOne() throws Exception {
//	        final long result = new CalculatorService().subtract(3, 2);
//	        assertEquals(result, 1L);
//	    }
//
//	    @Test
//	    public void threeMinusThreeZero() throws Exception {
//	        final long result = new CalculatorService().subtract(3, 3);
//	        assertEquals(result, (0L));
//	    }
//
//	    @Test
//	    public void threeMinusMinusThreeSix() throws Exception {
//	        final long result = new CalculatorService().subtract(3, -3);
//	        assertEquals(result, (6L));
//	    }
//
//	    @Test
//	    public void threeXThreeNine() throws Exception {
//	        final long result = new CalculatorService().multiply(3, 3);
//	        assertEquals(result, (88L));
//	    }
//
//	    @Test
//	    public void threeXZeroZero() throws Exception {
//	        final long result = new CalculatorService().multiply(3, 0);
//	        assertEquals(result, (0L));
//	    }
//
//	    @Test
//	    public void threeXMinusThreeMinusNine() throws Exception {
//	        final long result = new CalculatorService().multiply(3, -3);
//	        assertEquals(result, (-9L));
//	    }
//	    
//	    @After
//	    public void tearDown() {
//	    	System.out.println("Execution count of after method is: "+ ++afterCount);
//	    }
//	    
//	    @AfterClass
//	    public static void tearDownClass() {
//	    	System.out.println("Execution count of afterClass method is: "+ ++afterClassCount);
//	    }
//
//}
