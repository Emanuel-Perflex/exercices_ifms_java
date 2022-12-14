package com.example;

import java.lang.Thread.State;
//Imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.sql.StatementEvent;

public class ConnectionDatabase {
    //endereço do driver e do banco
    private String url = "jdbc:postgresql://localhost:5432/";
    // Endereço do usuário
    private String usuario = "postgres";
    // senha do banco indicado
    private String senha = "1234";
    // Nome do banco
    private String nameDB = "seminario_beto";
    // classe da API
    private Connection conexaoDB;
    
    public String getUrl() {
		return this.url;
	}

    public String getUsuario() {
        return this.usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getNameDB() {
        return this.nameDB;
    }

    public void verificarConexao () {
        System.out.println(
            "\n1 - Iniciar Conexão" + 
            "\n2 - Matar conexão" +
            "\n3 - Inserir Dados" +
            "\n4 - Consultar Banco");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        switch (scan) {
            case 1:
                try {
                    Class.forName("org.postgresql.Driver");
                    conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                    Statement estado = conexaoDB.createStatement();

                    ResultSet resultado = estado.executeQuery("select * from dados");
                    List dados = new ArrayList<>();
                    
                    while(resultado.next()){ //o método next() retorna true caso haja mais linhas
                        dados.add(resultado.getInt("id"));
                        dados.add(resultado.getInt("node"));
                    }
                    int aux = (int) dados.get(1);

                    Arvore tree = new Arvore(aux);    
                    for (int i = 0; i < dados.size(); i++) {
                        tree.adicionar((int) dados.get(i));
                    }

                    tree.emOrdem(null);
                    tree.posOrdem(null);
                    tree.preOrdem(null);
                                 

                    if (conexaoDB != null) {
                        System.out.println("\nConnected on database " + nameDB + "!\n\n");
                    } else {
                        System.out.println("\n\nfalha ao conectar no database " + nameDB + "!");
                    }
                } catch (Exception e) {
                    System.out.println("Erro:" + e);
                }
            break;
            
            case 2:
                try {
                    Class.forName("org.postgresql.Driver");
                    conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                    conexaoDB.close();
                } catch (Exception e) {
                    System.out.println("Erro:" + e);
                }
            break;

            case 3:
            try {
                Class.forName("org.postgresql.Driver");
                conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                if (conexaoDB != null) {
                    System.out.println("Insira um número: ");
                    Scanner xp = new Scanner(System.in);
                    int aux = xp.nextInt();
                    inserirNode(aux);
                } else {
                    System.out.println("Falha na consulta: " + nameDB);
                }
            } catch (Exception e) {
                    System.out.println("Erro:" + e);}                   
            break;
        
            case 4:
                try {
                    Class.forName("org.postgresql.Driver");
                    conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                    Statement estado = conexaoDB.createStatement();
                    
                    if (conexaoDB != null){
                        ResultSet resultado = estado.executeQuery("select * from dados");
                        List dados = new ArrayList<>();
        
                        while(resultado.next()){ //o método next() retorna true caso haja mais linhas
                            dados.add(resultado.getInt("id")); 
                            dados.add(resultado.getInt("node"));
                        }

                        for(int i=0;i<dados.size();i++){
                            if (i % 2 == 0){
                                System.out.println("ID:" + dados.get(i));
                            } else {
                                System.out.println("Valor_do_No:" + dados.get(i));
                                System.out.println("-------------------------------\n");
                            }
                        } 
                    }

                } catch (Exception e) {
                    System.out.println("Erro na consulta: " + e);
                }
            break;

            default:
                System.out.println("parametro Inválido");
            break;
        }

        
    }


    public void menu() {

        while (true){
            System.out.println("1 - Banco");
            System.out.println("2 - Verificar arvore");
            System.out.println("3 - Verificar Histórico");
            System.out.println("0 - Sair");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();
            switch (scan) {
                case 1:
                    verificarConexao();
                break;
                case 2:
                    Consulta();
                break;

                case 3:
                    historicoBD();
                break;
                
                case 0:
                break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    } 

//---------------------------------------------------//Inserir SQL\\------------------------------------------\\
 
    public void historicoBD(){

    }

    
    

//---------------------------------------------------//Inserir SQL\\------------------------------------------\\
    public void inserirID (int id){
        try {
            Statement state = conexaoDB.createStatement();
            String commandSQL = "INSERT INTO dados(id) VALUES(" + id + ")";
                //Conexões
                try {
                    state.executeUpdate(commandSQL);
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            } catch (Exception e) {
                System.out.println("Erro de certificado" + " " + e);}
    }
    
    public void inserirNode(int node){
        try {
            Statement state = conexaoDB.createStatement();
            String commandSQL = "INSERT INTO dados(node) VALUES(" + node + ")";
                //Conexões
                try {
                    state.executeUpdate(commandSQL);                                                  
                } catch (Exception e) {
                    System.out.println(e);
                }
            
            } catch (Exception e) {
                System.out.println("Erro de certificado" + " " + e);}
}

//---------------------------------------//Consulta\\--------------------------------\\

    public void Consulta() {
        // Arvore arvore = new Arvore<>();
    
    }
}