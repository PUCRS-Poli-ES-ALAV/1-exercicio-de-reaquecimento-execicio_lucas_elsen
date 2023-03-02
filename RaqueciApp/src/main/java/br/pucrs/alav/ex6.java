import java.util.Scanner;

public class ex6{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int total=0;
        
        total=a(num1,num2);
        System.out.println(total);
    }

    public static int a(int m, int n){
    if(m==0){
      return n+1;
    }
    else if(m!=0 && n==0){
      return a(m-1,1);
    }
    else if(m!=0 && n!=0){
      return a(m-1,a(m,n-1));
    }
    return 0;
  }
}