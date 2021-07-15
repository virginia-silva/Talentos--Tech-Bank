package projetobanco.model.services;

import projetobanco.model.entities.Banco;
import projetobanco.model.entities.contas.ContaBancaria;
import projetobanco.model.entities.contas.ContaCorrente;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ServicosDoMenu {

    public static void exibirMenu(){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        Boolean gerente = false;

        int n = 0;
        while(n == 0){
            try{
                System.out.println();
                System.out.println("************RAINBOWBANK**********");
                System.out.println("Opções: ");
                System.out.println("1. Acessar como gerente");
                System.out.println("2. Iniciar operação para usuários");
                System.out.print("Entre com a opção desejada: ");
                int opAuxE = reader.nextInt();
                reader.nextLine();
                if(opAuxE == 1){
                    System.out.print("Digite a sua senha: ");
                    int senhaAux11 = reader.nextInt();
                    reader.nextLine();
                    if (Banco.getGerentes().stream().filter(x -> (x.getIdentificador().equals(senhaAux11))).findFirst().isPresent()){
                        gerente = true;
                    }else{
                        throw new IllegalArgumentException("Senha Inválida, Acesso Negado!");
                    }
                }else if(opAuxE >2){
                    throw new IllegalArgumentException("Entrada Inválida!");
                }else if(opAuxE ==2){
                    gerente = false;
                }

                int conta;
                if(!gerente){
                    System.out.print("Digite o numero da conta com a qual deseja trabalhar:");
                    validarInteiro(reader);
                    conta = reader.nextInt();
                    reader.nextLine();
                }else{
                   conta = Banco.getContas().get(0).getNumeroDaConta();
                }
                ContaBancaria auxiliar = ServicosDaConta.encontrarContaBancaria(conta);
                listarOpcoes(auxiliar,gerente);
                validarInteiro(reader);
                int opcao = reader.nextInt();
                reader.nextLine();
                validarOpcaoEscolhida(opcao,auxiliar);
                n=processarOpcao(opcao,auxiliar,reader,gerente);

            }catch (IllegalArgumentException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        reader.close();

    }

    public static void listarOpcoes(ContaBancaria contaBancaria, Boolean gerente){
        System.out.println(retornarCumprimento());
        if(gerente){
            System.out.println("MENU DE GERENTE**********************");
            System.out.println("Opções:");
            System.out.println("1. Para adicionar uma nova conta");
            if(contaBancaria.getClass().equals(ContaCorrente.class)) listarOpcoesContaCorrente();
            System.out.println("3. Verificar movimentação de conta pelo número");
            System.out.println("4. Para encerrar uma conta");
            System.out.println("5. Listar as contas inativas");

        }else{
            System.out.println("MENU DE OPERAÇÕES********************");
            System.out.println("Opções:");
            System.out.println("1. Listar extrato");
            System.out.println("2. Realizar saque");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar trasnferência");
            System.out.println("5. Verificar o saldo da conta:");
        }
        System.out.println("6. Para sair");
        System.out.print("Entre com a opção desejada: ");
    }

    public static int processarOpcao(int opcao, ContaBancaria contaBancaria, Scanner reader, Boolean gerente){

        switch (opcao){
            case 1:
                if(gerente){ // Adicionar uma conta
                    ServicosDaConta.criarContaBancaria();
                }else{ // Cliente - imprimir extrato
                    ServicosDaConta.imprimirExtrato(contaBancaria);
                }
                break;
            case 2:
                if(gerente){// Adicionar limite de cheque especial
                    if(contaBancaria.getClass().equals(ContaCorrente.class)){
                        System.out.print("Confirme a sua senha: ");
                        validarInteiro(reader);
                        int senhaAux = reader.nextInt();
                        reader.nextLine();
                            if(Banco.getGerentes().stream().filter(x -> x.getIdentificador().equals(senhaAux)).count() > 0){ // Verificação da senha
                                System.out.print("Informe a conta que deseja adicionar o cheque especial: ");
                                validarInteiro(reader);
                                int contaInf = reader.nextInt();
                                reader.nextLine();
                                ContaCorrente contaBancaria1 = (ContaCorrente) ServicosDaConta.encontrarContaBancaria(contaInf);
                                System.out.print("Digite o valor que deseja adicionar: ");
                                validarDouble(reader);
                                double valorAux1 = reader.nextDouble();
                                reader.nextLine();
                                ServicosDaConta.adicionarLimiteDeChequeEspecial((ContaCorrente) contaBancaria1,senhaAux,valorAux1);
                                break;
                            }else{ // Caso a senha esteja incorreta
                                throw new IllegalArgumentException("Acesso Negado!");
                            }
                    }else{
                        throw new IllegalArgumentException("Operação permitida somente para conta corrente");
                    }
                }else{ // Cliente - Realizar um saque
                    System.out.print("Digite o valor que deseja sacar: ");
                    validarDouble(reader);
                    double valor = reader.nextDouble();
                    reader.nextLine();
                    ServicosDaConta.sacar(valor,contaBancaria);
                    break;
                }
            case 3:
                if(gerente){// Buscar uma conta pelo numero
                    System.out.print("Digite o numero da conta que deseja buscar: ");
                    validarInteiro(reader);
                    int numContaAux = reader.nextInt();
                    reader.nextLine();
                    ContaBancaria contaa = ServicosDaConta.encontrarContaBancaria(numContaAux);
                    contaa.imprimirMovimentacoes();
                }else{// Cliente - Realizar depósito
                    System.out.println("Digite o valor que deseja depositar: ");
                    validarDouble(reader);
                    double valorDeposito = reader.nextDouble();
                    reader.nextLine();
                    ServicosDaConta.depositar(valorDeposito,contaBancaria);
                }
                break;
            case 4:
                if(gerente){ // Encerrar uma conta
                    System.out.print("Digite o numero da conta que deseja encerrar: ");
                    validarInteiro(reader);
                    int numContaAux2 = reader.nextInt();
                    reader.nextLine();
                    ServicosDaConta.encerrarContaBancaria(numContaAux2);
                    break;
                }else{ // Cliente - Transferência entre contas
                    System.out.print("Digite o numero da conta para a qual deseja transferir: ");
                    int numConta = reader.nextInt();
                    reader.nextLine();
                    ContaBancaria contaDestino = ServicosDaConta.encontrarContaBancaria(numConta);
                    System.out.print("Digite o valor que deseja transferir: ");
                    double valorTransf = reader.nextDouble();
                    reader.nextLine();
                    ServicosDaConta.transferir(contaBancaria,contaDestino,valorTransf);
                    break;
                }
            case 5:// Listar contas inativas
                if(gerente){
                    System.out.println("Contas Inativas");
                    Banco.getContasInativas().forEach(System.out::println);
                }else{
                    System.out.println("O saldo atual da conta é de R$: "+String.format("%.2f",contaBancaria.getSaldo()));
                    if(contaBancaria.getClass().equals(ContaCorrente.class)){
                        System.out.println("Limite de Cheque especial R$:"+String.format("%.2f",((ContaCorrente) contaBancaria).getLimiteChequeEspecial()));
                    }
                }

            case 6: //sair do programa
                return 1;
        }
        return 0;
    }


    public static void listarOpcoesContaCorrente(){
        System.out.println("2. Adicionar limite de cheque especial");
    }

    public static void validarInteiro(Scanner reader){
        if(!reader.hasNextInt()){
            throw new IllegalArgumentException("A entrada deve ser um número inteiro!");
        }
    }
    public static void validarDouble(Scanner reader){
        if(!reader.hasNextDouble()){
            throw new IllegalArgumentException("A entrada deve ser um número!");
        }
    }
    public static void validarOpcaoEscolhida(int opcao, ContaBancaria contaBancaria){
        if(opcao <= 0 || opcao > 6){
            throw new IllegalArgumentException("Opção Inválida!");
        }
    }

    // mudar retorno para String
    public static String retornarCumprimento(){
        int  hora = LocalTime.now().getHour();
        String saudacao ="";
        if(hora >= 0 && hora <= 12){
            saudacao = "Bom dia";
        }else if(hora < 18){
            saudacao = "Boa tarde!";
        }else if(hora >18){
            saudacao = "Boa noite!";
        }
        return saudacao+" "+retornarDiaDaSemana()+" Hora:"+hora;
    }

    public static String retornarDiaDaSemana(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(Date.from(Instant.now()));
        int num = cal.get(Calendar.DAY_OF_WEEK);
        String diaDaSemana = num == 1?"Domingo": num == 2?"Segunda-Feira": num == 3?"Terça-Feira": num == 4?"Quarta-Feira":
                num == 5?"Quinta-Feira": num == 6?"Sexta-Feira": num == 7?"Sabado":"erro";
        return diaDaSemana;
    }

}
