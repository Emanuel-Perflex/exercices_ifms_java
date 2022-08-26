package dashboard;

import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;


//Decidi fazer tudo com Swing, Deus me ajude, Amém;
public class SistemaCadastro {
    JFrame main = new JFrame();
    JPanel p1 = new JPanel();
    JLabel l1 = new JLabel();

    JButton submit = new JButton();


    SistemaCadastro(){
        p1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        p1.setLayout(new GridLayout(0, 1));
        
        //Primeira Etiqueta
        p1.add(l1);
        l1.setText("Hello World");

        main.add(p1, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(800, 600);
        main.setVisible(true);
    }
       
        

    public static void main(String[] args) {
        new SistemaCadastro();
    }
}


/*

    "|                 Escolha um opção:                  |",
    "| -------------------------------------------------- | ",
    "| 1 - Cadastrar Livro                                |",
    "| 2 - Cadastrar Funcionario                          |",
    "| 3 - Cadastrar Estudante                            |",
    "| 4 - Cadastrar Autor                                |",
    "| 5 - Realizar Emprestimo                            |",
    "| 6 - Receber Emprestimo                             |",
    "| 0 - Sair                                           |",
    "| -------------------------------------------------- |", 
 
 */