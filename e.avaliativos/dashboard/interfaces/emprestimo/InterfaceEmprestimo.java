package dashboard.interfaces.emprestimo;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import dashboard.interfaces.InterfaceGeral;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class InterfaceEmprestimo {
//------------------------------------------//TELA 1\\----------------------------------------------//    
    //Jframe main
    JFrame main = new JFrame();
    //Painel principal
    JPanel painelEmprestimo = new JPanel();
    //Tela 1 labeis
    JLabel labelInfo = new JLabel("Prencha as informações:");
    JLabel labelNome = new JLabel("Nome do estudante ou Funcionário");
    JLabel labelLivro = new JLabel("Nome do Livro");
    //Botões tela1
    JButton buttonEmprestimo = new JButton("Empréstimo");
    //Botões de escape
    JButton buttonExit = new JButton("Sair");
    JButton buttonBack = new JButton("Voltar");
    //TextArea
    JTextArea areaLivro = new JTextArea();
    JTextArea areaNome = new JTextArea();

    public InterfaceEmprestimo (){
        painelEmprestimo.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelEmprestimo.setLayout(new GridLayout(0, 1));
        //Tela
        painelEmprestimo.add(labelInfo);
        painelEmprestimo.add(labelNome);
        painelEmprestimo.add(areaNome);
        //
        painelEmprestimo.add(labelLivro);
        painelEmprestimo.add(areaLivro);
        //
        painelEmprestimo.add(buttonEmprestimo);
        painelEmprestimo.add(buttonBack);
        painelEmprestimo.add(buttonExit);

//________________________________________//Funções\\____________________________________________\\

        buttonEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String inputNome  = areaNome.getText();
                String inputLivro = areaLivro.getText();
              
                String cadastroEmprestimo[] = {inputNome, "-"," ", inputLivro," ","; -"};

                if (inputLivro.equals("") || inputNome.equals("")) {
                    JOptionPane.showMessageDialog(null, "Faltam informações"); 
                } else {
                    try {
                        //Validação de dados
                        //Isto é, não será possível cadastrar um livro já cadastrado
                        Path caminho = Paths.get("e.avaliativos/dashboard/BancodeDados/emprestados.txt");
                        byte[] textoString = Files.readAllBytes(caminho);
                        String lerString = new String(textoString);
                        String[] nomes = lerString.split("-");
                        ArrayList<String> Emprestados = new ArrayList<String>();
                        ArrayList<String> Livros = new ArrayList<String>();
                        //Aqui salvo o nome de todos os estudantes e dos livros digitados
                        //Lembrando que o objetivo é jogar pra nível de compilador
                        for (int i = 0; i < nomes.length; i++) {
                            if(i % 2 == 0){
                                Emprestados.add(cadastroEmprestimo[i]);
                            } else {
                                Livros.add(cadastroEmprestimo[i]);
                            }
                        }
    
    
    
                        for (int j = 0; j < cadastroEmprestimo.length; j++) {
                            //Printf do array no documento
                            Files.write(Paths.get("e.avaliativos/dashboard/BancodeDados/emprestados.txt"), cadastroEmprestimo[j].getBytes(), StandardOpenOption.APPEND);
                        }
                        Emprestados.clear();
                        Livros.clear();
        
                    }catch (Exception e) {
                        System.out.println("Erro");
                    }
                }

                //Fazer uma validação no Aluno e no estudante
            main.dispose();
            new InterfaceEmprestimo();  
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
        main.add(painelEmprestimo, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(400, 300);
        main.setVisible(true);     
    }

}

//try {
    //         FileInputStream arquivo = new FileInputStream("e.avaliativos/dashboard/BancodeDados/emprestados.txt");
    //         InputStreamReader input = new InputStreamReader(arquivo);
    //         BufferedReader br = new BufferedReader(input);

    //         String line;
    //         //Por conta do do while eu conseguir fazer com que mesmo o app aberto, qualquer save sera printado
    //         do {
    //             line = br.readLine();
    //             if (line != null){
    //                 //Na hora de salvar sempre adicionar um ; no final para o split conseguir tratar
    //                 String [] palavras = line.split(";");

    //                 for (int i = 0; i < palavras.length; i++) {
    //                     System.out.println(palavras[i]);
    //                 }
    //             }
    //             br.close(); 
    //         } while (line != null);
    //     } catch (Exception e) {
    //         System.out.println("Erro");
    //     }
    // }