package dashboard;
//Se o cidadão já estiver devendo um livro, não será possível que o mesmo consiga realizar o empréstimo de outro


import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.swing.text.MaskFormatter;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String logradouro;
    private String telefonePrincipal;
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTelefonePrincipal() {
        return this.telefonePrincipal;
    }

    public void setTelefonePrincipal(String telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }
    
//-------------------------------------Métodos-----------------------------//
/*
 * 1. Por se tratar de um sistema de cadastro, não faz sentido nenhum que os inputs de dados sejam realizados diretamente..
 * .. no programa, portanto minha ideia a priori dos fatos é que o arquivo empréstimo só puxe os métodos.
 
 * 2. Algumas gambiarras que estou fazendo serão auxiliadas pelo Stackoverflow e ademais, para fins didáticos os links serão..
 * ..compartilhados para averiguação competente. 
*/


    //1 - Método para pegar o nome do sujeito
    public void pegarNome(){
    


    }

    //2. Método para capturar o cpf e colocar uma máscara nele
    //Solução baseada em: https://www.guj.com.br/t/formatar-string-com-mascara-de-cnpj/353602/2
    public void informarCPF() throws ParseException{
        Scanner scan = new Scanner(System.in);
        String cpf = scan.nextLine();
        
        MaskFormatter mask = new MaskFormatter("###.###.###-##");
        mask.setValueContainsLiteralCharacters(false);
        //Para imprimir, tem que ser assim:
        System.out.println("CPF informado: " + mask.valueToString(cpf));
    }


    //3. Converter String para idade
    //Solução baseada na aula do professor José Roberto no dia 17/08
    public void dizerIdade (){
        Scanner data = new Scanner(System.in);
        dataNascimento = data.nextLine();
        LocalDateTime date = LocalDateTime.parse(dataNascimento,
        //Coloque getDefault para ser possível pegar do sistema vigente onde está sendo rodado o jvm
        DateTimeFormatter.ofPattern("M/d/uuuu", Locale.getDefault()));
        System.out.println("Para idade: " + date.format(DateTimeFormatter.ofPattern("M/d/uuu", Locale.getDefault())));
    }

    //TO string
    //Polimorfismo básico
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: ";
    }
}