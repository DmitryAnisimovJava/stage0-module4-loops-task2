package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
    	int multipliedNumber = 0, counter = 1;
    	System.out.println(multipliedNumber);
    	multipliedNumber++;
    	if (multiplyByAndToInclusive > 0) {
			while (multiplyByAndToInclusive <= counter) {
				System.out.println(multipliedNumber);
				counter++;
				multipliedNumber = multipliedNumber  * counter; 
			} 
    	} else if (multiplyByAndToInclusive < 0) {
				while (multiplyByAndToInclusive <= counter) {
					System.out.println(multipliedNumber);
					counter++;
					multipliedNumber = multipliedNumber  * counter; 
			} 		
		}
    }
}
