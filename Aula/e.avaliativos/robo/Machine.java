package robo;

//Bilbiotecas padrões
import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        Robo maquina = new Robo();

        Scanner scanner = new Scanner(System.in);
        //Decidi dar o nome ao joguinho de roboMania, a ideia veio de um epsódio de: "As 3 espiãs demais"
        System.out.println("\nBem vindo ao roboMania 2.0");
        System.out.println("Gostaria de jogar por 1_ Joystick ou por 2_Coordenadas?");
        int opcao = scanner.nextInt();

        //CapturarTeclado tecla = new CapturarTeclado();

        switch (opcao) {
            case 1:
                new CapturarTeclado();    
                break;
            case 2:
                maquina.coordenadas();
                break;
            default:
                System.out.println("Input não reconhecido, tente novamente");
                break;
        }

    }
}
