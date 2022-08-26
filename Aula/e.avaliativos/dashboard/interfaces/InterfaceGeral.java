package dashboard.interfaces;
//imports
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

public class InterfaceGeral implements ActionListener{
    JFrame main = new JFrame();
    JFrame teste = new JFrame();

    //Meus painéis
    JPanel p1 = new JPanel();
    JPanel painelLivro = new JPanel();
    JPanel painelFuncionario = new JPanel();
    JPanel painelEstudante = new JPanel();
    JPanel painelAutor = new JPanel();
    JPanel painelEmprestimo = new JPanel();
    JPanel painelDevolucao = new JPanel();
    
    //Etiquetas p1
    JLabel etiqueta = new JLabel("Escolha a opção desejada:");
    //BOtões p1
    JButton cadastrarLivro = new JButton("CadastrarLivro");
    JButton cadastrarFuncionario = new JButton("Cadastrar Funcionario");
    JButton cadastrarEstudante = new JButton("Cadastrar Estudante");
    JButton cadastrarAutor = new JButton("Cadastrar Autor");
    JButton cadastrarEmprestimo = new JButton("Realizar Emprestimo");
    JButton receberEmprestimo = new JButton("Receber Emprestimo");
    JButton sair = new JButton("Sair");

    public InterfaceGeral(){
//---------------------------------------//Painel 1\\---------------------------------------//
        p1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        p1.setLayout(new GridLayout(0, 1));
        
        //Adicionando instruções;
        p1.add(etiqueta);
        //Botão cadastrar Livro
        p1.add(cadastrarLivro);
        cadastrarLivro.addActionListener(this);
        //Botão cadastrar Funcionario
        p1.add(cadastrarFuncionario);
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1.setVisible(false);
                painelFuncionario.setVisible(true);
            }
        });
        //Botão de cadastrar Estudante
        p1.add(cadastrarEstudante);
        cadastrarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1.setVisible(false);
                painelEstudante.setVisible(true);
            }
        });
        //botão Cadastrar Autor 
        p1.add(cadastrarAutor);
        cadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1.setVisible(false);
                painelAutor.setVisible(true);
            }
        });
        //Botão cadastrar Emprestimo
        p1.add(cadastrarEmprestimo);
        cadastrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1.setVisible(false);
                painelEmprestimo.setVisible(true);
            }
        });
        //Botão para devolver livro emprestado
        p1.add(receberEmprestimo);
        receberEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1.setVisible(false);
                painelDevolucao.setVisible(true);
            }
        });
        //Botão para morrer
        p1.add(sair);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("\n\n\n|Sistema Encerrado!|");
                System.exit(0);
            }
        });

//---------------------------------------//Painel 2\\---------------------------------------//
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

        painelLivro.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelLivro.setLayout(new GridLayout(0, 1));
        
        JTextArea titulo = new JTextArea("Insira o título do Livro");

        painelLivro.add(cadastrarAutor);

//--------------------------------Configuração Da janela--------------------------------//
        main.add(p1, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(800, 600);
        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        main.dispose();
        painelLivro.setVisible(true);
    }
}
