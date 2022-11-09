import Aulaum.No;

public class Tree {

    public Node root = null;


    public void inserir(No node, int info) {
        //verifica se a árvore já foi criada
        if (node != null) {
        //Verifica se o valor a ser inserido é menor que o nodo corrente da árvore, se sim vai para subárvore esquerda
        if (info < node.info) {
            //Se tiver elemento no nodo esquerdo continua a busca
            if (node.esquerda != null) {
                inserir(node.esquerda, info);
            } else {
                //Se nodo esquerdo vazio insere o novo nodo aqui
                System.out.println("  Inserindo " + info + " a esquerda de " + node.valor);
                node.esquerda = new No(info);
            }
          //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subárvore direita
          } else if (info > node.valor) {
              //Se tiver elemento no nodo direito continua a busca
              if (node.direita != null) {
                  inserir(node.direita, info);
              } else {
                  //Se nodo direito vazio insere o novo nodo aqui
                  System.out.println("  Inserindo " + info + " a direita de " + node.valor);
                  node.direita = new No(info);
              }
          }
        }
      }

    public void ask() {}

    public void preOrdem(){
        if (node = null) {
            System.out.println("arvore vazia");
            return;
        }

        System.out.println(node.info);
        if(node.esquerda != null) preOrdem(node.esquerda);
        } {
    }

    public void inOrder() {}

    public void posOrdem() {}
}