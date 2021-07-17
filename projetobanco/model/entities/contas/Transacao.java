package projetobanco.model.entities.contas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Transacao {

    private String nome; // pode ser depósito, saque, transferência

    private double valorMovimentado;

    private Date dataDaMovimentacao;

    public Transacao(String nome, double valorMovimentado, Date dataDaMovimentacao) {
        this.nome = nome;
        this.valorMovimentado = valorMovimentado;
        this.dataDaMovimentacao = dataDaMovimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMovimentado() {
        return valorMovimentado;
    }

    public void setValorMovimentado(double valorMovimentado) {
        this.valorMovimentado = valorMovimentado;
    }

    public Date getDataDaMovimentacao() {
        return dataDaMovimentacao;
    }

    public void setDataDaMovimentacao(Date dataDaMovimentacao) {
        this.dataDaMovimentacao = dataDaMovimentacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return Double.compare(transacao.valorMovimentado, valorMovimentado) == 0 && Objects.equals(nome, transacao.nome) && Objects.equals(dataDaMovimentacao, transacao.dataDaMovimentacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valorMovimentado, dataDaMovimentacao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // conferir se essa string do formato de data está correta
        sb.append("Tipo: ").append(nome).append(" Valor: R$:").append(String.format("%.2f",valorMovimentado)).append(" Data e Hora: ").append(sfd.format(dataDaMovimentacao));
        return sb.toString();
    }
}
