package robo;

//Bilbiotecas padrões
import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Machine extends JFrame{
    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
    JLabel etiqueta = new JLabel("A posição atual é: ");
    //Acionando o construtor
    public Machine(){
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent tecla){
                int cod = tecla.getKeyCode();
                int x = 0;
                int y = 0;
                
                switch (cod) {
                    case KeyEvent.VK_UP:
                        x++;
                        y++;
                        etiqueta.setText("A posição atual é: " + x + "," + y);
                        break;
                    /*case KeyEvent.VK_DOWN:
                        maquina.baixo();
                        break;
                    case KeyEvent.VK_LEFT:
                        maquina.esquerda();
                        break;
                    case KeyEvent.VK_RIGHT:
                        maquina.direita();    
                        break;*/    
                    default:
                        System.exit(0);
                }
                
            }}); 

            

        //Configurações Painel
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painel.setLayout(new GridLayout(0, 1));
        painel.add(etiqueta);

        frame.add(etiqueta, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("RoboMania"); 
        frame.setSize(600,100);
        //Centralizar janela
        frame.setLocationRelativeTo(this);
        //Deixar vísivel
        frame.setVisible(true);
    
    }
 
    

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
                new Machine();    
                //System.exit(0);
            case 2:
                maquina.coordenadas();
                break;
            default:
                System.out.println("Input não reconhecido, tente novamente");
                break;
        }

    }
}
