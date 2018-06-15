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
        
        for (int i = 0; i < 100; i++) {
        	
			if (miCalculator.searchPrimeNumberOne(i)) {
				miCalculator.storeListCousinsHash(i);
				//miCalculator.storeListCousinsArray(i);
				
			}
		}
        long durationTime = ((System.nanoTime() - initTime));        
        miCalculator.showPrimesInHash(miCalculator.hastablePrimes);
        //miCalculator.showPrimesInArray(miCalculator.arrayPrimes);
        System.err.println(durationTime);
    }
}
