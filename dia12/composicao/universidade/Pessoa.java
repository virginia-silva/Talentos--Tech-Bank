package dia12.composicao.universidade;

public class Pessoa {

    private String nome;

    private Universidade universidadeQueTrabalha;

    Pessoa(String nome, Universidade universidadeQueTrabalha) {
        this.nome = nome;
        this.universidadeQueTrabalha = universidadeQueTrabalha;
    }

    Pessoa(String nome, String nomeDaUniversidadeQueTrabalha, String localDaUniversidade) {
        this.nome = nome;
        this.universidadeQueTrabalha = new Universidade(nomeDaUniversidadeQueTrabalha, localDaUniversidade);
    }

    public void informarDadosDaPessoa() {
        System.out.println(this.nome);
        this.universidadeQueTrabalha.informarNome();
    }


}
