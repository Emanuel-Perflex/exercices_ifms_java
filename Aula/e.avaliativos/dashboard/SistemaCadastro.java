package dashboard;

import javax.swing.JFrame;

//Decidi fazer tudo com Swing, Deus me ajude, Amém;
public class SistemaCadastro {
    JFrame main = new JFrame();

    SistemaCadastro(){
        main.setTitle("Cadastro Bibliotecário");
        main.setSize(800, 600);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setLocationRelativeTo(null); 
        main.setVisible(true);
    }
       
        

    public static void main(String[] args) {
        new SistemaCadastro();
    }
}


/*

    "|                 Escolha um opção:                  |",
    "| -------------------------------------------------- | ",
    "| 1 - Cadastrar Livro                                |",
    "| 2 - Cadastrar Funcionario                          |",
    "| 3 - Cadastrar Estudante                            |",
    "| 4 - Cadastrar Autor                                |",
    "| 5 - Realizar Emprestimo                            |",
    "| 6 - Receber Emprestimo                             |",
    "| 0 - Sair                                           |",
    "| -------------------------------------------------- |", 
 
 */