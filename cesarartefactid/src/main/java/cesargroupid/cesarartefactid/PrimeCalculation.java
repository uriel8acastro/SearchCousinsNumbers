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
        long initTimeMill = System.currentTimeMillis(); 
        
        for (int i = 0; i < 1000000; i++) {
        	
			if (miCalculator.searchPrimeNumberTwo(i)) {
				//miCalculator.storeListCousinsHash(i);
				miCalculator.storeListCousinsArray(i);
				
			}
		}
        
        long durationTime = (((System.nanoTime() - initTime)/1000)/1000)/1000; 
        long durationTimeMill= (System.currentTimeMillis() - initTimeMill)/1000;
        //System.err.println(durationTime);
        //miCalculator.showPrimesInHash(miCalculator.hastablePrimes);
        miCalculator.showPrimesInArray(miCalculator.arrayPrimes); 
        System.err.println(durationTime);
        System.err.println(durationTimeMill);
    }
}
