package Aula.poo.collections;

public class MinhaColecao {
    public static void main(String[] args) {

        //collections = array de objetos;
        //nas collections dá pra fazer o vetor de gato e sapato, o que com um array normal não é possível
 
        int vetor[] = new int[4]; //Dá muito trabalho, tem que estabelecer for para copiar posições e dá muito trabalho;

        //estrutura 
        //Uma list é uma classe que herda de coleção
        //Interface é classe abstrata 
        
        //Estudar list por conta
        
        //Estrutura de list
        //Declaração de collection
        List<livro> livros = new ArrayList<livro>();

        //Na main da parada - pra adicionar um elemento na list
        livros.add(l1);

        //Declaração de um objeto lista
        Livro l1 = new Livro("Minha coleção parte IV");

        //para percorrer - Também da pra usar o length no lugar do size
         for (int i = 0; i < livros.size; i++){
            System.out.println(livros.get(i).getNome());
        }
    }
}