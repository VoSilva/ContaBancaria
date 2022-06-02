public class ContaCorrente extends Conta {

    private double valorSaque;
    private double valorDeposito;

    public ContaCorrente(String nome, String endereco, int telefone, int idade, int celular, String email,
            String titular, int numeroConta, double saldoBancario, double valorDeposito, double valorSaque) {
        super(nome, endereco, telefone, idade, celular, email, titular, numeroConta, saldoBancario);
        this.valorDeposito = valorDeposito;
        this.valorSaque = valorDeposito;
    }
    
    public double getValorSaque() {
        return this.valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double getValorDeposito() {
        return this.valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    // CONTA CORRENTE NUNCA É NEGATIVA !!!

    // MÉTODO DEPOSITO BANCARIO,

    public void depositoBancario() {
        
        if (valorDeposito > 0) {
            super.setSaldoBancario(super.getSaldoBancario() + this.valorDeposito);
            System.out.println("Depósito feito com sucesso!");
        } else
            System.out.println("Erro ao relizar o depsito");
    }

    // MÉTODO SAQUE BANCARIO, VALOR NAO NEGATIVO
    public void sacarSaldo() {
        if ((super.getSaldoBancario() - this.valorSaque) >= 0) {
            super.setSaldoBancario(super.getSaldoBancario() - this.valorSaque);
            System.out.println("Saque realizado com sucesso!");

        } else
            System.out.println("Erro ao realizar o saque!");
    }

}