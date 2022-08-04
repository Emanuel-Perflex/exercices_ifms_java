package um;

public class ContaExe {
 
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.debito = 2000;
        conta.limite = 50;
        conta.nome = "Emanuel Barbosa";

        //Conferindo saldo inicial
        conta.extract();
        //Saque de dinheiro
        conta.sacar(300);
        conta.extract();
        //Conferindo se tenho dinheiro pra fazer um pix
        conta.pix(1500);
        conta.extract();
    }

}