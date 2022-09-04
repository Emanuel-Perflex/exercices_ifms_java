package heranca.aula1;

public class Dono extends Pessoa {
    private int qtoAnimais;

	public int getQtoAnimais() {
		return this.qtoAnimais;
	}

	public void setQtoAnimais(int qtoAnimais) {
		this.qtoAnimais = qtoAnimais;
	}

    //Construtor da classe
    public Dono(){
        super(); //boa pratica, chama o construtor da super classe
    }

    public void alimentarAnimal(AnimalTerrestre animal){
        System.out.println("Estou alimentando o cidadao chamado " + animal.getNome());
    }

    @Override
    public void andar (){
        this.passos++;
        System.out.println("Estou andando.....");
    }
}
