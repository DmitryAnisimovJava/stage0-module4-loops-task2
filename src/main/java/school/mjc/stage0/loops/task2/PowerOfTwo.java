package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
    	int powerCounter = 0;
    	while (powerCounter <= power) {
				System.out.println(Math.pow(2, powerCounter));
				powerCounter++;
		}
    }
}
