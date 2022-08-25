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
            //Comparar código da tecla pressionada com a tecla que eu quero (Setas up, down, right e left)
            int cod = tecla.getKeyCode();
            int up = KeyEvent.VK_UP;
            int down = KeyEvent.VK_DOWN;
            int left = KeyEvent.VK_LEFT;
            int right = KeyEvent.VK_RIGHT;
            
            Robo machine = new Robo();

            if (cod == up){
                machine.cima();
            } else if (cod == down) {
                machine.baixo();
            } else if (cod == left) {
                machine.esquerda();
            } else if (cod == right) {
                machine.direita();
            } else {
                System.out.println("Tecla não reconhecida");
            }    
            
        }});

        setSize(500,400);
        setLocationRelativeTo(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}