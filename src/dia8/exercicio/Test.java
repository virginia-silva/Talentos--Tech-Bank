package dia8.exercicio;

public class Test {

    public static void main(String args[]){

        Pessoa isaac = new Pessoa();
        Pessoa einsten = new Pessoa();

        // Primeiro objeto a ser instanciado
        isaac.nome = "Isaac Newton";
        isaac.ajustaDataNasciment(14, 03, 1849);

        // Segundo objeto a ser instanciando
        einsten.nome = "Albert Einsten";
        einsten.ajustaDataNasciment(04, 01, 1643);

        // Passando a data atual para o metodo que ira calcular a idade
        isaac.calcularIdade(19, 12, 2017);
        einsten.calcularIdade(19, 12, 2017);

        System.out.println("Idade atual de " + isaac.informaNome() + " seria de " + isaac.informarIdade());
        System.out.println("Idade atual de " + einsten.informaNome() + " seria de " + einsten.informarIdade());
    }

}
