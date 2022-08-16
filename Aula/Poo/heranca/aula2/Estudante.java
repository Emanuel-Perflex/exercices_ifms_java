package poo.heranca.aula2;

import java.time.LocalDate;

public class Estudante {
    private String RA;
    private String curso;
    private LocalDate hInicio;


    public String getCurso() {
        return curso;
    }

    public String getRA() {
        return RA;
    }

    public LocalDate gethInicio() {
        return hInicio;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public void sethInicio(LocalDate hInicio) {
        this.hInicio = hInicio;
    }
}
