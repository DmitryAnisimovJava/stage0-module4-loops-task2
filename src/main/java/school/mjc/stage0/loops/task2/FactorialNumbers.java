package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
    	int factorial = 1, counter = 1;
    	System.out.println(factorial);
    	while (counter <= printToInclusive) {
    		factorial = factorial * counter;
    		System.out.println(factorial);
			counter++;
		}
    }
}
