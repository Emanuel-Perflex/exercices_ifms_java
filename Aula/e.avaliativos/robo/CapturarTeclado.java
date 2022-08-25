package robo;

//Bibliotecas necessárias para o funcionamento das teclas
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;

public class CapturarTeclado extends JFrame{
   

    //Método responsável por capturar a tecla e então tratar ela
    public CapturarTeclado(){

    addKeyListener(new KeyAdapter() {

        public void keyPressed(KeyEvent tecla){
            int cod = tecla.getKeyCode();
            Robo maquina = new Robo();
            int x = 0;

            if (cod == KeyEvent.VK_UP){
                x++;
                System.out.println(x);
            } else if (cod == KeyEvent.VK_DOWN) {
                maquina.baixo();
            } else if (cod == KeyEvent.VK_LEFT) {
                maquina.esquerda();
            } else if (cod == KeyEvent.VK_RIGHT) {
                maquina.direita();
            } else {
                System.out.println("Tecla não reconhecida");
            }    
            
        }});
        //Mensagem ao usuário
        setTitle("Mexa com as teclas para o robo se mexer");
        //Tamanho do executável
        setSize(600,0);
        setLocationRelativeTo(this);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}