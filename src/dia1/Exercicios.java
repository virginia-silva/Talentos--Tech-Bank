//Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma
// variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque os seus
// conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final,
// escrever os valores que ficaram armazenados nas variáveis.


package dia1;

public class Exercicios {

    public static void main(String[] args) {

        short y = 99;
        short z = 11;
        short Coringa = 0;

        System.out.printf(" O valor da variavel y antes da troca é = %d\n", y);
        System.out.printf(" O valor da variavel z antes da troca é = %d\n", z);

        Coringa = y;
        y = z;
        z = Coringa;

        System.out.printf(" O valor da variavel y depois da troca é = " + y);
        System.out.printf(" O valor da variavel z depois da troca é = " + z);

    }
}

