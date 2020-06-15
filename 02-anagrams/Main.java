import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(anagram("aaca", "caaa"));
		
	}
	
	public static boolean anagram(String s1, String s2) {
		
		if(s1.length() != s2.length()) return false;
		
		s1.toLowerCase();
		s2.toLowerCase();
		char[] chars_s1 = s1.toCharArray();
		char[] chars_s2 = s2.toCharArray();
		
		int[] letters_index = new int[26];
		
		for (int i = 0; i < chars_s1.length; i++) {
			
			char current = chars_s1[i];
			int current_index = (int)current - (int)'a';
			letters_index[current_index] += 1;
			
			current = chars_s2[i];
			current_index = (int)current - (int)'a';
			letters_index[current_index] -= 1;
			
		}
		
		int sum = 0;
		for (int i = 0; i < letters_index.length; i++) {
			sum += letters_index[i];
		}
		
		return sum == 0;
	}
}
