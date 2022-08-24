package robo;

import java.util.Scanner;

public class Machine {
    
    public static void main(String[] args) {
        Robo maquina = new Robo();
        maquina.setX(0);
        maquina.setY(0);

        Scanner scanner = new Scanner(System.in);

        //A ideia é dar a opção de controle por coordenada ao usuário, ou por joystick;
        while (true) {
            System.out.println("Bem vindo ao roboMania 2.0");
            System.out.println("Gostaria de jogar por Joystick ou por Coordenadas?");
            scanner.nextLine();

            //Trabalhar com switch case
        }
    }
}
