import java.util.Scanner;

public class ex3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        double total=0;

        for(int i=1;i<=num;i++){
          total=total+(1.0/i);
        }

      System.out.println(total);
    }
}