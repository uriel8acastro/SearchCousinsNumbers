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
        
        for (int i = 0; i < 250; i++) {
        	
			if (miCalculator.searchPrimeNumberTwo(i)) {
				//miCalculator.storeListCousinsHash(i);
				miCalculator.storeListCousinsArray(i);
				
			}
		}
        
        long durationTime = (((System.nanoTime() - initTime)/1000)/1000)/1000; 
        //System.err.println(durationTime);
        //miCalculator.showPrimesInHash(miCalculator.hastablePrimes);
        miCalculator.showPrimesInArray(miCalculator.arrayPrimes); 
        System.err.println(durationTime);
    }
}
