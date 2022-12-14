package com.example;

//Arvore genérica que aceita todo tipo
//Extends para dizer que os atributos podem ser comparados
public class Arvore {    
    private int raiz;
    
    public Arvore(int value){
        this.raiz = value;
    }
//------------------------------------------\\Adicionar//---------------------------------------\\
//Por hora todo dado inserido está sendo armazenado na memória e também no database
//Porém quando a operação acaba, a memória se finda e se mantém no banco
    public void adicionar(int value){
        Elemento novoElemento = new Elemento();
        novoElemento.setValor(value);

        ConnectionDatabase conexao = new ConnectionDatabase();
        //Processo de criar uma nova conexão
        if (raiz == 0){
            this.raiz = 1;
            conexao.inserirID(1);
            conexao.inserirNode(value);
        }else{
            Elemento atual = new Elemento();
            atual.setValor(value);

            while(true){
                if (novoElemento.getValor() == atual.getValor()){
                    if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{ 
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public int getRaiz() {
        return raiz;
    }
    
//---------------------------------------------\\EM ORDEM//------------------------------------\\
    public void emOrdem(Elemento atual){
        if (atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }        
    }

//---------------------------------------------\\PRÉ ORDEM//------------------------------------\\
    public void preOrdem(Elemento atual){
        if (atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());          
            preOrdem(atual.getDireita());
        }
    }

//---------------------------------------------\\PÓS ORDEM//------------------------------------\\
    public void posOrdem(Elemento atual){
        if (atual != null){            
            posOrdem(atual.getEsquerda());            
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }        
    }
}