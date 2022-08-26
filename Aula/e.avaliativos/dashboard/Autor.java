package dashboard;

public class Autor extends Pessoa {
    private String formacao;
    private int qtdLivros;


    //------------------------------------//Getters e Setters\\-----------------------------//
    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQtdLivros() {
        return this.qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }
}
