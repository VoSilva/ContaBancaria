import java.util.Calendar;

public class ContaPoupança extends Conta {
    
    private double valorSaque;
    private double valorDeposito;
    private double valorRendimento;
    
    public ContaPoupança(String nome, String endereco, int telefone, int idade, int celular, String email,
    String titular, int numeroConta, double saldoBancario, double valorDeposito, double valorRendimento, double valorSaque) {
        super(nome, endereco, telefone, idade, celular, email, titular, numeroConta, saldoBancario);
        this.valorDeposito = valorDeposito;
        this.valorRendimento = valorRendimento;
        this.valorSaque = valorSaque;
    }


    public double getRendimento() {
        return this.valorRendimento;
    }

    public void setRendimento(double rendimento) {
        this.valorRendimento = rendimento;
    }

    //rendimento de 0.5% a cada período
    public boolean calculoRendimento(double taxa){

        Calendar hoje = Calendar.getInstance();

        if (valorRendimento == hoje.get(Calendar.DAY_OF_MONTH)){

            valorRendimento = super.getSaldoBancario() * 1.5;
            super.setSaldoBancario(super.getSaldoBancario() + valorRendimento);
            return true;
        } else return false;

    }


    @Override
    public void depositoBancario() {
        if (this.valorDeposito > 0 && this.valorDeposito != 0){
            super.setSaldoBancario(super.getSaldoBancario() + valorDeposito);
            System.out.println("Depósito na conta poupança realizado com sucesso!");
        } else System.out.println("Erro ao relizar o depósito ");
        
    }

    @Override
    public void sacarSaldo() {
        
    }


    

}
