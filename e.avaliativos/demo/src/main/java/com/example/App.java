package com.example;

public class App 
{
    public static void main( String[] args )
    {
        //O primeiro número inserido será a raiz
        ConnectionDatabase conexaoDB = new ConnectionDatabase();
        conexaoDB.menu();
    }
}