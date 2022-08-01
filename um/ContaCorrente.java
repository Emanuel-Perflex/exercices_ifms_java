package um;

public class ContaCorrente {
    
    public float debito;
    public float limite;
    public String nome;

    public void sacar(double dinheiro){
        debito -= dinheiro;
    }

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
}