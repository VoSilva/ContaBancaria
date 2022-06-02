public abstract class Conta extends Cliente {
    private String titular;
    private int numeroConta;
    private double saldoBancario;

    public Conta(String nome, String endereco, int telefone, int idade, int celular, String email, String titular, int numeroConta, double saldoBancario) {
        super(nome, endereco, telefone, idade, celular, email);
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldoBancario = saldoBancario;
    }

    

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoBancario() {
        return this.saldoBancario;
    }

    public void setSaldoBancario(double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    public void sacar(){
        
    }

    public abstract void depositoBancario();
    public abstract void sacarSaldo();
    //ADD METODO  TRANSFERIR DEPOIS
    
}