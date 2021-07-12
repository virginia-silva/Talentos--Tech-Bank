package dia12.exercicios.Tempo;

import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Valor desejado :");

        int totalSegundos = input.nextInt();

        int qtdAno = totalSegundos / 29030400;
        totalSegundos = totalSegundos % 29030400;

        int qtdMes = totalSegundos / 2419200;
        totalSegundos = totalSegundos % 2419200;

        int qtdSemana = totalSegundos / 604800;
        totalSegundos = totalSegundos % 604800;

        int qtdDias = totalSegundos/ 86400;
        totalSegundos = totalSegundos % 86400;

        int qtdHoras = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;

        int qtdMinutos = totalSegundos / 60;
        totalSegundos= totalSegundos % 60;

        int qtdSegundos = totalSegundos;

        System.out.println("A quantidade de Anos é : " + " " + qtdSegundos);
        System.out.println("A quantidade de meses é : " + " " + qtdSegundos);
        System.out.println("A quantidade de semanas é : " + " " + qtdSegundos);
        System.out.println("A quantidade de dias é : " + " " + qtdSegundos);
        System.out.println("A quantidade de horas é : " + " " + qtdHoras);
        System.out.println("A quantidade de minutos é : " + " " + qtdMinutos);
        System.out.println("A quantidade de segundos é : " + " " + qtdSegundos);


        input.close();
    }
    }