package dashboard.interfaces;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;
//Tutorial Carlos Henrique
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class InterfaceLivro {
    //JFrame
    JFrame main = new JFrame();
    //painéis
    JPanel painelLivro = new JPanel();
    //Textareas
    JTextArea titulo = new JTextArea();
    JTextArea editora = new JTextArea();
    JTextArea lancamento = new JTextArea();
    JTextArea autor = new JTextArea();
    //Labeis
    JLabel labelTitulo = new JLabel("Insira as informações requisitadas para efetuar o cadastro de um novo funcionário");
    JLabel tituloL = new JLabel("Nome do livro:");
    JLabel editoraL = new JLabel("Nome da editora:");
    JLabel lancamentoL = new JLabel("Data de Lançamento:");
    JLabel autorL = new JLabel("Nome do autor:");
    //Botões
    JButton cadastrarButton = new JButton("Cadastrar Livro");
    JButton sairButton = new JButton("Sair");
    JButton backButton = new JButton("Voltar ao menu");
    JButton buttonViewBooks = new JButton("Ver livros cadastrados");

    public InterfaceLivro(){
        //Titulo based
        painelLivro.add(labelTitulo);
        //Informações
        painelLivro.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        painelLivro.setLayout(new GridLayout(0, 1));
        //Titulo
        painelLivro.add(tituloL);
        painelLivro.add(titulo);
        //Editor
        painelLivro.add(editoraL);
        painelLivro.add(editora);
        //Lancamento
        painelLivro.add(lancamentoL);
        painelLivro.add(lancamento);
        //Autor
        painelLivro.add(autorL);
        painelLivro.add(autor);

        //Botões
        painelLivro.add(cadastrarButton);
        painelLivro.add(buttonViewBooks);
        painelLivro.add(sairButton);
        painelLivro.add(backButton);
        
//________________________________________//Funções\\____________________________________________\\

        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            //Cadastrar Livro\\
                String inputTitulo     = titulo.getText();
                String inputEditora    = editora.getText();
                String inputLancamento = lancamento.getText();
                String inputAutor      = autor.getText();
                //A ideia é que o '-' Gere novas strings mais para frente
                String cadastroLivro[] = {inputTitulo, "-"," ", inputEditora," ", inputLancamento, " ",inputAutor,"; -","\n"};
                //Cadastro de livros
                try {
                        //Validação de dados
                        //Isto é, não será possível cadastrar um livro já cadastrado
                        Path caminho = Paths.get("Aula/e.avaliativos/dashboard/BancodeDados/Livros.txt");
                        byte[] textoString = Files.readAllBytes(caminho);
                        String lerString = new String(textoString);
                        String[] nomes = lerString.split("-");
                        ArrayList<String> tituloLivros = new ArrayList<String>();
                        //Salvando os títulos
                        for (int i = 0; i < nomes.length; i++) {
                            if (i % 2 == 0) {
                                tituloLivros.add(nomes[i]);
                            }
                        }

                        for (int i = 0; i < tituloLivros.size(); i++) {
                            if (inputTitulo.equals(tituloLivros.get(i))){
                                JOptionPane.showMessageDialog(null, "Livro já cadastrado, não será possível cadastrá-lo novamente");
                            }else{
                                //gravar dados inseridos no arquivo
                                for (int j = 0; j < cadastroLivro.length; j++) {
                                //Printf do array no documento
                                Files.write(Paths.get("Aula/e.avaliativos/dashboard/BancodeDados/Livros.txt"), cadastroLivro[j].getBytes(), StandardOpenOption.APPEND);
                                }
                            }
                        }                 

                }catch (Exception e) {
                    System.out.println("Erro");
                }    

                main.dispose();
                new InterfaceGeral();     
            }});

        buttonViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Impressão de Livros\\
                //Declarando um caminho
                Path caminho = Paths.get("Aula/e.avaliativos/dashboard/BancodeDados/Livros.txt");
                
                try {
                    //Leitura de todos os bytes do arquivo
                    byte[] textoString = Files.readAllBytes(caminho);
                    //Transformando os bytes em String
                    String lerString = new String(textoString);
                    //String onde salvei o bruto separado pelo '-'
                    String[] nomes = lerString.split("-");
                    //Será necessário ou arraylist, já que não limites para o cadastro de novos livros
                    ArrayList<String> tituloLivros = new ArrayList<String>();
                    
                    //Laço com a função de salvar os nomes dos títulos
                    for (int i = 0; i < nomes.length; i++) {
                        //Lógica para pegar somente os títulos, todos os títulos são pares na posição do vetor
                        if (i % 2 == 0) {
                            tituloLivros.add(nomes[i]);
                        }
                    }
                    //Imprimindo o arraylist
                    JOptionPane.showMessageDialog(null, tituloLivros);
      
                } catch (Exception e) {
                    System.out.println("Erro");
                }
        }});


        //Botão Voltar
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main.dispose();
                new InterfaceGeral();
            }
        });

        //Botão Sair
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

//--------------------------------Configuração Da janela--------------------------------//
        main.add(painelLivro, BorderLayout.CENTER);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(400, 600);
        main.setVisible(true);
    }
}
