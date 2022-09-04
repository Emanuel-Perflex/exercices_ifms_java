package heranca.aula1;

public class App {
    public static void main(String[] args) {


        Cao bilu = new Cao();
        bilu.setNome("toto");
        bilu.setIdade(4);
        bilu.setRaca("maltes");

        Dono emanuel = new Dono();

        emanuel.setNome("Emanuel");
        bilu.setDono(emanuel);
        emanuel.setEndereco("Muzambinho");
    
        emanuel.andar();
    }
}
