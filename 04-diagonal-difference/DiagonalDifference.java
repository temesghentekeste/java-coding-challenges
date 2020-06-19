public class DiagonalDifference {
  public static void main(String[] args) {
    System.out.println(diagonalDifference(new int[][]{{11,2,4}, 
                                                      {4, 5, 6}, 
                                                      {10, 8, 12}}));
  }

  public static int diagonalDifference(int[][] array){
    int result = 0;
    int d1 =0, d2=0;
    int length = array.length;

    for (int i = 0; i < array.length; i++) {
      d1 += array[i][i];
      d2 += array[length - 1 - i][i];
      
    }

    System.out.println();

    result = Math.abs(d1 - d2);

    return result;
  }
  
}