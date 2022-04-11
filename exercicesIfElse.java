import java.util.Scanner;

public class exercicesIfElse {
    public static <string> void main(String[] args) {
        // EXERCICIOS USANDO IF-ELSE
        // EXERCICIO 01 - Fazer um programa para ler um número inteiro, e depois dizer
        // se este número é negativo ou não.

        int number, number2, codItem, qntItem;
        double hInicial, hFinal, duracao, vlrTotal;
        String nomItem;
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("SE O NÚMERO É NEGATIVO");
        System.out.println("=======================");
        System.out.printf("Insira um número para verificar >>> ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("O número " + number + " não é negativo");
        } else {
            System.out.println("O número " + number + " é negativo");
        }

        number = 0;

        // EXERCICIO 02 - Fazer um programa para ler um número inteiro e dizer se este
        // número é par ou ímpar.
        System.out.println("=================");
        System.out.println("SE É PAR OU IMPAR");
        System.out.println("=================");
        System.out.printf("Insira um número para verificar >>> ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número " + number + " é PAR");
        } else {
            System.out.println("O número " + number + " é IMPAR");
        }
        number = 0;
        // EXERCICIO 03 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
        // uma mensagem "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si.
        // Atenção: os números devem poder ser digitados em ordem crescente ou
        // decrescente.

        System.out.println("================");
        System.out.println("SE SÃO MULTIPLOS");
        System.out.println("================");
        System.out.printf("Insira o primeiro número >>> ");
        number = sc.nextInt();
        System.out.printf("Insira o segundo número >>> ");
        number2 = sc.nextInt();

        if (number % number2 == 0 || number2 % number == 0) {
            System.out.println(number + " e " + number2 + " são multiplos!");
        } else {
            System.out.println(number + " e " + number2 + " não são multiplos!");
        }

        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
        // jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
        // máxima de 24 horas.

        System.out.println("===============");
        System.out.println("DURAÇÃO DE JOGO");
        System.out.println("===============");
        System.out.printf("Insira o HORÁRIO de inicio da partida >>> ");
        hInicial = sc.nextDouble();
        System.out.printf("Insira o HORÁRIO de termino da partida >>> ");
        hFinal = sc.nextDouble();

        if (hInicial < hFinal) {
            duracao = hFinal - hInicial;
        } else {
            duracao = 24 - hInicial + hFinal;
        }

        System.out.println("A partida durou " + duracao + " HORAS.");

        // Com base na tabela abaixo, escreva um programa que leia o código de um item e
        // a quantidade deste item.
        // A seguir, calcule e mostre o valor da conta a pagar.
        // COD 1 - CACHORRO QUENTE - R$4.00
        // COD 2 - X SALADA - R$4.00
        // COD 3 - X BACON - R$4.00
        // COD 4 - TORRADA SIMPLES - R$4.00
        // COD 5 - REFRIGERANTE - R$4.00

        System.out.println("===============");
        System.out.println("CALCULA VALORES");
        System.out.println("===============");

        System.out.println("Insira o código do item desejado >>> ");
        codItem = sc.nextInt();
        System.out.println("Insira o quantidade do item >>> ");
        qntItem = sc.nextInt();

        if (codItem == 1) {
            nomItem = "CACHORRO QUENTE";
            vlrTotal = qntItem * 4;
            System.out.println("O valor a ser pago pelo " + nomItem + " é " + vlrTotal);
        } else if (codItem == 2) {
            nomItem = "X SALADA";
            vlrTotal = qntItem * 4;
            System.out.println("O valor a ser pago pelo " + nomItem + " é " + vlrTotal);
        } else if (codItem == 3) {
            nomItem = "X BACON";
            vlrTotal = qntItem * 4;
            System.out.println("O valor a ser pago pelo " + nomItem + " é " + vlrTotal);
        } else if (codItem == 4) {
            nomItem = "TORRADA SIMPLES";
            vlrTotal = qntItem * 4;
            System.out.println("O valor a ser pago pela " + nomItem + " é " + vlrTotal);
        } else if (codItem == 5) {
            nomItem = "REFRIGERANTE";
            vlrTotal = qntItem * 4;
            System.out.println("O valor a ser pago pelo " + nomItem + " é " + vlrTotal);
        }

        sc.close();
    }
}
