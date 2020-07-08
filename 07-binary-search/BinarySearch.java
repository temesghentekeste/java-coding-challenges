/**
 * IN binary search, it is assumed that the array that is searched for a particular value
 * is sorted.
 * sortedArray: is the sorted array
 * num: is the value we are looking for
 * start: starting index of the array
 * end: ending index of the array
 * the method uses recursive algorithm and return the position of the item if it is found
 * otherewise it return -1
 * technique used is called divide and conquer or decrease and conquer
 */

public class BinarySearch{
  public static void main(String[] args) {
    int [] sortedArray = new int[] {5,7,8,10,11,25,48,52,65,87};
    
    System.out.println("Found @: " + binarySearch(sortedArray, 100, 0, sortedArray.length -1));
  }

  public static int binarySearch(int[] sortedArray, int num, int start, int end){

      int mid = (start + end )/2;
      System.out.println("Mid::" + mid + ", start::" + start + ", end::" + end);
      
      if(num == sortedArray[mid]){
        System.out.println("Mid=>" + mid );
        return mid;
      }
      else if(start > end){
        return -1;
      }
      else if (num > sortedArray[mid]){
        start = ++mid;
        return binarySearch(sortedArray, num, start, end);
      }else {
        end = --mid;
        return binarySearch(sortedArray, num, start, end);
      }
    
  }
}