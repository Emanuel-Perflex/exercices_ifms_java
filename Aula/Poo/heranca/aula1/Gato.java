package heranca.aula1;

public class Gato extends AnimalTerrestre {
 
    public Gato(){
        super();
    }
    
    //Polimorfismo
    @Override
    public void emitirSom(){
        System.out.println(" O gato" + this.nome + "diz Meoww");
    }
}