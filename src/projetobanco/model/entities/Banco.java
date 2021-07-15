package projetobanco.model.entities;

import projetobanco.model.entities.contas.ContaBancaria;
import projetobanco.model.entities.usuarios.Gerente;
import projetobanco.model.services.ServicosDaConta;
import projetobanco.model.services.ServicosDoMenu;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final String NOME_BANCO = "Rainbow Bank";

    public Banco(){
        System.out.println("BANCO: "+NOME_BANCO+"  ***********************************");
    }

    public static void inicializar(){
        setContas(new ArrayList<>());
        setGerentes(new ArrayList<>());
        setContasInativas(new ArrayList<>());
        getGerentes().add(new Gerente("Virginia","11999995555",1037));
        getGerentes().add(new Gerente("Gisele","55988884457",1835));
        getGerentes().add(new Gerente("Bruno","75975554444",8899));
        ContaBancaria contaInicial = ServicosDaConta.criarContaBancaria();
        contas.add(contaInicial);
        ServicosDoMenu.exibirMenu();
    }

    private static List<ContaBancaria> contas ;

    private static List<Gerente> gerentes ;

    private static List<ContaBancaria> contasInativas;

    public static String getNomeBanco() {
        return NOME_BANCO;
    }

    public static List<ContaBancaria> getContasInativas() {
        return contasInativas;
    }

    public static void setContasInativas(List<ContaBancaria> contasInativas) {
        Banco.contasInativas = contasInativas;
    }

    public static void setContas(List<ContaBancaria> contas) {
        Banco.contas = contas;
    }

    public static void setGerentes(List<Gerente> gerentes) {
        Banco.gerentes = gerentes;
    }

    public static List<ContaBancaria> getContas(){
        return contas;
    }

    public static List<Gerente> getGerentes() {
        return gerentes;
    }
}
