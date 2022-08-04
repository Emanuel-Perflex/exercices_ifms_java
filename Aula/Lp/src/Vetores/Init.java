package Vetores;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.random.*;

public class Init {
    public static void main(String[] args) {
        
        //Método de scanear tecla
        //Consegue ler QRCODE, cod de barra....
        Scanner in = new Scanner(System.in) ;
        
        //convertendo double pra int, má pratica
        //int num = (int) 1+ (Math.random());

        //estrutura de vetor    
        int vetor[] = new int[5];

        int vetor2[] = {1,2,3,4,5,6};

        int matriz[][] = new int [2][2];
        //estudar recursividade;
        
        vetor [1] = 3;

        //laço de repetição;

        for (int i = 0; i < 5; i++){
            vetor [i] = 3;
            vetor2[i] = 2;
            //System.out.print(vetor[i]);
        }

        //Quando printa uma posição no vetor que não tem nada atribuido será atribuido e impresso um 0, por conta do Garbage collector que faz a função de peneira;
        //Exception é um erro no interpretador, quando ele ocorre o programa morre;

        //while (true){} //loop infinito

        /*
        //pegando teclas 
        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Digite algo ai:");
            vetor[counter] = in.nextInt();
        }
        */
        
        //Numeros aleatórios
        Random random = new Random();
        //System.out.println(aleatorio.nextInt(25 + 2));
        
        //Atividade 1;
        /*
        for (int j = 0; j < 2; j++){
            for (int i = 0; i < 2; i++) {
                matriz[j][i] = random.nextInt(10);
                System.out.println(matriz[j][i]);
            }
        }*/


        //desafio: Fazer uma matriz com numeros de 10 a 20 que não podem repetir
        int max = 20, min = 10;
        int vetor[] = new int[10];
        Random rand = new Random();
        int qto = 0;
        for (int i = 0; i < 10; i++) {
        boolean found = true;
        int temp = 0;
        
        while (found) {
            found = false;
            temp = rand.nextInt(max - min) + min;
            for (int j = 0; j < qto; j++) {
              if (temp == vetor[j]) {
                found = true;
              }
            }
          }
          vetor[i] = temp;
          System.out.println(temp + " ");
          qto++;
        }
    }
}