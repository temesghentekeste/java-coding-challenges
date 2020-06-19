import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		String sentence = "He is a very brave man even more brave than he thinks he is.";
		duplicateWord(sentence);
	}
	
	public static void duplicateWord(String sentence) {
		String[] arrSentence = sentence.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<>();
		
		for (String word : arrSentence) {
			word = word.toLowerCase();
			// word = word.replaceAll("[-+^]*", ""); 
			word = word.replace(",", "");
			word = word.replace(".", "");
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			}else {
				wordCountMap.put(word, 1);
			}
		}
		
		wordCountMap.forEach((k,v) -> System.out.println(k + " " + v ));
		
	}

}

