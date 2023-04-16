package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
    	int evenNumbers = 0;
    	while (evenNumbers <= printTillInclusive) {
			if (evenNumbers % 2 == 0) {
				System.out.println(evenNumbers);
			}
			evenNumbers++;
		}
    }
}
