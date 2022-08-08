package robo;

import java.util.Scanner;

public class Robo {
    //lados
    private int x = 0;
    private int y = 0;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void cima (){
        this.y++;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }

    public void baixo (){
        this.y--;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }
    
    public void esquerda (){
        this.x--;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }

    public void direita (){
        this.x++;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }

    public void leitura (){
        Scanner ler = new Scanner(System.in);
        String comando = ler.nextLine();
        
        if (comando.equals("w")){
            cima();
        } else if (comando.equals("a")){
            esquerda();
        } else if (comando.equals("s")){
            baixo();
        } else if (comando.equals("d")){
            direita();;
        }
    }
}