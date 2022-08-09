package random;

import java.util.Random;

public class Aleatorios{
    
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        for (int i = 0; i < 100; i++){
            System.out.println(aleatorio.nextInt(27));
        }
        
    }
}