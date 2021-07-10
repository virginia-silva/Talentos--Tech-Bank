package dia12.abstratos;

public abstract class Empregado {

    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double ganha();

    public static void xuxuBeleza() {
        System.out.println("Xuxu Beleza");
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                '}';
    }
}