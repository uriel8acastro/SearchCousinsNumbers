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
        
        for (int i = 0; i < 100; i++) {
        	
			if (miCalculator.searchPrimeNumberOne(i)) {
				miCalculator.storeListCousinsHash(i);
				
			}
		}
        miCalculator.showPrimesInHash(miCalculator.hastablePrimes);
    }
}
