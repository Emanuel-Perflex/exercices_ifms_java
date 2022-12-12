package com.example;

//Imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public void verificarConexao() {
        try {
            Class.forName("org.postgresql.Driver");
            conexaoDB = DriverManager.getConnection(url + nameDB, usuario, senha);
            if (conexaoDB != null) {
                System.out.println("\n\n\nEstado da conexão: Connected on database " + nameDB + "!\n\n");
                Statement state = conexaoDB.createStatement();
                pesquisaSQL(state);
            }
    
        } catch (Exception e) {
            System.out.println("\n\n\nEstado da conexão: falha ao conectar no database " + nameDB + "!");
            System.out.println("Erro:" + e);
        }
    }

    public void inserirDados(){}

    public void pesquisaSQL(Statement state){
        String sql = "select * from dados";
        int aux = 0;
        //Operação para converter a string em um comando
        try {
            ResultSet resultadoPesquisa = state.executeQuery(sql);
            //Enquanto tiver mais números, é pra mostrar
            while (resultadoPesquisa.next()) {
                aux++;
                                                     //Aqui se passa o nome da coluna
                System.out.println("Nº " + aux + ":" + resultadoPesquisa.getInt("id"));
            }
        } catch (Exception e) {
            System.out.println("Erro na query: " + e);
        }
        aux = 0;
    }
}
