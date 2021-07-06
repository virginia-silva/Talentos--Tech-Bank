package dia6;

//Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada letra
// em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero de
// tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        String palavra[] = {"c", "h", "a", "v", "e"};

        Scanner sc = new Scanner(System.in);

        int forca = 1, vencer = 0, perder = 0, contador = 0;
        // Nesse caso o array não precisa ter o tamanho de 100, já que a pessoa se perder for = 5 ele perde e
        // se vencer = 5, ele ganha, pode ser 10 para melhorar a performace dofor criado abaixo, nesse caso vamos deixar
        // com tamanho 20 no caso da pessoa digitar a mesma letra algumas vezes.

        String digito, letrasDigitadas[] = new String[20];

        while (forca == 1) {
            int existePalavra = 0;
            System.out.println("Digite a letra:");
            digito = sc.next();
            letrasDigitadas[contador] = digito;

            /* for criado para verificar se a letra já foi digitada. */
            for (int i = 0; i < letrasDigitadas.length; i++) {
                if (letrasDigitadas[i] != null) {
                    if (letrasDigitadas[i].equals(digito)) {
                        existePalavra++;
                    }
                }
            }
            /*Se a letra não foi digitada ainda verifica se está correta, caso contrario exibe a mensagem */
            if (!(existePalavra > 1)) {
                /*Faz o loop no array da palavra, que não estava sendo feito */
                for (int x = 0; x < palavra.length; x++) {
                    /*Verifica se a letra está correta */
                    if (palavra[x].equals(digito)) {
                        System.out.println("Letra correta.");
                        vencer++;
                        break;
                    } else {
                        if (x == 4) {
                            System.out.println("Letra inexistente.");
                            perder++;
                        }
                    }
                }
                if (perder == 5) {
                    System.out.println("Você perdeu.");
                    System.exit(0);
                } else if (vencer == 5) {
                    System.out.println("Voce venceu.");
                    System.out.println("A palavra é Chave");
                }
            }
        }
    }
}




