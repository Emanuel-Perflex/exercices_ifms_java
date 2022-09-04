package heranca.aula2;

public class Funcionario extends Pessoa {
    private String matricula;
    private String dataAdmissao;
    private String cargo;


    //------------------------------------//Getters e Setters\\-----------------------------//
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
