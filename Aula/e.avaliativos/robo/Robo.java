package robo;

import java.util.Scanner;

//A ideia é tratar tudo como vetores, então pra funcionar...
public class Robo implements KeyListener{
    //Coordenada x e y do ponto inicial
    private int x;
    private int y;

    //Serão as coringas para salvar as posições iniciais quando se pular posições
    private int calcX = 0;
    private int calcY = 0;

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
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }

    public void baixo (){
        this.calcY = this.y;
        this.y--;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }
    
    public void esquerda (){
        this.calcX = this.x;
        this.x--;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }

    public void direita (){
        this.calcX = this.x;
        this.x++;
        System.out.println("\nA posição agora é: (" + x + "," + y + ")");
    }

    public void joystick(KeyEvent tecla){
        //Seta P/ baixo
        if (tecla.getKeyCode()==40){
        }
        //Seta P/ cima        
        if (tecla.getKeyCode()==38){
        }
        //Seta P/ direita
        if (tecla.getKeyCode()==39){
        }
        //Seta P/ esquerda
        if (tecla.getKeyCode()==37){
        }
         
       
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
    //Método da distancia, que consiste num teorema de pitagoras simples;
    public void distancia (){
        double distancia = Math.sqrt(Math.pow(x - calcX, 2) + Math.pow(y - calcY, 2));
        System.out.println("A distância percorrida foi de: (" + distancia + ")");
        distancia = 0;
        this.calcX = 0;
        this.calcY = 0;
    }

    //Função para caso o usuário queira sair de um ponto especifico e ir para outro
    public void coordenadas (){
        Scanner ler = new Scanner(System.in);
        int x1 = ler.nextInt();
        int x2 = ler.nextInt();
        int y1 = ler.nextInt();
        int y2 = ler.nextInt();
        
        this.x = x1;
        this.calcX = x2;
        this.y = y1;
        this.calcY = y2;

        double distancia = Math.sqrt(Math.pow(x - calcX, 2) + Math.pow(y - calcY, 2));
        System.out.println("As cordenadas iniciais inseridas foram: (" + x + "," + calcX + ")");
        System.out.println("E as coordenadas finais inseridas foram: (" + y + "," + calcY + ")");
        System.out.println("A distância percorrida foi de: (" + distancia + ")");
    }
}