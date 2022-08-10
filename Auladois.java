package lp.ordenacao;

public class Auladois {
    //Pesquisar Algoritmo de bubble sort
    
    /*
    maneiras de fazer um vetor com valores crescentes

    Algoritmo de Selection sort: 
    - Se percorre o laço e guarda o indice do menor valor, e depois troca; 
    */

    public static void main(String[] args) {
          int vetor[] = {1,2,4,3,5};
          int menor;
          int aux;

          for (int i = 0; i < vetor.length - 1; i++) {
              menor = vetor[i];
              aux = i;

              for (int j = i + 1; j < vetor.length; j++){
                  if (vetor[j] < menor){
                      menor = vetor[j];
                      aux = j;
                  }
              }
              vetor[aux] = vetor[i];
              vetor[i] = menor;
        }
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    } 
}
