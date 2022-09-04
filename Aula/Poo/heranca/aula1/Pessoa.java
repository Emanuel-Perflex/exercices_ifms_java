package heranca.aula1;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected int passos;

    public int getPassos() {
        return this.passos;
    }

    public void setPassos(int passos) {
        this.passos = passos;
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

    public void andar () {
        System.out.println("Andando..........");
    }
    
    public void falar () {
        System.out.println("Falando..........");
    }
}
