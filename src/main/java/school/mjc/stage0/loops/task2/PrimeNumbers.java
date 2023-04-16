package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
    	int idiotic = printToInclusive;
    	printToInclusive = 2;
    	while (idiotic >= printToInclusive) {
    		boolean flag = true;
    		int counter = 2;
    		while (counter < printToInclusive) {
    			if (printToInclusive % counter == 0 && counter != 2) {
					flag = false;
					}
    			counter++;
				} 
    		if (flag) {
				System.out.println(printToInclusive);
    		}
    		printToInclusive++;
    	}
    }
    public static void main(String[] args) {
		PrimeNumbers myPrimeNumbers = new PrimeNumbers();
		myPrimeNumbers.printPrimeNumbers(31);
	}
  
}