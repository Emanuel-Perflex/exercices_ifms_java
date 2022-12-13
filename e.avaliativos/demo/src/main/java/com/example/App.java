package com.example;

import java.beans.Statement;

/*
-------------------------OBSERVAÇÕES----------------------------

1 - projeto feito com postgresql
2 - Sediado no wsl, portanto alguns endereços postgres podem mudar
3 - Criei um novo usuário para mexer nessa aplicação    
*/ 

public class App 
{
    public static void main( String[] args )
    {
        ConnectionDatabase con = new ConnectionDatabase();
        con.menu();
    }
}
