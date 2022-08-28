package dashboard.interfaces;
//imports
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dashboard.interfaces.emprestimo.InterfaceDevolucao;
import dashboard.interfaces.emprestimo.InterfaceEmprestimo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGeral implements ActionListener{
    //Jframe principal
    JFrame main = new JFrame();
    //Meus painéis
    JPanel painel = new JPanel();
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
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painel.setLayout(new GridLayout(0, 1));
        
        //Adicionando instruções;
        painel.add(etiqueta);
        //Botão cadastrar Livro
        painel.add(cadastrarLivro);
        //Botão cadastrar Funcionario
        painel.add(cadastrarFuncionario);
        
        //Botão de cadastrar Estudante
        painel.add(cadastrarEstudante);
       
        //botão Cadastrar Autor 
        painel.add(cadastrarAutor);
        
        //Botão cadastrar Emprestimo
        painel.add(cadastrarEmprestimo);
        
        //Botão para devolver livro emprestado
        painel.add(receberEmprestimo);
        //Botão sair
        painel.add(sair);

        //_________________________________________//Funções\\____________________________________________\\   
        //Função Cadastrar Livro
        cadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceLivro();
            }
        });

        //Função Cadastrar Funcionario
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceFuncionario();
            }
        });

        //Função cadastrar estudante
        cadastrarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceEstudante();
            }
        });

        //Função cadastrar Autor
        cadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceAutor();
            }
        });

        //Função cadastrar Emprestimo
        cadastrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceEmprestimo();
            }
        });

        //Função cadastrar Receber livro emprestado
        receberEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceDevolucao();
            }
        });

        //Função sair
        sair.addActionListener(this);
        
//--------------------------------Configuração Da janela--------------------------------//
        main.add(painel, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(300, 400);
        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
