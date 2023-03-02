import java.util.Scanner;

public class ex8{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int init=0;
        int fim=s1.length()-1;
        boolean palin=false;
        boolean con=true;
        while(con){
          if(s1.charAt(init)==s1.charAt(fim)&&init<=fim){
            init++;
            fim--;
          }
          else if(init>=fim){
            palin=true;
            con=false;
          }
          else{
            con=false;
          }
        }
    
        if(palin){
          System.out.println("A palavra "+s1+" é palindromo");
        }
        else{
          System.out.println("A palavra "+s1+" não é palindromo");
        }
    }
}