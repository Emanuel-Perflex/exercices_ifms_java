package robo;

import java.util.Scanner;

public class Robo {
    //Coordenada x e y do ponto inicial
    private int x;
    private int y;

    //Serão as coringas para salvar as posições iniciais quando se pular posições
    private int calcX = 0;
    private int calcY = 0;

//--------------------Getters e Setters-------------------------//
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCalcX() {
        return calcX;
    }

    public int getCalcY() {
        return calcY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCalcX(int calcX) {
        this.calcX = calcX;
    }

    public void setCalcY(int calcY) {
        this.calcY = calcY;
    }

//-------------------------Métodos Cardinais-------------------------//
    
    public void cima (){
        this.calcY = this.y;
        this.y++;
        System.out.println("\nposição atual: (" + x + "," + y + ")");
    }

    public void baixo (){
        this.calcY = this.y;
        this.y--;
        System.out.println("\nposição atual: (" + x + "," + y + ")");
    }
    
    public void esquerda (){
        this.calcX = this.x;
        this.x--;
        System.out.println("\nposição atual: (" + x + "," + y + ")");
    }

    public void direita (){
        this.calcX = this.x;
        this.x++;
        System.out.println("\nposição atual: (" + x + "," + y + ")");
    }

//--------------------Métodos adicionais------------------------------//
   
    //Método da distancia, que consiste num teorema de pitagoras simples;
    public Double distancia (int x, int y, int calcX, int calcY){
        return Math.sqrt(Math.pow(x - calcX, 2) + Math.pow(y - calcY, 2));
    }

    //Função para caso o usuário queira sair de um ponto especifico e ir para outro;
    public void coordenadas (){
        Scanner ler = new Scanner(System.in);
        //Necessário zerar para toda utilização;
        this.calcX = 0;
        this.calcY = 0;
        this.x = 0;
        this.y = 0;
        //Procedimentos//
        
        //Xo e Yo
        System.out.println("Xo: \t" );
        this.calcX = ler.nextInt();
        System.out.println("Yo: ");
        this.calcY = ler.nextInt();
        //Yo e Y
        System.out.println("X: ");
        this.x = ler.nextInt();
        System.out.println("Y: ");
        this.y = ler.nextInt();

        System.out.println("As cordenadas iniciais do robô eram: (" + calcX + "," + calcY + ")");
        System.out.println("E as coordenadas são: (" + x + "," + y + ")");
        System.out.println("Logo, a distancia percorrida equivale a: " + distancia(x, y, calcX, calcY));    

    }
}