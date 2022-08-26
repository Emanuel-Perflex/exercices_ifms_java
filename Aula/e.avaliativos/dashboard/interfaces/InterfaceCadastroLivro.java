package dashboard.interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

public class InterfaceCadastroLivro {
    JFrame livro = new JFrame();
    JPanel painel = new JPanel();
    JLabel label = new JLabel("Deu certo carai");

    InterfaceCadastroLivro(){
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painel.setLayout(new GridLayout(0, 1));

        livro.add(label);

        //Configurações de aplicativo
        /*livro.add(painel, BorderLayout.CENTER);
        livro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        livro.pack();
        livro.setLocationRelativeTo(null); 
        livro.setTitle("Cadastro Bibliotecário");
        livro.setSize(800, 600);
        livro.setVisible(true);*/
    }
}
