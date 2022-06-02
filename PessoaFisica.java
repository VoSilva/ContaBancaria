public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String endereco, int telefone, int idade, int celular, String email, String cpf) {
        super(nome, endereco, telefone, idade, celular, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  
    
}
