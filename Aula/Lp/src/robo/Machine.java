package robo;

import java.util.Scanner;

public class Machine {
    

    public static void main(String[] args) {
        Robo maquina = new Robo();
        
        Scanner opcao = new Scanner(System.in);
        

        while (true){

            System.out.println("\nGostaria de controlar por joystick?");
            String leitura = opcao.nextLine(); 

            if (leitura.equals("Sim") || leitura.equals("sim")){
                while (true) {
                    maquina.leitura();
                    maquina.distancia();    
                }
            } else {
                System.out.println("Insira as coordenadas iniciais e a do destino");
                maquina.coordenadas();
                break;
            }
        }
    }
}
