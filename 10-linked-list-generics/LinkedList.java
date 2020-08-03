public class LinkedList<E>{
  class Node<E>{
    E data;
    Node<E> next;

    public Node(E obj){
      data = obj;
      next = null;
    }
  }

  private Node<E> head;
  private Node<E> tail;
  private int currentSize;

  public LinkedList(){
    head = null;
    currentSize = 0;
  }

  public void addFirst(E obj){
    Node<E> node = new Node<E>(obj);
    if(head == null){
      head = tail = node;
      currentSize++;
      return;
    }

    if(head == tail){
      node.next = tail;
      head = node;
      currentSize++;
      return;
    }

    node.next = head;
    head = node;
    currentSize++;
  }

  public E getNode(int index){
    if(index == 0){
      return head.data;
    }else if (index == currentSize - 1){
      return tail.data;
    }else{
      Node<E> node = head.next;
      int i = 1;
      while (node.next != null){
        if(i == index){
          return node.data;
        }
        i++;
        node = node.next;
      }
    }
    return null;
  }

  public void addLast(E obj){
    Node<E> node = new Node<E>(obj);
    if(head == null){
      head = tail = node;
      currentSize++;
      return;
    }else if (currentSize == 1){
      head.next = tail;
      tail.next = node;
      currentSize++;
    }else{
      tail.next = node;
      tail = node;
      currentSize++;
    }
    
  }

  public void printList(){
    System.out.println("Printing list ....");
    Node<E> node = head;
    while(node.next != null){
      System.out.println(node.data);
      node = node.next;
    }

    System.out.println(node.data);
  }

  public E removeFirst(){
    if(head == null){
      return null;
    }

    E temp = head.data;
    if(head == tail){
      head = tail = null;
    }else{
      head = head.next;
    }

    currentSize--;
    return temp;
  }

  public E removeLast(){
    if(head == null){
      return null;
    }

    if(head == tail){
      return removeFirst();
    }
    Node<E> current = head, previous=null;
    while(current != tail){
      previous = current;
      current = current.next;
    }
    previous.next = null;
    tail = previous;
    return current.data;
  }
}