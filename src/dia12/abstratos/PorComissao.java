package dia12.abstratos;

public final class PorComissao extends Empregado {

    private double salario;
    private double comissao;
    private int numeroDeVendas;


    public PorComissao(String nome, double salario, double comissao, int numeroDeVendas) {
        super(nome);
        this.salario = salario;
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public double ganha() {
        return this.salario + comissao * numeroDeVendas;
    }
}