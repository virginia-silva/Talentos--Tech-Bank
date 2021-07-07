package dia7;

import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro, varie entre positivo e negativo:");
            numeros[i] = in.nextInt();
        }
        in.close();

        int numeroPositivo = Integer.MAX_VALUE;
        int numeroNegativo = Integer.MIN_VALUE;

        for (Integer numero : numeros) {
            if (numero < numeroPositivo && numero > 0) {
                numeroPositivo = numero;
            }
            if (numero > numeroNegativo && numero < 0) {
                numeroNegativo = numero;
            }
        }

        System.out.println("O número mais proximo de zero é: ");
        System.out.println((numeroPositivo <= Math.abs(numeroNegativo) ? numeroPositivo : numeroNegativo));

    }
}




