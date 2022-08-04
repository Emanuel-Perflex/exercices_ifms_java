package um;

public class ContaCorrente {
    
    public float debito;
    public float limite;
    public String nome;

    public void depositar (double dinheiro) {
        debito += dinheiro;
    }

    public void pix (double dinheiro) {
        if (debito <= 0) {
            limite -= dinheiro;
        } else {
            debito -= dinheiro;
        }
    }

    public void extract () {
        System.out.println(debito);
    }

    //com variaveis, contar notas
    public void sacar (int dinheiro) {
    
    int cinco = ((dinheiro % 10) / 5);
    int dez = ((dinheiro % 20) / 10);
    int vinte = ((dinheiro % 50) / 20);
    int cinquenta = ((dinheiro % 100) / 50);
    int cem = ((dinheiro % 200) / 100);
    int duzentos = dinheiro / 200;
    
    int coringa = (cinco + dez + vinte + cem + cinquenta + duzentos);
    
    debito -= coringa;
    }
}