package dia5;

public class teste {

    public static void main(String args[]){
        int[] vetor = {8, 9, 19, 5, 1, 15};
        int aux = 0;
        int i = 0;

        //exibindo o conteúdo do array em ordem.
        System.out.println("Vetor desorganizado: ");
        for(i = 0; i<6; i++){

            //System.out.println(" "+vet[i]); Exibe em lista vertical
            System.out.print(vetor[i] + "-"); // Exibe em lista horizontal
        }
        System.out.println(" ");

        //Fazendo o loop - Bubble Sort
        for(i = 0; i<6; i++){
            for(int j = 0; j<5; j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        //exibindo o conteúdo do array em ordem.
        System.out.println("Vetor organizado:");
        for(i = 0; i<6; i++){

            //System.out.println(" "+vet[i]); Exibe em lista vertical
            System.out.print(vetor[i] + "-");// exibe em lista horizontal
        }
    }
}