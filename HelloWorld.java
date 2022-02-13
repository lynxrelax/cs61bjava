public class HelloWorld {

  public static void windowPosSum(int[] a, int n) {
    for (int x = 0; x < a.length; x += 1) {
      int sum = 0;
      if (a[x] < 0) {
        continue;
      }
      for (int y = x; y < x + n + 1; y += 1) {
        if (y == a.length) {
          break;
        }
        sum += a[y];
      }
      a[x] = sum;
    }
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, -3, 4, 5, 4 };
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
// try to