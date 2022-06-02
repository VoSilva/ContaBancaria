public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, String endereco, int telefone, int idade, int celular, String email) {
        super(nome, endereco, telefone, idade, celular, email);
        this.cnpj = cnpj;
    }


   
    
    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
     
    

}
