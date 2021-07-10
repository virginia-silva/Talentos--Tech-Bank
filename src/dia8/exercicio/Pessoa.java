package dia8.exercicio;

public class Pessoa {

    int idade;
    int dia;
    int mes;
    int ano;
    int diaAtual;
    int mesAtual;
    int anoAtual;
    String nome;

    // Metodo que calcula a idade da pessoa
    public void calcularIdade(int dia, int mes, int ano) {
        this.anoAtual = ano;
        this.idade = this.anoAtual - this.ano;

    }

    // Metodo que retorna a idade da pessoa
    public int informarIdade(){

        return this.idade;
    }

    // Metodo que retorna o nome da pessoa
    public String informaNome(){

        return nome;
    }

    // Define a data de nascimento
    public void ajustaDataNasciment(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

}
