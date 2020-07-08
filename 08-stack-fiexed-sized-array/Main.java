public class Main {
  public static void main(String[] args) {
    StackDemo stack = new StackDemo();
    stack.push(2);
    stack.push(8);
    stack.push(45);
    stack.push(200);
    stack.show();
    stack.push(400);
    stack.show();
    stack.push(700);

    System.out.println("Size: " + stack.size());
    System.out.println("stack.pop: " + stack.pop());
    System.out.println("Size: " + stack.size());
    
  }
  
}