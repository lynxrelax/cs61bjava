public class NBody {
  public static double readRadius(String filename) {
    In in = new In(filename);
    int num = in.readInt();
    double radius = in.readDouble();
    return radius;
  }

  public static void main(String[] args) {

    String filename = args[2];
    double r = readRadius(filename);
  }
}
