package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class InterfaceEmprestimo {
//------------------------------------------//TELA 1\\----------------------------------------------//    
    //Jframe main
    JFrame main = new JFrame();
    //Painel principal
    JPanel painelEmprestimo = new JPanel();
    //Tela 1 labeis
    JLabel labelDuvida = new JLabel("O que gostaria de fazer?");
    //Botões tela1
    JButton buttonDevolucao = new JButton("Registrar a devolução de um Livro");
    JButton buttonFuncionario = new JButton("Empréstimo para funcionário");
    JButton buttonEstudante = new JButton("Empréstimo para Estudante");
    //Botões de escape
    JButton buttonExit = new JButton("Sair");
    JButton buttonBack = new JButton("Voltar");

    public InterfaceEmprestimo (){
        painelEmprestimo.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelEmprestimo.setLayout(new GridLayout(6, 0));
        //Tela 1
        painelEmprestimo.add(labelDuvida);
        painelEmprestimo.add(buttonDevolucao);
        painelEmprestimo.add(buttonEstudante);
        painelEmprestimo.add(buttonFuncionario);
        //Painel de escape
        painelEmprestimo.add(buttonBack);
        painelEmprestimo.add(buttonExit);

    //--------------------------------Configuração Da janela--------------------------------//
        main.add(painelEmprestimo, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(500, 300);
        main.setVisible(true);     
    }

}
