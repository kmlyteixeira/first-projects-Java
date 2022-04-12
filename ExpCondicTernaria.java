public class ExpCondicTernaria {
    public static void main(String[] args) {

        double preco;
        double desconto;

        preco = 34.5;
        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("O valor do desconto ficou em: R$%.2f%n" , desconto);
    }
}
