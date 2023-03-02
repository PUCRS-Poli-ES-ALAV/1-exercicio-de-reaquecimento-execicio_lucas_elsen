import java.util.Scanner;

public class ex9 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] vet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z" };
    for (String p : list(vet, n)) {
      System.out.print(p + ", ");
    }
  }

  public static String[] list(String[] a, int n){
        String co[] = new String[fat(n)];
        int seq=1;
        for (int i = 0; i < co.length; i++) {
          co[i] = comb(a, n, (i % n), 0, "", seq);
          if((i % n)==n-1){
            seq++;
          }
        }
        return co;
    }

  public static int fat(int n) {
    if (n == 1) {
      return n;
    } else {
      return n * fat(n - 1);
    }
  }

  public static String comb(String[] a, int n, int aux, int cont, String ret, int seq) {
    ret = ret + a[aux];
    aux = aux + seq;
    if (aux >= n) {
      aux = aux-n;
    }
    if (cont < n - 1) {
      cont++;
      ret = comb(a, n, aux, cont, ret, seq);
    }
    return ret;
  }
}
