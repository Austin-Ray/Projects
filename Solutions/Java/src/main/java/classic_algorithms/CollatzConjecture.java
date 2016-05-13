package classic_algorithms;

public class CollatzConjecture {
  public static long collatzConjecture(long n) {
    int count = 0;

    while(n > 1) {
      if(n % 2 == 0) {
        n /= 2;
        count++;
      } else {
        n = (n * 3) + 1;
        count++;
      }
    }

    return count;
  }
}
