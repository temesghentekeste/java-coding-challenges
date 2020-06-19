public class LinkedList {

  private Node head;
  private int size;

  //Add
  public void add(int data){
    Node node = new Node();
    node.setData(data);
    if(head == null){
      head = node;
    }else{
      Node n = head;
      while(n.getNext() != null){
        n = n.getNext();
      }
      n.setNext(node);
    }

    this.size++;
  }
  
  //Add at start
  public void addAtStart(int data){
    Node node = new Node();
    node.setData(data);
    node.setNext(head);
    head = node;
  }
  //show
  public void show(){
    Node node = head;
    while(node.getNext() != null){
      System.out.println(node.getData());
      node = node.getNext();
    }
    System.out.println(node.getData());
  }

  //Add @ a specific position
  public void addAt(int position, int data){
    Node newNode = new Node();
    newNode.setData(data);
    
    if(position == 0){
      addAtStart(data);
    }else{

      Node node = head;
      int i= 0;
      while (i < position -1){
        node = node.getNext();
        i++;
      }
  
      Node n1 = node.getNext();
      node.setNext(newNode);
      newNode.setNext(n1);
    }
  }

  //Deleting at the middle
  public void deleteAt(int position){
    if(position == 0){
      System.out.println("Deleted node: " + head.getData());
      head = head.getNext();
    }else{

      Node node = head;
      int i = 0;
      while (i < position -1){
        node = node.getNext();
        i++;
      }
      Node n1 = node.getNext();
      node.setNext(n1.getNext());
      System.out.println("Deleted node: " + n1.getData());
    }
  }
}