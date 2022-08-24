package dashboard;

public class Autor extends Pessoa {
    private String formacao;
    private int qtdLivros;

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
    //Verificar o que o Beto quer exatemente aqui, pois ficou muito vago. Se for apenas para preencher os atributos atuais, compensa mais fazer um collection
}
