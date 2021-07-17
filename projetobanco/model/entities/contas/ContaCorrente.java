package projetobanco.model.entities.contas;
import projetobanco.model.entities.Banco;
import projetobanco.model.entities.usuarios.Cliente;

public class ContaCorrente extends ContaBancaria{

    private double saldoChequeEspecial;
    private double saldoAdicionalChequeEspecial;
    private double limiteChequeEspecial;
    private double adicionalChequeEspecial;
    private double saldoTotal = getSaldo()+saldoChequeEspecial+saldoAdicionalChequeEspecial;
    private double saldoComCheque = getSaldo() + saldoChequeEspecial;

    public ContaCorrente(int numeroDaConta, Cliente titular, double saldo) {
        super(numeroDaConta, titular, saldo);
        limiteChequeEspecial = 0;
        adicionalChequeEspecial = 0;
        saldoChequeEspecial = 0;
        saldoAdicionalChequeEspecial = 0;
    }

    @Override
    public void depositar(double valor){
        double valor1;
        if(valor > 0 && (limiteChequeEspecial == saldoChequeEspecial)){
            setSaldo(getSaldo()+valor);
            System.out.println("Valor de R$:"+String.format("%.2f",valor)+" foi depositado com sucesso!");
        }else if(valor > 0 && limiteChequeEspecial != saldoChequeEspecial){  // condição que repõe o cheque especial ao depositar um valor
            if(adicionalChequeEspecial != saldoAdicionalChequeEspecial){
                valor1 = valor - (adicionalChequeEspecial- saldoAdicionalChequeEspecial);
                if(valor1 > 0){
                    saldoAdicionalChequeEspecial = adicionalChequeEspecial;
                    saldoChequeEspecial = saldoChequeEspecial+valor1;
                    if(saldoChequeEspecial > limiteChequeEspecial){
                        setSaldo(saldoChequeEspecial-limiteChequeEspecial);
                    }
                }else{
                    saldoAdicionalChequeEspecial = saldoAdicionalChequeEspecial + valor;
                }
            }
        }else{
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    @Override // Verificar os calculos
    public double sacar(double valor) {
        if(valor > saldoTotal){ // acima do saldo total
            throw new IllegalArgumentException("Saldo insuficiente!");
        }else if(valor < 0){
            throw new IllegalArgumentException("Valor incorreto!");
        }else if(valor > getSaldo() && valor <= (getSaldo()+saldoChequeEspecial)){ // valor abaixo  ou igual do total com cheque
            saldoChequeEspecial = saldoChequeEspecial - (valor - getSaldo());
            setSaldo(0);
            System.out.println("Seu cheque especial foi utilizado");
            System.out.println("Saldo após a transação: R$"+String.format("%.2f",getSaldo())+" Cheque especial disponível: R$"+String.format("%.2f",getSaldoChequeEspecial()));
            return saldoChequeEspecial;
        }else if(valor > saldoComCheque && valor <= saldoTotal){ // valor acima do cheque especial e dentro do adiconal
            saldoAdicionalChequeEspecial = saldoTotal - valor; // verificar esta condição
            saldoChequeEspecial = 0;
            setSaldo(0);
            System.out.println("Seu adicional do cheque foi utilizado");
            System.out.println("Foi utilizado R$: "+String.format("%.2f",(adicionalChequeEspecial-saldoAdicionalChequeEspecial))+" de adicional de saldo emergencial");
            return saldoAdicionalChequeEspecial;
        }else if(valor <= getSaldo() && valor > 0){
            setSaldo(getSaldo()-valor);
            return getSaldo();
        }else if(getSaldo() == 0 && saldoChequeEspecial > valor){
            saldoChequeEspecial = saldoChequeEspecial - valor;
            System.out.println("Seu cheque especial foi utilizado");
            System.out.println("Saldo da conta R$: 00,00 Cheque especial R$: "+String.format("%.2f",saldoChequeEspecial));
            return saldoChequeEspecial;
        }else if(getSaldo() == 0 && saldoChequeEspecial == 0 && saldoAdicionalChequeEspecial > valor){
            saldoAdicionalChequeEspecial = saldoAdicionalChequeEspecial - valor;
            System.out.println("Foi utilizado R$: "+String.format("%.2f",adicionalChequeEspecial-saldoAdicionalChequeEspecial)+" do seu limite emergencial");
            return saldoAdicionalChequeEspecial;
        }else{
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(double saldoChequeEspecial) {
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    public double getSaldoAdicionalChequeEspecial() {
        return saldoAdicionalChequeEspecial;
    }

    public void setSaldoAdicionalChequeEspecial(double saldoAdicionalChequeEspecial) {
        this.saldoAdicionalChequeEspecial = saldoAdicionalChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getAdicionalChequeEspecial() {
        return adicionalChequeEspecial;
    }

    public void setAdicionalChequeEspecial(double adicionalChequeEspecial) {
        this.adicionalChequeEspecial = adicionalChequeEspecial;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public void adicionarLimiteChequeEspecial(double valor, int senhaGerente){
        // verificar se há um gerente com a senha
        if(valor < 0){
            throw new IllegalArgumentException ("Você não pode adicionar um valor negativo como limite");
        }
        Boolean condicao = Banco.getGerentes().stream().filter(x -> x.getIdentificador().equals(senhaGerente)).count() > 0;
        if(condicao){
            setLimiteChequeEspecial(valor);
            setAdicionalChequeEspecial(valor * 0.35);
            saldoChequeEspecial = limiteChequeEspecial;
            saldoAdicionalChequeEspecial = adicionalChequeEspecial;
            saldoComCheque = getSaldo()+saldoChequeEspecial;
            saldoTotal = getSaldo()+saldoChequeEspecial+saldoAdicionalChequeEspecial;
        }else{
            throw new IllegalArgumentException("Acesso negado!");
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\n")
                .append("Tipo de Conta: ")
                .append("Corrente");
        return sb.toString();
    }
}
