package dia1;

import java.util.Scanner;

public class exercicio2 {

        //Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int num = s.nextInt();

        System.out.println("\nO antecessor de " + num + " é o " + (num - 1) + ".");

        }
    }