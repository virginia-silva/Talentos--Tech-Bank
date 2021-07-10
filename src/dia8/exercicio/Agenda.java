package dia8.exercicio;

import java.util.Scanner;
import java.util.Vector;

public class Agenda {

    private static int total_pessoas;
    private static char name[];
    private static int agend_idade;
    private static String agend_nomes;
    private static double agend_altura;
    static Vector set_name = new Vector<String>();
    static Vector set_age = new Vector<Integer>();
    static Vector set_altura = new Vector<Double>();

    public void quantidade_de_pessoa(int qtdade) {
        total_pessoas = qtdade;
        name = new char[qtdade];

    }

    @SuppressWarnings("unchecked")
    public static void set_armazenaPessoa(int i) {
        Scanner in_teclado;
        System.out.println("Digite o nome da " + (i + 1) + "  pessoa:");
        in_teclado = new Scanner(System.in);
        agend_nomes = in_teclado.nextLine();
        System.out.println("Digite a idade da " + (i + 1) + " pessoa:");
        in_teclado = new Scanner(System.in);
        agend_idade = in_teclado.nextInt();
        System.out.println("Digite a altura da " + (i + 1) + " pessoa:");
        in_teclado = new Scanner(System.in);
        String altura = in_teclado.nextLine();
        agend_altura = Double.parseDouble(altura);

        //gravando os dados pessoais
        set_name.add(i, agend_nomes);
        set_age.add(i, agend_idade);
        set_altura.add(i, agend_altura);

    }

    public static void get_imprimeAgenda(int qtdade_impressao) {

        System.out.println((qtdade_impressao + 1) + " )nome: " + set_name.get(qtdade_impressao));
        System.out.println("idade: " + set_age.get(qtdade_impressao));
        System.out.println("altura: " + set_altura.get(qtdade_impressao));

    }

    @SuppressWarnings("unchecked")
    public static void removePessoa(int remove_index) {
        set_name.set(remove_index, null);
        set_age.set(remove_index, null);
        set_altura.set(remove_index, null);
    }

    public static int buscaPessoa(String nome_busca) {
        // informa em que posição da agenda está a pessoa
        int position = -1;// se retornar negativo quer dizer que o nome nao consta na lista
        for (int i = 0; i < total_pessoas; i++) {
            if (set_name.get(i).equals(nome_busca)) {
                position = i;
            }
        }
        return position;
    }



    public static void main(String[] args) {
        //objectos e identificadores
        Agenda ag = new Agenda();
        int qtdade_pessoas, index;
        String nome;

        //inicializacao de objectos e identificadores
        System.out.println("Quantas pessoas deseja cadastrar? \n Total de cadastro: ");
        Scanner in_teclado = new Scanner(System.in);
        qtdade_pessoas = in_teclado.nextInt();
        ag.quantidade_de_pessoa(qtdade_pessoas);

        //instrucoes de cadastro de pessoas
        for (int i = 0; i < qtdade_pessoas; i++) {
            Agenda.set_armazenaPessoa(i);// cadastrar pessoas
        }

        //instrucoes de impressao de pessoas cadastrada
        for (int i = 0; i < qtdade_pessoas; i++) {
            Agenda.get_imprimeAgenda(i);//lista de pessoas cadastrada
        }

        //intrucoes de busca de uma pessoa na lista de cadastro
        System.out.println("Digite o nome da pessoa que procura:");
        in_teclado = new Scanner(System.in);
        nome = in_teclado.nextLine();
        int position = Agenda.buscaPessoa(nome);
        if (position >= 0) {
            System.out.println("O " + nome + " se encontra na posisao: " + (position + 1));
        } else {
            System.out.println("o nome desejado não esta nesta lista!");
        }

        // imprime os dados da pessoa que está na  posição “i” da agenda.
        System.out.println("Digite o numero de ordem da pessoa na lista: ");
        in_teclado = new Scanner(System.in);
        index = in_teclado.nextInt();
        for (int i = 0; i < qtdade_pessoas; i++) {
            if (i == (index - 1)) {
                Agenda.get_imprimeAgenda(i);
            }
        }

        //remover uma pessoa da lista
        System.out.println("Digite o numero de ordem da pessoa na lista que deseja remover: ");
        in_teclado = new Scanner(System.in);
        index = in_teclado.nextInt();
        for (int i = 0; i < qtdade_pessoas; i++) {
            if (i == (index - 1)) {
                Agenda.removePessoa(i);
            }
        }

        //instrucoes de impressao de pessoas cadastrada
        for (int i = 0; i < qtdade_pessoas; i++) {
            Agenda.get_imprimeAgenda(i);//lista de pessoas cadastrada
        }
    }

}
