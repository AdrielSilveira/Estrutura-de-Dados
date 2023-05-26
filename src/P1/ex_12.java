package P1;

public class ex_12 {
  public static int somaint(int n) {
      if (n <= 0) {
          return 0;
      } else {
          return n + somaint(n - 1);
      }
  }
}

//não, pois com um problema muito grande a recursão utiliza mais recursos do sistema para resolver.