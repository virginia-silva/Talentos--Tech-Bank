package dia5;

import javax.swing.*;

public class exercicio2 {

    public static void main(String[] args) {
        // valores a serem ordenados
        int vetor[] = {3,5,10,8,1,3};
        // armazenam o menor valor e o índice do menor valor
        int menor, indiceMenor;

        for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            menor = vetor[i];
            indiceMenor = i;

            // compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

        // exibe os números na tela
        String numerosOrdenados = "";
        for (int n : vetor) {
            numerosOrdenados += n+"-";
        }

        JOptionPane.showMessageDialog(null,numerosOrdenados);

    }
}

