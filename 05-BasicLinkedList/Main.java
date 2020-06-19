import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    MyLinkedList myList = new MyLinkedList();
    System.out.println("Main Running");

    myList.insert(10);
    myList.insert(20);
    myList.insert(30);
    myList.insert(40);

    myList.show();
    System.out.println("Inserting in the middle:");
    myList.insertAt(2, 50);
    myList.show();
    
    System.out.println("Testing built in linked list class:");
    LinkedList list = new LinkedList<>();
    list.add(100);
    
    list.add(1, 500);
    list.forEach((d) -> {
      System.out.println("Value is: " + d);
    });

    System.out.println("Inserting at the beginning of custom list:");
    myList.insertAtStart(700);
    myList.show();

    System.out.println("Deleting at a specific location custom list:");
    myList.deleteAt(2);
    myList.show();
  }
  
}