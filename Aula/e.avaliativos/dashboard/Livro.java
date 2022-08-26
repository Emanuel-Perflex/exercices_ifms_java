package dashboard;

import java.time.LocalDate;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dtLancamento;


      //------------------------------------//Getters e Setters\\-----------------------------//

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

    //------------------------------------//Métodos\\-----------------------------//
    public void cadastrarLivro(){
        System.out.println("Informe o nome do livro");
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();
        
        System.out.println(opcao);

    }
}
