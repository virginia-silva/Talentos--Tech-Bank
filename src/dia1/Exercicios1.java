package dia1;

import java.util.Scanner;

public class Exercicios1 {

    public static void exercicio1() {
        // 1. Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
        // A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor
        // que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

        short y = 99; // Anderson
        short z = 11; // Leonardo
        short coringa; // Geane


        // short resultado = (short) (y - z);
        // TODO Pesquisar mais sobre arithmetic entre shorts

        System.out.printf("O valor da variável y antes da troca é = %d\n", y);
        System.out.printf("O valor da variável Z antes da troca é = %d\n", z);

        coringa = y;
        y = z;
        z = coringa;

        System.out.println("O valor da variável y depois da troca é = " + y);
        System.out.println("O valor da variável Z depois da troca é = " + z);
    }

    public static void exercicio2() {
        // Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar seu antecessor");
        int valor = in.nextInt();

        // int antecessor = valor - 1;
        // TODO tratar erros de inputs diferentes de inteiros

        System.out.println("O Antecessor de " + valor + " é: " + --valor);
        System.out.println(valor);
        in.close();
    }

    public static void exercicio3() {
        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
        // calcular e escrever a área do retângulo.

        // A = b x h
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a base do retângulo?");
        double base = in.nextDouble();
        System.out.println("Qual a altura do retângulo?");
        double altura = in.nextDouble();

        double area = base * altura;

        System.out.println("A área desse retângulo é: " + area);

        in.close();
    }


    public static void exercicio4() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o total de votos brancos");
        double totalDeVotosBrancos = in.nextInt();

        System.out.println("Digite o total de votos nulos");
        double totalDeVotosNulos = in.nextInt();

        System.out.println("Digite o total de votos validos");
        double totalDeVotosValidos = in.nextInt();

        double totalDeVotos = totalDeVotosBrancos + totalDeVotosValidos + totalDeVotosNulos;

        System.out.println("A quantidade de votos é: " + totalDeVotos);

        System.out.println("A quantidade de votos brancos é: " + totalDeVotosBrancos);

        System.out.println("A quantidade de votos nulos é: " + totalDeVotosNulos);

        System.out.println("A quantidade de votos válidos é: " + totalDeVotosValidos);

        double percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        percentualVotosBrancos = totalDeVotosBrancos * 100 / totalDeVotos;
        percentualVotosNulos = totalDeVotosNulos * 100 / totalDeVotos;
        percentualVotosValidos = totalDeVotosValidos * 100 / totalDeVotos;

        System.out.println("----");
        System.out.println("O percentual total de votos em branco é: " + percentualVotosBrancos + "%");
        System.out.println("O percentual total de votos nulos é: " + percentualVotosNulos + "%");
        System.out.println("O percentual total de votos válidos é: " + percentualVotosValidos + "%");


        in.close();
    }

    public static void main(String[] args) {
        exercicio4();

    }
}
