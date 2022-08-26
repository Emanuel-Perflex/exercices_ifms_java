package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceLivro {
    //JFrame
    JFrame main = new JFrame();
    //painéis
    JPanel painelLivro = new JPanel();
    //Textareas
    JTextArea titulo = new JTextArea();
    JTextArea editora = new JTextArea();
    JTextArea lancamento = new JTextArea();
    JTextArea autor = new JTextArea();
    //Labeis
    JLabel tituloL = new JLabel("Insira o nome do livro:");
    JLabel editoraL = new JLabel("Insira o nome da editora:");
    JLabel lancamentoL = new JLabel("Insira a data de Lançamento:");
    JLabel autorL = new JLabel("Insira o nome do autor:");
    //Botões
    JButton cadastrarButton = new JButton("Cadastrar Livro");
    JButton sairButton = new JButton("Sair");
    JButton backButton = new JButton("Voltar ao menu");


    public InterfaceLivro(){
        painelLivro.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelLivro.setLayout(new GridLayout(0, 1));
        //Titulo
        painelLivro.add(tituloL);
        painelLivro.add(titulo);
        //Editor
        painelLivro.add(editoraL);
        painelLivro.add(editora);
        //Lancamento
        painelLivro.add(lancamentoL);
        painelLivro.add(lancamento);
        //Autor
        painelLivro.add(autorL);
        painelLivro.add(autor);

        //Botões
        painelLivro.add(cadastrarButton);
        painelLivro.add(sairButton);
        painelLivro.add(backButton);


//--------------------------------Configuração Da janela--------------------------------//
        main.add(painelLivro, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(800, 600);
        main.setVisible(true);
    }
}
