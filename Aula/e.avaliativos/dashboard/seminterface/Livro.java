package dashboard.seminterface;

import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dtLancamento;


  //-----------------------------------//Getters e Setters\\------------------------------//

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

}
