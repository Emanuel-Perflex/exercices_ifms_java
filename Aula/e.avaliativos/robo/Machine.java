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
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class Machine implements ActionListener{
        int x = 0;
        int y = 0;

        //Devido ao meu insistente fracasso na tentativa de implementar o teclado, Farei com botões na base do clique mesmo;
        JFrame frame = new JFrame();
        JPanel painel = new JPanel();
        JLabel etiquetaMain = new JLabel("As coordenadas atuais são: (0,0)");

        //Botões
        JButton cima = new JButton("Cima");
        JButton baixo = new JButton("Baixo");
        JButton esquerda = new JButton("Esquerda");
        JButton direita = new JButton("Direita");
        public Machine(){

            //Configurações Painel
            painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
            painel.setLayout(new GridLayout(0, 1));
            painel.add(etiquetaMain);

            painel.add(cima);
            cima.addActionListener(this);
            painel.add(baixo);
            painel.add(esquerda);
            painel.add(direita);

            frame.add(painel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setTitle("RoboMania"); 
            frame.setSize(600,200);
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
                break;
                //System.exit(0);
            case 2:
                maquina.coordenadas();
                break;
            default:
                System.out.println("Input não reconhecido, tente novamente");
                break;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x++;
        etiquetaMain.setText("As coordenadas atuais são: (" + x + "," + y + ")");
    }
}
