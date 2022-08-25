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


            switch (cod) {
                case KeyEvent.VK_UP:
                    maquina.cima();
                    System.exit(0);
                case KeyEvent.VK_DOWN:
                    maquina.baixo();
                    break;
                case KeyEvent.VK_LEFT:
                    maquina.esquerda();
                    break;
                case KeyEvent.VK_RIGHT:
                    maquina.direita();    
                    break;    
                default:
                    System.out.println("Erro");
                    System.exit(0);
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