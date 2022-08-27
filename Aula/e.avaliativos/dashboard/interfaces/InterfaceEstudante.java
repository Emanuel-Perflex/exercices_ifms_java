package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class InterfaceEstudante {
    //JFrame
    JFrame main = new JFrame();
    //Painel main
    JPanel painelEstudante = new JPanel();
    

    public InterfaceEstudante (){
        painelEstudante.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelEstudante.setLayout(new GridLayout(0, 1));

        //--------------------------------Configuração Da janela--------------------------------//
        main.add(painelEstudante, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(500, 300);
        main.setVisible(true); 
    }
}
