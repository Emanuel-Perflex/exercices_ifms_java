package robo;

//Bibliotecas necessárias para o funcionamento das teclas
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;

public class CapturarTeclado extends JFrame{
    //Método responsável por capturar a tecla e então tratar ela
    public void Teclado(){
    addKeyListener(new KeyAdapter() {
        public void teclaṔressionada(KeyEvent tecla){
            int cod = tecla.getKeyCode();
            //int up = KeyEvent.VK_UP;
            //int down = KeyEvent.VK_DOWN;
            //int left = KeyEvent.VK_LEFT;
            //int right = KeyEvent.VK_RIGHT;
            
            Robo machine = new Robo();

            switch (cod) {
                case KeyEvent.VK_UP:
                    machine.cima();
                    break;
                case KeyEvent.VK_DOWN:
                    machine.baixo();
                    break;
                case KeyEvent.VK_RIGHT:
                    machine.direita();
                    break;
                case KeyEvent.VK_LEFT:
                    machine.esquerda();
                    break;        
                default:
                    System.out.println("Deu errado");
                    break;
            }

            /*if (cod == up){
                machine.cima();    
            } else if (cod == down) {
                machine.baixo();
            } else if (cod == left) {
                machine.esquerda();
            } else if (cod == right) {
                machine.direita();
            } else {
                System.out.println("Tecla não reconhecida");
            } */   
            
        }});

        setSize(500,400);
        setLocationRelativeTo(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}