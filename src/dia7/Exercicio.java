package dia7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            numeros.add(scan.nextInt());
        }


        int aux = Integer.MAX_VALUE;
        for (Integer numero : numeros) {
            if (numero < aux && numero > 0) {
                aux = numero;
            }
        }
        System.out.println(aux);


        scan.close();
    }
}
