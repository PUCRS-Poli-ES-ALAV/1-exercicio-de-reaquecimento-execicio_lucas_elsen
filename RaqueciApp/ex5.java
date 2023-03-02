import java.util.Scanner;

public class ex5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int resp= f(n);
        System.out.println(resp);
    }

    public static int f(int n){
    if(n==1){
      return 1;
    }
    else if(n==2){
      return 2;
    }
    else{
      return 2*f(n-1)+3*f(n-2);    
    }
  }
}