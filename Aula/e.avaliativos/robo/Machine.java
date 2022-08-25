package robo;

//Bilbiotecas padrões
import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        Robo maquina = new Robo();
        maquina.setX(0);
        maquina.setY(0);

        Scanner scanner = new Scanner(System.in);
        //Decidi dar o nome ao joguinho de roboMania, a ideia veio de um epsódio de: "As 3 espiãs demais"
        System.out.println("Bem vindo ao roboMania 2.0");
        System.out.println("Gostaria de jogar por Joystick ou por Coordenadas?");
        scanner.nextLine();

        //A ideia é dar a opção de controle por coordenada ao usuário, ou por joystick;
        while (true) {
            //Rosto do robozinho
            
            
            if (scanner.equals("Joystick") || scanner.equals("joystick")){
                new CapturarTeclado();
            } else if (scanner.equals("Coordenadas") || scanner.equals("coordenadas")) {
                maquina.coordenadas();
            } else {
                System.out.println("Infelizmente não foi possível reconhecer o que foi digitado. Execute novamente e digite ''Coordenadas'' ou ''Joystick'' para solicitar o meio desejado");
            }
            
        }
    }
}
