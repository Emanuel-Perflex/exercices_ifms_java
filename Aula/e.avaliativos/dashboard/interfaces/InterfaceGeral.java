package dashboard.interfaces;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;

import java.awt.GridLayout;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class InterfaceGeral implements ActionListener{
    JFrame main = new JFrame();

    //Meus painéis
    JPanel p1 = new JPanel();
    JPanel painelLivro = new JPanel();
    JPanel painelFuncionario = new JPanel();
    JPanel painelEstudante = new JPanel();
    JPanel painelAutor = new JPanel();
    JPanel painelEmprestimo = new JPanel();
    JPanel painelDevolucao = new JPanel();
    
    //MInhas etiquetas
    JLabel etiqueta = new JLabel("Escolha a opção desejada:");

    JButton cadastrarLivro = new JButton("CadastrarLivro");
    JButton cadastrarFuncionario = new JButton("Cadastrar Funcionario");
    JButton cadastrarEstudante = new JButton("Cadastrar Estudante");
    JButton cadastrarAutor = new JButton("Cadastrar Autor");
    JButton cadastrarEmprestimo = new JButton("Realizar Emprestimo");
    JButton receberEmprestimo = new JButton("Receber Emprestimo");
    JButton sair = new JButton("Sair");

    public InterfaceGeral(){
        p1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        p1.setLayout(new GridLayout(0, 1));
        
        //Adicionando o minimo de instrução
        p1.add(etiqueta);

        //livro
        p1.add(cadastrarLivro);
        cadastrarLivro.addActionListener(this);





        //Cadastrar Funcionario
        p1.add(cadastrarFuncionario);
        


        //Funcionario
        p1.add(cadastrarEstudante);
        //Autor
        p1.add(cadastrarAutor);
        //Emprestimo
        p1.add(cadastrarEmprestimo);
        //Receber
        p1.add(receberEmprestimo);
        //Sair
        p1.add(sair);

        
        

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
        System.out.println("salve");
        p1.setVisible(false);
        painelLivro.setVisible(true);

    }
}
