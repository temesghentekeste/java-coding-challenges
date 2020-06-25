public class EvenFibonacci {

  public static void main(String[] args) {
    System.out.println(evenFibonacci(10));
    System.out.println(evenFibonacci(100));
  }

  public static long evenFibonacci(long n){
    long sum = 0;
    long f1=0, f2=1;

    while(true){
      long f3 = f1 + f2;
      if(f3 > n) break;
      if(f3 % 2 == 0){
        sum += f3;
      }
      f1 = f2;
      f2 = f3;

    }

    return sum;
  }
  
}