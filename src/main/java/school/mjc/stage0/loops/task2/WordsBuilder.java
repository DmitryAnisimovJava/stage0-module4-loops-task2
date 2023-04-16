package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
    	int i = 0;
    	String resultingString = "";
    	while (chars.length > 0) {
    		resultingString = resultingString + chars[i];
    		i++;
		}
    	System.out.println(resultingString);
    }
}
