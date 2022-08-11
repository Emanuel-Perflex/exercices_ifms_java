package poo.heranca;

import java.util.Set;

//Quando abstrata é impedidade de gerar instancia
public abstract class AnimalTerrestre {
    protected String nome;
    protected String raca;
    protected int idade;
    protected Dono dono;

    public Dono getDono() {
        return dono;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
    
    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    //Metodos abstratos não podem ter corpo
    //Se obrigamos todos terem um metodo da superclasse, chamamos de polimorfimo
    public abstract void emitirSom();

}
