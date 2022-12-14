package com.example;

import java.lang.Thread.State;
//Imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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


    public void menu() {
        Statement state;
        try {
            Class.forName("org.postgresql.Driver");
            conexaoDB = DriverManager.getConnection(url + nameDB, usuario,senha);
            state = conexaoDB.createStatement();

            while (true){
                System.out.println("1 - Banco");
                System.out.println("2 - Verificar arvore");
                System.out.println("3 - Inserir dados");
                System.out.println("0 - Sair");
                Scanner scanner = new Scanner(System.in);
                int scan = scanner.nextInt();
                switch (scan) {
                    case 1:
                        verificarConexao(conexaoDB);
                    break;
    
                    case 2:
                        imprimirOrdem(state);
                    break;
                    
                    case 3:
                        Scanner xP = new Scanner(System.in);
                        int hp = xP.nextInt();
                        inserirNode(hp);
                    break;
                    
                    case 0:
                    break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    } 

//---------------------------------------------------//Verificar SQL\\------------------------------------------\\

    public void imprimirOrdem(Statement state){
        Arvore tree = new Arvore<>();
        try {
            ResultSet resultado = state.executeQuery("select * from dados");
            // Memória
            ArrayList <Integer> dados = new ArrayList<>();
            while(resultado.next()){ //o método next() retorna true caso haja mais linhas
                dados.add(resultado.getInt("node"));
            }
            
            for (int i = 0; i < dados.size(); i++) {
                tree.adicionar(dados.get(i));
            } //o método next() retorna true caso haja mais linhas
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        System.out.println("\nEm Ordem: ");       
        tree.emOrdem(tree.getRaiz());
        System.out.println("\nPós Ordem: ");   
        tree.posOrdem(tree.getRaiz());
        System.out.println("\nPre Ordem: ");   
        tree.preOrdem(tree.getRaiz());
        System.out.println("\n ");
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
                System.out.println("Erro de Node" + " " + e);}
}

//--------------------------------------//Verify Database\\-------------------------------\\
public void verificarConexao (Connection conexaoDB) {
    System.out.println("\n1 - Iniciar Conexão" + "\n2 - Matar conexão");
    Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        switch (scan) {
            case 1:
                try {
                    //Banco
                    Class.forName("org.postgresql.Driver");
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
                    conexaoDB.close();
                    System.out.println("Conexão com " + nameDB + " morta!");
                } catch (Exception e) {
                    System.out.println("Erro ao matar conexão:" + e);
                }
            break;

            default:
                System.out.println("Parametro Inválido, tente novamente!");
            break;
        }        
    }  
}