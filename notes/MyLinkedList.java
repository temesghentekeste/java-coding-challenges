
public class MyLinkedList {

  private Node head;

  public MyLinkedList(){
    System.out.println("MyLinkedList running ....");
  }

  //inserting into the list
  public void insert(int data){
    System.out.println("Inserting " + data);
    Node node = new Node();
    node.setData(data);
    if (head == null){
      head = node;
    }else{
      Node nextNode = head;
      while( nextNode.getNext() != null){
        nextNode = nextNode.getNext();
      }
      nextNode.setNext(node);
    }
  }

  //removing from linked list
  public void show(){
    Node node = head;
    while(node.getNext() != null){
      System.out.println(node.getData());
      node = node.getNext();
    }
    System.out.println(node.getData());

  }
  
  public void insertAt(int index, int data){
    if(index == 0){
      insert(data);
    }else{
        Node newNode = new Node();
        newNode.setData(data);
        Node node = head;
        int i = 0;
        while( i < index-1){
          node = node.getNext();
          i++;
        }
        Node n1 = node.getNext();
        node.setNext(newNode);
        newNode.setNext(n1);
      }
    }

    public void insertAtStart(int data){
      Node node = new Node();
      node.setData(data);
      node.setNext(head) ;
      head = node;

    }

    public void deleteAt(int index){
      Node node = head;
      int i = 0;
      while( i < index -1){
        node = node.getNext();
        i++;
      }
      Node n1 = node.getNext();
      node.setNext(n1.getNext());
      System.out.println("Removed: " + n1.getData());
      n1 = null;
    }

  
}