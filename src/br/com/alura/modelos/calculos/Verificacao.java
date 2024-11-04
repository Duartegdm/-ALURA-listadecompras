package br.com.alura.modelos.calculos;

public class Verificacao {



    public boolean continuar(int v) {
        if(v != 0 && v != 1) {
            System.out.println("Opção inválida");
            return true;
        }
        return false;
    }
}
