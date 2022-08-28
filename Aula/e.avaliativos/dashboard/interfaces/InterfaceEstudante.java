package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class InterfaceEstudante {
    //JFrame
    JFrame main = new JFrame();
    //Painel main
    JPanel painelEstudante = new JPanel();
    //Etiquetas
    JLabel labelTitulo = new JLabel("Insira os dados do estudante");
    JLabel labelNome = new JLabel("Nome:");
    JLabel labelCurso = new JLabel("Curso");
    JLabel labelDataDeInicio = new JLabel("Ínicio do curso");
    JLabel labelRa = new JLabel("R.A.");
    JLabel labelDevedor = new JLabel("O aluno deve algum livro para a instituição?");
    //Botões e outros
    JButton buttonCadastro = new JButton("Cadastrar Estudante");
    JButton buttonSair = new JButton("Sair");
    JButton buttonBack = new JButton("Voltar");
    JCheckBox confirma = new JCheckBox();
    //TextAreas
    JTextArea textNome = new JTextArea();
    JTextArea textCurso = new JTextArea();
    JTextArea textDataDeInicio = new JTextArea();
    JTextArea textRa = new JTextArea();

    public InterfaceEstudante (){
        painelEstudante.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelEstudante.setLayout(new GridLayout(0, 1));

        painelEstudante.add(labelTitulo);
        
        //nome
        painelEstudante.add(labelNome);
        painelEstudante.add(textNome);
        //Curso
        painelEstudante.add(labelCurso);
        painelEstudante.add(textCurso);
        //Dt de inicio
        painelEstudante.add(labelDataDeInicio);
        painelEstudante.add(textDataDeInicio);
        //Ra
        painelEstudante.add(labelRa);
        painelEstudante.add(textRa);
        //Checkbox
        painelEstudante.add(labelDevedor);
        painelEstudante.add(confirma);

        //Botões
        painelEstudante.add(buttonBack);
        painelEstudante.add(buttonSair);

//________________________________________//Funções\\____________________________________________\\
        
        //Botão Sair
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceGeral();
            }
        });

        //Botão Sair
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });               

        //--------------------------------Configuração Da janela--------------------------------//
        main.add(painelEstudante, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(400, 600);
        main.setVisible(true); 
    }
}
