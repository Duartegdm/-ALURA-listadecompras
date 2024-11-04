package br.com.alura.modelos;

public class Item implements Comparable<Item>{
    private String produto;
    private double valor;

    public Item(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.getProduto() + " - "+ this.getValor();
    }

    @Override
    public int compareTo(Item o) {
        if (this.valor < o.getValor()) {
            return -1;
        }
        if (this.valor == o.getValor()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
