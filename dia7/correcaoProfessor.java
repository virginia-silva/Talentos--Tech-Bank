package dia7;

public class correcaoProfessor {

    public static void main(String[] args) {

            // Dado um array de números inteiros com valores negativos e positivos, encontro o número mais próximo de zero.
            // Se houver valores como 2 e -2, considere o número positivo.


            int[] vetor = {3, 4, 5, 6, 2, 3, 4, 5, 6, 8, 100, -1, -9, 1};
            // int[] vetor = {3, 4, 5, 6, 2, 3, 4, 5, 6, 8, 100};
            int indiceDoMenorValor = 0;

            for (int i = 0; i < vetor.length; i++) {
                boolean oValorEMaisPertoDeZero = Math.abs(vetor[i]) < Math.abs(vetor[indiceDoMenorValor]);
                boolean oValorEMaisPertoDeZeroEPositivo = Math.abs(vetor[i])
                        == Math.abs(vetor[indiceDoMenorValor]) && vetor[i] > vetor[indiceDoMenorValor];


                if (oValorEMaisPertoDeZero || oValorEMaisPertoDeZeroEPositivo) {
                    indiceDoMenorValor = i;
                }
            }

            System.out.printf("O valor mais próximo de zero é : %d", vetor[indiceDoMenorValor]);

        }
    }

