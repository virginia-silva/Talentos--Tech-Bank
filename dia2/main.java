package dia2;

public class main {

    public static void main(String[] args) {

        int idade = 17;

        if(idade < 0){
            System.out.println("idade Inválida");
        }
        else if (idade >= 150) {
            System.out.println("idade inválida");
        }
        else if (idade >= 18) {
            System.out.println("Você tem permissão para assistir esse conteúdo");
        } else {
            System.out.println("Você não tem permissão para assistir esse conteúdo");
        }
    }
}
