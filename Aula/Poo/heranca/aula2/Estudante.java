package heranca.aula2;

import java.time.LocalDate;

public class Estudante extends Pessoa{
    private boolean devedor;
    private String curso;
    private LocalDate dtInicio;
    private String ra;

    //------------------------------------//Getters e Setters\\-----------------------------//

    public String getra() {
        return this.ra;
    }

    public void seraA(String ra) {
        this.ra = ra;
    }

    public boolean isDevedor() {
        return this.devedor;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }
}
