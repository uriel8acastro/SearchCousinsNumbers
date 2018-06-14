package cesargroupid.cesarartefactid;

/**
 * Hello world!
 *
 */
public class PrimeCalculation 
{
    public static void main( String[] args )
    {
        Calculator miCalculator= new Calculator();
        long initTime = System.nanoTime(); 
        
        for (int i = 0; i < 1000000; i++) {
        	
			if (miCalculator.searchPrimeNumberOne(i)) {
				miCalculator.storeListCousinsHash(i);
				
			}
		}
        long durationTime = ((System.nanoTime() - initTime)/1000000)/1000;        
        miCalculator.showPrimesInHash(miCalculator.hastablePrimes);
        System.err.println(durationTime);
    }
}
