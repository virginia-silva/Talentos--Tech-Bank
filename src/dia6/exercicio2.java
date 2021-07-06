package dia6;

//Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num[] = new float[5], qtdNegativos = 0, positivos = 0;

        for (int cont = 0; cont < 5; cont++) {
            System.out.print("Insira o " + (cont + 1) + "° número: ");
            num[cont] = entrada.nextFloat();

            if (num[cont] >= 0) {
                positivos = positivos + num[cont];
            } else {
                ++qtdNegativos;
            }
        }

        if (qtdNegativos > 0) {
            System.out.println("A quantidade de números Reais negativos é: "
                    + qtdNegativos);
        }

    }

}
