
/**
 * Helper functions
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helper
{
	/*
	 * Convert a fahrenheit to celsius
	 */
    public static double FahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit-32)*5.0/9.0;
    }
    
    /*
     * Returns below freezing is the temperature is below freezing and
     * above freezing if temperature is above freezing. If exactly at freezing
     * return at freezing.
     */
    public static String isFreezing(double temperature_in_fahrenheit)
    {
    	if (temperature_in_fahrenheit < 32)
    		return "below freezing";
    	if (temperature_in_fahrenheit == 32)
    		return "at freezing";
    	return "above freezing";
    }
    
    /*
     * Find the smallest number that is divisible by both n1 and n2
     */
    public static int SmallestNumberDivisibleBy (int n1, int n2)
    {
    	// Start with 2
    	int i = 2;
    	
    	// Keep looping
    	while (true)
    	{
    		// Check if the remainider is 0
    		if ( (i % n1 == 0) && (i % n2 == 0))
    			return i;
    		i++;
    	}
    }
    
    /*
     * Find the range of the array.
     * The range is the difference between the biggest and the smallest value in
     * the array.
     */
    public static double FindRange(double[] values)
    {
    	double min = Double.MAX_VALUE;
    	double max = Double.MIN_VALUE;
    	for (int i=0; i<values.length; i++)
    	{
    		if (min > values[i])
    			min = values[i];
    		if (max < values[i])
    			max = values[i];
    	}
    	return max-min;
    }
    
    /*
     * Calculate the sum of the first n numbers
     */
    static int SumFrom0(int n)
    {
    	int sum = 0;
    	for (int i=0; i<n; i++)
    		sum += (i+1);
    	return sum;
    }
    
    /*
     * Calculate the sum of the first n numbers of n1, n2 and n3. 
     * Then, return their sum.
     * Use the function sumFrom0 defined above.
     */
    public static int SumofSumFrom0(int n1, int n2, int n3)
    {
    	return 0;
    }
    
    /*
     * Generate a random number between min and max with the
     * possibility of values at min and max included
     */
    public static int generateRandom(int min, int max)
    {
    	return 0;
    }
    
    /*
     * Create an array of integers. The array should have
     * integers starting at start and then ending at end.
     * You will have to make the array long each to accomodate
     * that.
     */
    public static int[] createArrayWithConsecutiveNumbers(int start, int end)
    {
    	return null;
    }
    
    /*
     * Create a gadget with the same part number but serial number
     * which is one more than the ref gadget.
     */
    public static Gadget newGadgetSerial(Gadget ref)
    {
    	return null;
    }
}
