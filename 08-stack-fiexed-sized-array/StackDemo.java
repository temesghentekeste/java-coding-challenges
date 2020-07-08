public class StackDemo {

  private int[] stack = new int[5];
  private int top = 0;


  public void push(int data){
    if(top == stack.length){
      System.out.println("Stack is full");
    }else{
      stack[top++] = data;
    }
  }

  public int pop(){
    int data = 0;
    if(isEmpty()){
      System.out.println("Stack is empty");
    }else{
      data = stack[--top];
    }
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
  
}