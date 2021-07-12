package dia12.abstratos;

public final class Chefe extends Empregado {

    private double salario;

    public Chefe(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double ganha() {
        return this.salario > 0 ? this.salario : 0.0;
    }
}
