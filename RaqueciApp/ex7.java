import java.util.Scanner;

public class ex7{
    public static void main(String args[]){
        int[] vet= {1,2,3,4,5};
        int soma=0;
        int mult=1;
        for(int i=0;i<vet.length;i++){
          soma=soma+vet[i];
          mult=mult*vet[i];
        }
        System.out.println("soma "+ soma+" multiplicacao "+mult);
    }
}