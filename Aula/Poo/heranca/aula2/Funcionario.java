package poo.heranca.aula2;

import java.time.LocalDate;

public class Funcionario {
    private int matricula;
    private String cargo;
    private LocalDate hEntrada;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void sethEntrada(LocalDate hEntrada) {
        this.hEntrada = hEntrada;
    }

    public String getCargo() {
        return cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public LocalDate gethEntrada() {
        return hEntrada;
    }
}
