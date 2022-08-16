package poo.heranca.aula2;

import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String editor;
    private LocalDate dataLancamento;

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public String getEditor() {
        return editor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
