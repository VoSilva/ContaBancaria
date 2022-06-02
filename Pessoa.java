public class Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private int telefone;
    private int celular;
    private int idade;


    public Pessoa(String nome, String endereco, int telefone, int idade, int celular, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.idade = idade;
    }
   

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return this.celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
