package com.example;

//Classe do tipo genérica
public class Elemento {
    private int valor;
    private Elemento esquerda;
    private Elemento direita;
    
    //Setando valores, visto em aula
    // public Elemento(int novoValor){
    //     this.valor = novoValor;
    //     this.esquerda = null;
    //     this.direita = null;
    // }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento direita) {
        this.direita = direita;
    }
}