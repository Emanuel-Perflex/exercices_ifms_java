package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;

public class InterfaceAutor {
    //JFrame
    JFrame main = new JFrame();
    //JPanel principal
    JPanel painelAutor = new JPanel();
    //Botões
    JButton buttonExit = new JButton("Sair");
    JButton buttonBack = new JButton("Voltar para o Menu");
    JButton buttoCadastrar = new JButton("Cadastrar Autor");
    //Labels
    JLabel labelNome = new JLabel("Insira o nome do autor: ");
    JLabel labelFaculdade = new JLabel("Insira a formação desse Autor: ");
    JLabel labelNascimento = new JLabel("Insira a data de Nascimento do Autor: ");
    //TextAreas
    JTextArea textNome = new JTextArea();
    JTextArea textFaculdade = new JTextArea();  
    JTextArea textNascimento = new JTextArea();


    public InterfaceAutor(){
        //Aqui que se mexe na responsividade
        painelAutor.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelAutor.setLayout(new GridLayout(0, 1));
        
        //'Divs'
        painelAutor.add(labelNome);
        painelAutor.add(textNome);
        //
        painelAutor.add(labelFaculdade);
        painelAutor.add(textFaculdade);
        //
        painelAutor.add(labelNascimento);
        painelAutor.add(textNascimento);
        
        //Adição de botões
        painelAutor.add(buttoCadastrar);
        painelAutor.add(buttonBack);
        painelAutor.add(buttonExit);

//--------------------------------Configuração Da janela--------------------------------//
        main.add(painelAutor, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(500, 300);
        main.setVisible(true);        
    }
}
