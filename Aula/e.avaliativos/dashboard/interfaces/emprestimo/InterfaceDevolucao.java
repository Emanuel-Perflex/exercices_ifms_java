package dashboard.interfaces.emprestimo;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dashboard.interfaces.InterfaceGeral;

import java.awt.GridLayout;

public class InterfaceDevolucao {
    //Jframe main
    JFrame main = new JFrame();
    //Painel
    JPanel painelDevolucao = new JPanel();
    //JLABEL
    JLabel labelTitulo = new JLabel("Insira o Título do livro emprestado");    
    //text
    JTextArea areaAsk = new JTextArea();
    //Botões
    JButton buttonAsk = new JButton("Pesquisar");
    JButton buttonBack = new JButton("Voltar");
    JButton exitButton = new JButton("Sair");


    public InterfaceDevolucao (){
        //A idéia é que o balconista consiga fazer a devolução do livro somente com o nome do Título
        //É interessante se no ato de pesquisar o livro emprestado ter um return que fez uma validação dizendo se ele foi devolvido ou não

        painelDevolucao.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelDevolucao.setLayout(new GridLayout(0, 1));

        painelDevolucao.add(labelTitulo);
        painelDevolucao.add(areaAsk);
        painelDevolucao.add(buttonAsk);
        //Botões de escape
        painelDevolucao.add(buttonBack);
        painelDevolucao.add(exitButton);
//________________________________________//Funções\\____________________________________________\\
        
        //Botão Sair
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceGeral();
            }
        });

        //Botão Sair
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });







        //--------------------------------Configuração Da janela--------------------------------//
        main.add(painelDevolucao, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(400, 300);
        main.setVisible(true);        
    }

}
