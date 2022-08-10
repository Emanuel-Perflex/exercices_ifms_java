package lp.ordenacao;

public class Auladois {
    //Pesquisar Algoritmo de bubble sort
    
    /*
    maneiras de fazer um vetor com valores crescentes

    Algoritmo de Selection sort: 
    - Se percorre o laço e guarda o indice do menor valor, e depois troca; 
    */

    public static void main(String[] args) {
          int vetor[] = {7,3,9,1,10};
          int menor, indiceMenor;

          for (int i = 0; i < vetor.length - 1; i++) {
              menor = vetor[i];
              indiceMenor = i;

              for (int j = i + 1; j < vetor.length; j++){
                  if (vetor[j] < menor){
                      menor = vetor[j];
                      indiceMenor = j;
                  }
              }
              vetor[indiceMenor] = vetor[i];
              vetor[i] = menor;
        }
        
        
        for(int i = 0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    } 
}
