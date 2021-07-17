package projetobanco.model.entities.contas;

import projetobanco.model.entities.usuarios.Cliente;
import java.util.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {

    private int numeroDaConta;

    private Cliente titular;

    private double saldo;

    private List<Transacao> movimentacoes;

    public ContaBancaria(int numeroDaConta, Cliente titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
        movimentacoes = new ArrayList<>();
        movimentacoes.add(new Transacao("Criacao da Conta",saldo, Date.from(Instant.now())));
    }
    public abstract void depositar(double valor);

    public abstract double sacar(double valor);

    public void imprimirMovimentacoes(){
        movimentacoes.forEach(System.out::println);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getMovimentacoes() {
        return movimentacoes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titular: ")
                .append(this.titular.getNome())
                .append(" Número da Conta: ")
                .append(numeroDaConta)
                .append(" Saldo da Conta: R$:")
                .append(String.format("%.2f",saldo));
        return sb.toString();
    }
}
