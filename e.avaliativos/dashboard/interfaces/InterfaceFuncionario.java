package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InterfaceFuncionario {
    //JFrame
    JFrame main = new JFrame();
    //Painel Principal
    JPanel painelFuncionario = new JPanel();
    //Labeis
    JLabel labelTitulo = new JLabel("Insira as informações requisitadas para efetuar o cadastro de um novo funcionário");
    JLabel labelNome = new JLabel("Nome: ");
    JLabel labelCurso = new JLabel("Formação acadêmica: ");
    JLabel labelCargo = new JLabel("Cargo: ");
    JLabel labelDataAdimissao = new JLabel("Data de admissão: ");
    JLabel labelSetor = new JLabel("Setor: ");
    //Textarea
    JTextArea textNome = new JTextArea();
    JTextArea textCurso = new JTextArea();
    JTextArea textCargo = new JTextArea();
    JTextArea textDataAdmissao = new JTextArea();
    JTextArea textSetor = new JTextArea();
    //Botões pertinentes
    JButton buttonCadastrar = new JButton("Cadastrar Funcionário");
    JButton buttonBack = new JButton("Voltar ao Menu");
    JButton buttonExit = new JButton("Sair");


    public InterfaceFuncionario (){
        //Grid da pagina
        painelFuncionario.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelFuncionario.setLayout(new GridLayout(0, 1));

        //Titulo based
        painelFuncionario.add(labelTitulo);
        //nome
        painelFuncionario.add(labelNome);
        painelFuncionario.add(textNome);
        //Curso
        painelFuncionario.add(labelCurso);
        painelFuncionario.add(textCurso);
        //Cargo
        painelFuncionario.add(labelCargo);
        painelFuncionario.add(textCargo);
        //Data de admissão
        painelFuncionario.add(labelDataAdimissao);
        painelFuncionario.add(textDataAdmissao);
        //Setor
        painelFuncionario.add(labelSetor);
        painelFuncionario.add(textSetor);

        //Botões 
        painelFuncionario.add(buttonCadastrar);
        painelFuncionario.add(buttonBack);
        painelFuncionario.add(buttonExit);

//________________________________________//Funções\\____________________________________________\\
        
        //Cadastrar Funcionário
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                // JTextArea textNome = new JTextArea();
                // JTextArea textCurso = new JTextArea();
                // JTextArea textCargo = new JTextArea();
                // JTextArea textDataAdimissao = new JTextArea();
                // JTextArea textSetor = new JTextArea();

                String inputNome  = textNome.getText();
                String inputCurso = textCurso.getText();
                String inputCargo = textCargo.getText();
                String inputData  = textDataAdmissao.getText();
                String inputSetor = textSetor.getText();
                
                String cadastroFuncionario[] = {inputNome," ", inputCurso," ", inputCargo, " ", inputData, " ", inputSetor,";","\n"};

                try {
                    for (int i = 0; i < cadastroFuncionario.length; i++) {
                        //Printf de nextLine no documento
                        Files.write(Paths.get("e.avaliativos/dashboard/BancodeDados/Funcionarios.txt"), cadastroFuncionario[i].getBytes(), StandardOpenOption.APPEND);    
                    }
                
                }catch (Exception e) {
                    System.out.println("Erro");
                }    
        
                main.dispose();
                new InterfaceGeral();     
            }});

        //Botão Sair
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceGeral();
            }
        });

        //Botão Sair
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });               

        //--------------------------------Configuração Da janela--------------------------------//
        main.add(painelFuncionario, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(400, 600);
        main.setVisible(true);    
    }
}
