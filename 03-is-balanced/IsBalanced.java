import java.util.Scanner;
import java.util.Stack;

/**
 * IsBalanced
 */
public class IsBalanced {

  public static char[][] TOKENS = {{'{', '}'}, {'(', ')'},{'[', ']'} };

  public static void main(String[] args) {

    System.out.print("Enter any string: using {, }, (, ), or []  ");
    Scanner input = new Scanner(System.in);
    String expression = input.next();

    System.out.println(expression + " isBalanced>" + isBalanced(expression));
    
  }

  public static boolean isBalanced(String expression){

    Stack<Character> stack = new Stack<Character>();

    for (Character c : expression.toCharArray()) {
      if(isOpeningCharacter(c)){
        stack.push(c);
      }else{
        if(stack.isEmpty()){
          return false;
        }else{
          char top = stack.pop();
          if(!matches(top, c)){
            return false;
          }
        }
      }
      
    }

    return stack.isEmpty();
  }

  public static boolean matches(char opening, char closing){
    for (char[] array : TOKENS) {
      if(array[0] == opening){
        return array[1] == closing;
      }
    }
    return false;
  }

  public static boolean isOpeningCharacter(char c){
    for (char[] array : TOKENS) {
      if(array[0] == c) return true;
    }
    return false;
  }
}