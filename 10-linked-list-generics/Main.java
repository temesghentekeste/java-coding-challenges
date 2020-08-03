public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    System.out.println("Inserting at first");
    list.addFirst(3);
    list.addFirst(5);
    list.addFirst(10);

    list.printList();
    
    System.out.println("Inserting at last");
    list.addLast(30);
    list.addLast(50);
    list.addLast(100);
    
    list.printList();
    
    System.out.println("Getting an element from the list");
    System.out.println(list.getNode(5));


    System.out.println("Removing first element");
    System.out.println(list.removeFirst());
    System.out.println("Printing after removal");
    list.printList();

    System.out.println("Removing last element");
    System.out.println(list.removeLast());
    System.out.println("Printing after removal");
    list.printList();
    
  }
}