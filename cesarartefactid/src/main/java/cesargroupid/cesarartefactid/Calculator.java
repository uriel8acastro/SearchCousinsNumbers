package cesargroupid.cesarartefactid;

import java.util.Enumeration;
import java.util.Hashtable;

public class Calculator {
	
	public Hashtable<String,String> hastablePrimes = new Hashtable<String,String>();

	public boolean searchPrimeNumberOne(int number) {
		int countDivisor = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				countDivisor++;
			}
		}
		if (countDivisor > 2)
			return false;
		else {
			return true;
		}

	}
	
	public void storeListCousinsHash(int number) {		
		hastablePrimes.put(" "+hastablePrimes.size(), " "+number);		
	}
	
	public void showPrimesInHash(Hashtable<String,String> hastable) {
		Enumeration<String> enumeration = hastable.elements();
		while (enumeration.hasMoreElements()) {
		  System.out.println("Numero: " + enumeration.nextElement());
		}
	}

}
