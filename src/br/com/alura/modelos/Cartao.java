package br.com.alura.modelos;

public class Cartao {
    private final double limite;
    private double saldo;

    public boolean verificaSaldo(double valor){
        if (this.saldo - valor < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }
    public void imprimeSaldo() {
        System.out.println("* Saldo do cartão: " + saldo);
    }

    public Cartao(double limite) {
        this.limite = limite;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }


}
