package dashboard.interfaces;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
    //Botões e outros
    JButton buttonCadastro = new JButton("Cadastrar Estudante");
    JButton buttonSair = new JButton("Sair");
    JButton buttonBack = new JButton("Voltar");
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
        //Botões
        painelEstudante.add(buttonBack);
        painelEstudante.add(buttonSair);
        painelEstudante.add(buttonCadastro);

//________________________________________//Funções\\____________________________________________\\

        //Botão para submeter formulário
        buttonCadastro.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            String inputNome = textNome.getText(); 
            String inputCurso = textCurso.getText();
            String inputRa = textRa.getText();
            String inputData = textDataDeInicio.getText();

            //Leitura
            try {
                FileInputStream arquivo = new FileInputStream("e.avaliativos/dashboard/BancodeDados/Estudantes.txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader br = new BufferedReader(input);

                String line;
                do {
                    line = br.readLine();
                    if (line != null){
                        //Na hora de salvar sempre adicionar um ; no final para o split conseguir tratar
                        String [] palavras = line.split(";");

                        for (int i = 0; i < palavras.length; i++) {
                            System.out.println(palavras[i]);
                        }
                    }
                } while (line != null);
                br.close();

            } catch (Exception e) {
                System.out.println("Erro");
            }
            




            //Array com as informações dos alunos cadastrados
            String cadastroAluno[] = {inputNome," ", inputCurso," ", inputData, " ", inputRa,";","\n"};
            
            try {
                for (int i = 0; i < cadastroAluno.length; i++) {
                    //Printf de nextLine no documento
                    Files.write(Paths.get("Aula/e.avaliativos/dashboard/BancodeDados/Estudantes.txt"), cadastroAluno[i].getBytes(), StandardOpenOption.APPEND);    
                }
                
            }catch (Exception e) {
                System.out.println("Erro");
            }    
    
            main.dispose();
            new InterfaceGeral();

        }});

        //Botão Voltar
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

//Método inutilizado    
            // try {
            // //O caminho se inicia na raíz do diretório, por isso tava dando tanto trabalho
            // FileOutputStream arquivo = new FileOutputStream("Aula/e.avaliativos/dashboard/BancodeDados/Estudantes.txt");
            // PrintWriter pr = new PrintWriter(arquivo);
            // //
            // pr.println(inputNome + ";");
            // pr.close();
            // arquivo.close();
              
            // } catch (Exception e) {
            //     System.out.println("Erro");
            // }