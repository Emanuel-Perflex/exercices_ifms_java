package robo;

import java.util.Scanner;

public class Machine {
    

    public static void main(String[] args) {
        Robo maquina = new Robo();
        Scanner ler = new Scanner(System.in);

        int n;

        while (true) {
            n = ler.nextInt();
            maquina.cima();
        }
    }
}
