public class Aulaum {

    public static class Lista {
        public No inicio;
        public int tam;        
    }
    //classe interna ou inter Class
    public static class No {
        public int info;
        //Redundancia proposital
        public No prox;
    }

    public static void main(String[] args) {
        
        Lista lista = new Lista();

        lista.inicio = null;
        
        No l1 = new No();
        No l2 = new No();
        No l3 = new No();
        l1.prox = l2;
        l1.prox = l3;

        lista = addInicio(lista, 10);
        lista = addInicio(lista, 5);
        lista = addInicio(lista, 1);
        lista = addFinal(lista, 3);

        printLista(lista);

    }


    //Criação de listas
    public static Lista iniciarLista() {
        Lista l = new Lista();
        l.inicio = null;
        l.tam = 0;
        return l;
    }

    public static Lista addInicio(Lista l, int val){
        No n1 = new No();
        n1.info = val;
        n1.prox = l.inicio;
        l.inicio = n1;
        return l;
    }

    public static Lista addFinal(Lista l, int val) {

        No novo = new No();
        novo.info = val;
        novo.prox = null;

        if(l.inicio == null) {
            l.inicio = novo;
            l.tam ++;
            return l;
        }

        No aux = l.inicio;
        while (aux.prox != null) {
            aux = aux.prox;
        }

        aux.prox = novo;

        return l;
    }

    public static void printLista(Lista l) {
        No aux = l.inicio;
        while (aux != null) {
            System.out.println(aux.info);
            aux = aux.prox;
        }
        System.out.println("NULL");
    }
}    