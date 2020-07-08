public class Main {
  public static void main(String[] args) {
    StackDemo stack = new StackDemo();
    stack.push(2);
    stack.push(8);
    stack.show();
    stack.push(45);
    stack.show();
    stack.push(200);
    stack.push(400);
    stack.push(700);
    stack.show();

    System.out.println("Size: " + stack.size());
    System.out.println("stack.pop: " + stack.pop());
    System.out.println("stack.pop: " + stack.pop());
    System.out.println("stack.pop: " + stack.pop());
    System.out.println("stack.pop: " + stack.pop());
    stack.show();
    System.out.println("Size: " + stack.size());
    System.out.println("stack.pop: " + stack.pop());
    stack.show();
    System.out.println("stack.pop: " + stack.pop());
    stack.show();
    
    
  }
  
}