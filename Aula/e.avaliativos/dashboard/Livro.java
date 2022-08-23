package dashboard;

import java.time.LocalDate;

public class Livro extends Autor{
    private String titulo;
    private String editora;
    private LocalDate dtLancamento;

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

//Ia colocar um método para converter string em data, mas de acordo o esquema o atributo tem que ser localDate
}
