import java.util.Scanner;

public class ex2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int total=0;
        
        for(int i=0;i<num1;i++){
          total++;
        }
        for(int i=0;i<num2;i++){
          total++;
        }
        System.out.println(total);
    }
}