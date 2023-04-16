package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
    	
    	while (printToInclusive > 0) {
    		boolean flag = true;
    		int counter = printToInclusive - 1;
    		while (counter > 1) {
    			if (printToInclusive % counter == 0) {
					flag = false;
					}
    			counter--;
				} 
    		if (flag) {
				System.out.println(printToInclusive);
    		}
    		printToInclusive--;
    	}
    } 
}