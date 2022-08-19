package dashboard;
//Se o cidadão já estiver devendo um livro, não será possível que o mesmo consiga realizar o empréstimo de outro


public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String logradouro;
    private String telefonePrincipal;
    private boolean devedor;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTelefonePrincipal() {
        return this.telefonePrincipal;
    }

    public void setTelefonePrincipal(String telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    public boolean isDevedor() {
        return this.devedor;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }
    
}