package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
    	int i = 0;
    	String resultingString = "";
    	while (chars.length - 1 >= i) {
    		resultingString = resultingString + chars[i];
    		i++;
		}
    	System.out.println(resultingString);
    }
    public static void main(String[] args) {
		WordsBuilder myWords = new WordsBuilder();
		myWords.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
	}
}
