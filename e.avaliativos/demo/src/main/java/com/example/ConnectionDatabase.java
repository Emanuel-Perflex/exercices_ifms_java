package com.example;

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
    //Endereço do usuário
    private String usuario = "postgres";
    //senha do banco indicado
    private String senha = "1234";
    //Nome do banco
    private String nameDB = "seminario_beto";
    //classe da API
    private Connection conexaoDB;

    public void menu(){
        while (true) {
            System.out.println("\n--------------------------------------");
            List<String> menu = new ArrayList<>();
            menu.add("1--Verificar Conexão");
            menu.add("\n2--Inserir dados");
            menu.add("\n3--Ask on database");

            System.out.println("Qual a operação com o banco desejada?");
            System.out.println(menu);

            Scanner escolha = new Scanner(System.in);
            int escolhaMenu = escolha.nextInt();

            switch (escolhaMenu) {
                case 1:
                    conexaoDB();
                    break;
                case 2:
                    try {
                        conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                        Statement state = conexaoDB.createStatement();
                        inserirDados(state);
                        conexaoDB.close();
                    } catch (Exception e) {
                        System.out.println("Erro de certificado" + " " + e);
                    }
                    break;
                case 3:
                    try {
                        conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                        Statement state = conexaoDB.createStatement();
                        pesquisaSQL(state);
                        conexaoDB.close();
                    } catch (Exception e) {
                        System.out.println("Erro de certificado" + " " + e);
                    }
                    break;
                default:
                    System.out.println("invalid Value, Try again!");
                    break;
            }
        }
    }

    public void conexaoDB() {
        System.out.println("\n\nO que deseja fazer?");
        System.out.println("\n1- Estabelecer conexão");
        System.out.println("\n2- Matar Conexão");

        Scanner scan = new Scanner(System.in);
        int scanner = scan.nextInt();

        switch (scanner) {
            case 1:
                try {
                    Class.forName("org.postgresql.Driver");
                    conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
                    if (conexaoDB != null) {
                        System.out.println("\nConnected on database " + nameDB + "!\n\n");
                        Statement state = conexaoDB.createStatement();
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
                    if (conexaoDB != null) {
                        System.out.println("\nDrop connected on database " + nameDB + "!\n\n");
                        conexaoDB.close();                        
                    } else {
                        System.out.println("Error on database! Verify the connection");
                    }
                } catch (Exception e) {
                    System.out.println("Erro:" + e);
                }
                break;
            
            default:
                System.out.println("\nInvalid value, try again!");
                break;
        }        
    }

    public void inserirDados(Statement state){
        System.out.println("digite a query: ");
        Scanner scan = new Scanner(System.in);
        String commandSQL = scan.nextLine();

        try {
            state.executeUpdate(commandSQL);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


//---------------------------------------------------//Pesquisa SQL\\------------------------------------------\\
    public void pesquisaSQL(Statement state){
        int aux = 0;
        Scanner scan = new Scanner(System.in);        
        System.out.println("\n\n");

        while (aux == 0) {
            System.out.println("1 - Relizar uma pesquisa \n2 - Encerrar Querys");
            int escolha = scan.nextInt();
            if (escolha == 2) {aux ++;}
            System.out.println("word the query: ");
            Scanner scanner = new Scanner(System.in);
            String newQuery = scanner.nextLine();

            try {
                ResultSet resultadoPesquisa = state.executeQuery(newQuery);
                while (resultadoPesquisa.next()){
                    System.out.println(resultadoPesquisa.getInt("id"));}
            } catch (Exception e) {
                System.out.println("Erro na query: " + e);
            }
        }
    }
}
