package dia4;

import java.util.Scanner;

public class Exercicio6 {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Entre com quantidades de números:");
            int rows=sc.nextInt();
            System.out.println("");
            for (int i=1; i<=rows; i++){
                for (int j=1; j<=(rows-i)*2; j++){
                    System.out.print(" ");
                }
                for (int k=i; k>=1; k--){
                    System.out.print(" "+k);
                }
                for (int l=2; l<=i; l++){
                    System.out.print(" "+l);
                }
                System.out.println();
            }
        }
    }
