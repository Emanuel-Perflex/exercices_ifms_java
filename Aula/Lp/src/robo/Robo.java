package robo;

public class Robo {
    //lados
    private int x = 0;
    private int y = 0;

    public int calcY;
    public int calcX;

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
        calcY++;
        System.out.println("\nA posição agora é: (" + calcX + "," + calcY + ")");
    }

    public void baixo (){
        this.y--;
        calcY--;
        System.out.println("\nA posição agora é: (" + calcX + "," + calcY + ")");
    }
    
    public void esquerda (){
        this.x--;
        calcX--;
        System.out.println("\nA posição agora é: (" + calcX + "," + calcY + ")");
    }

    public void direita (){
        this.x++;
        calcX++;
        System.out.println("\nA posição agora é: (" + calcX + "," + calcY + ")");
    }
}
