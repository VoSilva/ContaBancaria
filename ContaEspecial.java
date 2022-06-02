public class ContaEspecial extends Conta {
    
    
    private double chequeEspecial;
    
    public ContaEspecial(String nome, String endereco, int telefone, int idade, int celular, String email,
            String titular, int numeroConta, double saldoBancario, double chequeEspecial) {
        super(nome, endereco, telefone, idade, celular, email, titular, numeroConta, saldoBancario);
        this.chequeEspecial = chequeEspecial;
    }
    

    
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    

    //CONTA ESPECIAL PODE TER VALOR NEGATIVO = A VALOR DO CHEQUE ESPECIAL!!!

    @Override
    public void depositoBancario(){
        
    }

    @Override
    public void sacarSaldo() {
        
        
    }
    
    





}
