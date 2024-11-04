package br.com.alura.modelos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<Item> carrinho = new ArrayList<>();

    public void adicionarProduto(Item item) {
        carrinho.add(item);
    }

    public void exibirCompras() {
        System.out.printf("""
                %nCOMPRAS REALIZADAS
                -------------------
                """);
        for (Item item : carrinho) {
            System.out.println(item);
        }
        System.out.println("------------------");
    }

    public List<Item> getCarrinho() {
        return carrinho;
    }


}
