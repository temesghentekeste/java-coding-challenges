public class StackDemo {

  private int capacity = 2;
  private int[] stack = new int[capacity];
  private int top = 0;


  public void push(int data){

    if(top == stack.length){
      expand();
    }
    stack[top++] = data;
  }

  public int pop(){
    int data = 0;
    System.out.println(top + "::" + capacity);
    if(top <= capacity/4){
      shrink();
    }
      
    data = stack[--top];
    stack[top] = 0;
    return data;
  }

  public int size(){
    return top;
  }

  public boolean isEmpty(){
    return top == 0;
  }

  public void show(){
    for (int i : stack) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private void expand(){
    int length = stack.length;
    int newStack[] = new int[length*2];
    System.arraycopy(stack, 0, newStack, 0, length);
    capacity *= 2;
    stack = newStack;
  }

  private void shrink(){
    int length = stack.length/2;
    int newStack[] = new int[length];
    System.arraycopy(stack, 0, newStack, 0, length);
    stack = newStack;
    capacity /= 2;
  }
  
}