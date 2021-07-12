package dia12.exercicios.Contador;

public class Contador {
    /*escreva uma classe chamada contador, que tem um atributo estatico que é incrementado
    sempre que a classe for instanciada. Crie métodos para zerar, incrementar e retornar o
    valor do contador. Desenvolva um progama para testar essa classe.
    */
    private static int contaInstanciacoes;
    private static Contador Contador;

    public void Contador() {
        this.contaInstanciacoes++;
    }



    public static int getContaInstanciacoes() {
        return contaInstanciacoes;
    }



    public static void setContaInstanciacoes(int contaInstanciacoes) {
        Contador.contaInstanciacoes = contaInstanciacoes;
    }

    public static void zerarContador() {
        contaInstanciacoes = 0;
    }
}
