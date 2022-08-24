package robo;
//Bibliotecas necessárias para o funcionamento das teclas
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
//Bilbiotecas padrões
import java.util.Scanner;

public class Machine extends JFrame{
    
    public void CapturarTeclado(){
        addKeyListener(new KeyAdapter() {
            public void teclaṔressionada(KeyEvent tecla){
                //Comparar código da tecla pressionada com a tecla que eu quero (Setas up, down, right e left)
                int cod = tecla.getKeyCode();
                int up = KeyEvent.VK_UP;
                int down = KeyEvent.VK_DOWN;
                int left = KeyEvent.VK_LEFT;
                int right = KeyEvent.VK_RIGHT;
            }
        });
    }


    public static void main(String[] args) {
        Robo maquina = new Robo();
        maquina.setX(0);
        maquina.setY(0);

        Scanner scanner = new Scanner(System.in);

        //A ideia é dar a opção de controle por coordenada ao usuário, ou por joystick;
        while (true) {
            //Rosto do robozinho
            System.out.println("Bem vindo ao roboMania 2.0");
            System.out.println("Gostaria de jogar por Joystick ou por Coordenadas?");
            scanner.nextLine();

            //Trabalhar com switch case
        }
    }
}
