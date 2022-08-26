package dashboard.interfaces;
//imports
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
        cadastrarLivro.addActionListener(this);
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
        
        //Botão para morrer
        painel.add(sair);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("\n\n\n|Sistema Encerrado!|");
                System.exit(0);
            }
        });


//--------------------------------Configuração Da janela--------------------------------//
        main.add(painel, BorderLayout.CENTER);
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
    }
}
