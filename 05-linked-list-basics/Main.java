public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);
    System.out.println("Initial set up:");
    list.show();

    System.out.println("Adding in the middle: position 2");
    list.addAt(2, 800);
    list.show();

    System.out.println("Adding @ the begining:");
    list.addAt(0, 900);
    list.show();

    System.out.println("Deleting @ specific location:position 3 ");
    list.deleteAt(3);
    list.show();

    System.out.println("Deleting @ specific location:");
    list.deleteAt(0);
    list.show();
  }
  
}