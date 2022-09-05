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
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;


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
    JButton buttonAsk = new JButton("Devolver");
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
        
        //Botão Pesquisar
        buttonAsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            String inputPesquisar  = areaAsk.getText();

            //Primeira camada de validação
            if (inputPesquisar.equals("")) {
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
                    for (int i = 0; i < nomes.length; i++) {
                        if(i % 2 == 0){
                            Emprestados.add(nomes[i]);
                        } else {
                            Livros.add(nomes[i]);
                        }
                    }
                    //O uso do auxiliar será para conseguir validar mais tarde
                    int aux = 0;
                    for (int i = 0; i < Livros.size(); i++){
                        if (inputPesquisar.equals(Livros.get(i))) {
                            aux++;
                        }
                    }

                    if (aux > 0) {
                        for (int j = 0; j < Livros.size(); j++) {
                            if (inputPesquisar.equals(Livros.get(j))) {
                                //Como só dá para cadastrar um livro a um nome por vez, logo eles estão no mesmo indice na array list
                                //E portanto faz sentido que sejam retirados juntos
                                Livros.remove(j);
                                Emprestados.remove(j);
                            }
                        }
                        
                        //ArrayList contendo os nomes e livros com ausencia do que foi devolvido
                        ArrayList<String> livrosDevolvidos = new ArrayList<String>();
                        //Gravando no novo ArrayList as novas informações
                        for (int i = 0; i < Livros.size(); i++) {
                            livrosDevolvidos.add(Emprestados.get(i));
                            livrosDevolvidos.add("-");
                            livrosDevolvidos.add(Livros.get(i));
                            livrosDevolvidos.add("-");
                        }

                        //Apagando tudo do arquivo//////////////////////////////////////////////////////
                        File file = new File("e.avaliativos/dashboard/BancodeDados/emprestados.txt");

                        if ( file.exists()) {
                            file.delete();
                            FileWriter fw = new FileWriter( "e.avaliativos/dashboard/BancodeDados/emprestados.txt");
                            fw.write("");
                            fw.close(); 
                        }
                        /////////////////////////////////////////////////////////////////////////////

                        //Aqui estou gravando os livros novamente com o nome e o livro devolvido retirado
                        for (int i = 0; i < livrosDevolvidos.size(); i++) {

                            Files.write(Paths.get("e.avaliativos/dashboard/BancodeDados/emprestados.txt"), livrosDevolvidos.get(i).getBytes(), StandardOpenOption.APPEND);
                        }
                        livrosDevolvidos.clear();
                    }

                    Emprestados.clear();
                    Livros.clear();
                }catch (Exception e) {
                    System.out.println("Erro");
                }
            }
    }});

        //Botão Voltar
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
