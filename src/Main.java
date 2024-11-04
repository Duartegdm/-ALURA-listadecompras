import br.com.alura.modelos.Carrinho;
import br.com.alura.modelos.Cartao;
import br.com.alura.modelos.Item;
import br.com.alura.modelos.calculos.Verificacao;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ver = 1;

        Verificacao verifica = new Verificacao();

        Carrinho carrinho = new Carrinho();

        System.out.println("Digite o limite do cartão: ");
        Cartao cartao = new Cartao(input.nextDouble());
        cartao.setSaldo(cartao.getLimite());

        while (ver == 1) {
            System.out.println("Digite o produto: ");
            String produto = input.next();

            System.out.println("Digite o valor da compra: ");
            double valor = input.nextDouble();

            Item item = new Item(produto, valor);

            boolean compraAprovada = cartao.verificaSaldo(valor);

            if (compraAprovada) {
                System.out.println("Compra realizada!");
                carrinho.adicionarProduto(item);
            } else{
                System.out.println("Saldo insuficiente!");
            }

            cartao.imprimeSaldo();

            System.out.println("Digite 0 para sair ou 1 para continuar");
            ver = input.nextInt();

            // loop enquanto a verificacao nao for 0 ou 1
            while(verifica.continuar(ver)) {
                System.out.println("Digite 0 para sair ou 1 confirmar");
                ver = input.nextInt();
            }
        }

        Collections.sort(carrinho.getCarrinho());

        carrinho.exibirCompras();

    }
}
