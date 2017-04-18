

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class FinalPracticeUnitTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FinalPracticeUnitTests
{
    /**
     * Convert Fahrenheit to Celcius
     */
    @Test
    public void Test1FahrenheitToCelciusCalc()
    {
        assertEquals(0, Helper.FahrenheitToCelsius(32), 0.01);
        assertEquals(5, Helper.FahrenheitToCelsius(41), 0.01);
        assertEquals(10, Helper.FahrenheitToCelsius(50), 0.01);
        assertEquals(20, Helper.FahrenheitToCelsius(68), 0.01);
    }

    /*
     * Check if a temperature is above, below or at freezing
     */
    @Test
    public void Test2Freezing()
    {
    	assertEquals("at freezing", Helper.isFreezing(32));
    	assertEquals("below freezing", Helper.isFreezing(0));
    	assertEquals("below freezing", Helper.isFreezing(20));
    	assertEquals("above freezing", Helper.isFreezing(40));
    	assertEquals("above freezing", Helper.isFreezing(100));
    }
    
    /*
     * Find the smallest number that is divisible by both the given numbers.
     */
    @Test
    public void Test3FindSmallestNumberDivisible()
    {
    	assertEquals(24, Helper.SmallestNumberDivisibleBy(6, 8));
    	assertEquals(40, Helper.SmallestNumberDivisibleBy(10, 8));
    	assertEquals(30, Helper.SmallestNumberDivisibleBy(6, 10));
    }
    
    /*
     * Find the range of an array
     */
    @Test
    public void Test4FindArrayRange()
    {
    	double[] values1 = {0.0, 10.0};
    	assertEquals(10.0, Helper.FindRange(values1), 0.01);
    	double[] values2 = {1.0, 2.0, 3.0, 4.0};
    	assertEquals(3.0, Helper.FindRange(values2), 0.01);
    	double[] values3 = {5.0, 1.0, -2.0, -4.0, 3.0};
    	assertEquals(9.0, Helper.FindRange(values3), 0.01);
    }
    
    /*
     * Sum the sum of first n numbers
     */
    @Test
    public void Test5SumOfSum()
    {
    	assertEquals(3, Helper.SumofSumFrom0(1, 1, 1));
    	assertEquals(5, Helper.SumofSumFrom0(1, 1, 2));
    	assertEquals(5, Helper.SumofSumFrom0(1, 2, 1));
    	assertEquals(10, Helper.SumofSumFrom0(3, 2, 1));
    }
    
    /*
     * Test toString function of Circle is correct
     */
    @Test
    public void Test6ShapeToString()
    {
    	Shape c1 = new Circle(10);
    	assertEquals("Circle (r=10)", c1.toString());
    	Shape c2 = new Circle(1);
    	assertEquals("Circle (r=1)", c2.toString());
    }
    
    /*
     * Test that the car is initialized properly and that
     * the monthly payment over 60 months is calculated
     * correctly.
     */
    @Test
    public void Test7CarPayments()
    {
    	Car c1 = new Car("Ford Focus 2017", 15000);
    	assertEquals("Ford Focus 2017", c1.getName());
    	assertEquals(15000, c1.getPrice(), .01);
    	assertEquals(250, c1.getMonthly_payment(), 0.01);
    	
    	Car c2 = new Car("Ford Escape 2017", 20000);
    	assertEquals("Ford Escape 2017", c2.getName());
    	assertEquals(20000, c2.getPrice(), .01);
    	assertEquals(333.333, c2.getMonthly_payment(), .01);
    }
    
    /*
     * Test that the random number between max and min
     * are generated for different max and mins.
     */
    @Test
    public void Test8GenerateRandom()
    {
    	int i1 = Helper.generateRandom(4, 10);
    	assertTrue(i1 >= 4 && i1 <= 10);
    	i1 = Helper.generateRandom(4, 10);
    	assertTrue(i1 >= 4 && i1 <= 10);
    	int i2 = Helper.generateRandom(25, 100);
    	assertTrue(i2 >= 25 && i2 <= 100);
    	i2 = Helper.generateRandom(25, 100);
    	assertTrue(i2 >= 25 && i2 <= 100);
    	int i3 = Helper.generateRandom(-10, 30);
    	assertTrue(i3 >= 10 && i3 <= 30);
    	i3 = Helper.generateRandom(-10, 30);
    	assertTrue(i3 >= 10 && i3 <= 30);
    }
    
    /*
     * Tests that the returned array has the right length and the
     * array is filled with the right numbers
     */
    @Test
    public void Test9CreateArray()
    {
    	int[] data1 = Helper.createArrayWithConsecutiveNumbers(1, 5);
    	assertEquals(5, data1.length);
    	for (int i=0; i<data1.length; i++)
    		assertEquals(1+i, data1[i]);
    	int[] data2 = Helper.createArrayWithConsecutiveNumbers(-5, 5);
    	assertEquals(11, data2.length);
    	for (int i=0; i<data2.length; i++)
    		assertEquals(-5+i, data2[i]);
    	int[] data3 = Helper.createArrayWithConsecutiveNumbers(10, 20);
    	assertEquals(11, data3.length);
    	for (int i=0; i<data2.length; i++)
    		assertEquals(10+i, data2[i]);
    }
    
    /* Create a new gadget with the same part number but the 
     * serial number one greater.
     */
    @Test
    public void Test10NewGadgetSerial()
    {
    	Gadget g1 = new Gadget(123, 111);
    	Gadget g2 = Helper.newGadgetSerial(g1);
    	assertEquals(g1.getPartNumber(), g2.getPartNumber());
    	assertEquals(g1.getSerialNumber() + 1, g2.getSerialNumber());
    	g1 = new Gadget(4115, 11);
    	g2 = Helper.newGadgetSerial(g1);
    	assertEquals(g1.getPartNumber(), g2.getPartNumber());
    	assertEquals(g1.getSerialNumber() + 1, g2.getSerialNumber());
    	g1 = new Gadget(5897, 56);
    	g2 = Helper.newGadgetSerial(g1);
    	assertEquals(g1.getPartNumber(), g2.getPartNumber());
    	assertEquals(g1.getSerialNumber() + 1, g2.getSerialNumber());
    }
}

