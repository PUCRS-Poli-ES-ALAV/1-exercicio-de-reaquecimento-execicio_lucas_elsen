import java.util.Scanner;

public class ex9{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String[] vet= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for(String p : list(vet,n)){
            System.out.print(p+", ");
        }
    }

    public static String[] list(String[] a, int n){
        String co[] = new String[fat(n)];
        for (int i = 0; i < co.length; i++) {
          co[i] = comb(a, n, (i / (n-1)), 0, "");
        }
        return co;
    }

    public static int fat(int n){
        if(n==1){
            return n;
        }
        else{
            return n*fat(n-1);
        }
    }

    public static String comb(String[] a, int n, int aux, int cont, String ret){
         ret = ret + a[aux];
        if (aux == n-1) {
          aux = 0;
        } else {
          System.out.println(cont+" "+aux);
          aux++;
        }
        if (cont < n-1) {
          cont++;
          ret = comb(a, n, aux, cont, ret);
        }
        return ret;
    }
}