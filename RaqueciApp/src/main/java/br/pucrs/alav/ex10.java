import java.util.Scanner;

public class ex7{
    public static void main(String args[]){
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();

        System.out.println(fibs(num1,num2,num3));
    }

    public static int fibs (int f0, int f1, int aux){
        if (aux==0){
            return f0;
        }
        else if (aux==1){
            return f1;
        }
        else if (aux>1){
            return (fibs(f0,f1,aux-1) + fibs(f0,f1,aux-2));
        }
        else{
            return -1;
        }
    }
}