package dia6;

//Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] argss){
        Scanner ent = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            num = ent.nextInt();

            if(num % 2 == 0){
                contPar++;
            }

            // para informar números impares
            /*
            if(num % 2 == 1){
                contImpar++;
            }
            */
        }

        System.out.println("Foram digitados " + contPar + " números pares \n");
        // System.out.println("E " + contImpar + " números ímpares");

    }
}
