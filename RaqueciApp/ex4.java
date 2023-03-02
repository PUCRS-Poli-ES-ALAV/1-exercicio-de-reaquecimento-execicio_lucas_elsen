import java.util.Scanner;

public class ex4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        
        String aux = "";
        String[] c=s1.split("");
        for(int i=s1.length()-1; i>=0;i--){
            aux=aux+c[i];
        }
        System.out.println(aux);
    }
}