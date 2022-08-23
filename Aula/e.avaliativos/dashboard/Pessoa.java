package dashboard;
//Se o cidadão já estiver devendo um livro, não será possível que o mesmo consiga realizar o empréstimo de outro
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String logradouro;
    private String telefonePrincipal;
    

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
    
    //converter String para idade
    public void DizerIdade (String data){
        LocalDateTime date = LocalDateTime.parse(data,
        DateTimeFormatter.ofPattern("M/d/uuuu", Locale.ENGLISH));
    }

    //TO string
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: ";
    }
}