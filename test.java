import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test {
  public static void main(String[] args) {
     duplicateString("man man woman woman man man woman");
    //  printDuplicateElement(new int[] {2,4,2,5,8,9,5});
  }

  public static void duplicateString(String sentence){

    Map<String, Integer> repeatedWordMap = new HashMap<>();

    for (String word : sentence.split(" ")) {
      if (repeatedWordMap.containsKey(word)){
        repeatedWordMap.put(word, repeatedWordMap.get(word) + 1);
      }else{
        repeatedWordMap.put(word, 1);
      }
    }

    repeatedWordMap.forEach((k,v) -> System.out.println(k + ">"+ v));
    
    System.out.println("**********************************");
    for (String key : repeatedWordMap.keySet()) {
      System.out.println(key + ">>>" + repeatedWordMap.get(key));
    }
  }

  public static void printDuplicateElement(int [] arr){
    Set<Integer> uniqueNumber = new HashSet<>();

    for (int i : arr) {
      if(uniqueNumber.contains(i)){
        System.out.println(i);
      }else{
        uniqueNumber.add(i);
      }
      
    }
  }
}