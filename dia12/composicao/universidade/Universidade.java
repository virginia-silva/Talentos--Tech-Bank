package dia12.composicao.universidade;

public class Universidade {

    private String nome;

    private String local;

    Universidade(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void informarNome() {
        System.out.println(this.nome);
    }

}
