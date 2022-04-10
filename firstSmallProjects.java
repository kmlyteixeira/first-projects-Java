import java.util.Locale;
import java.util.Scanner;

public class firstSmallProjects {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a, b, c, d, prodAB, prodCD, dif, mat, codPecUm, codPecDois, qntPecUm, qntPecDois;
        double valorUm, valorDois, soma, raio, vlrPi, area, salHora, horMes, salMes, vlrPecUm, vlrPecDois, vlrTotal, totalPecDois, totalPecUm, circulo, x,y,z, triangulo, trapezio, quadrado, retangulo;
        Scanner sc = new Scanner(System.in);
        // EXERCICIO 01 - Faça um programa para ler dois valores inteiros, e depois
        // mostrar
        // na tela a soma desses números com uma mensagem explicativa
        System.out.println("=======================================");
        System.out.println("= PEQUENO PROGRAMA DE EXPRESSÕES MATH =");
        System.out.println("================ SOMA =================");
        System.out.printf("Insira o primeiro valor >>> ");
        valorUm = sc.nextDouble();
        System.out.printf("Insira outro valor para calcularmos >>> ");
        valorDois = sc.nextDouble();

        soma = valorUm + valorDois;

        System.out.println("A resultado de " + valorUm + " + " + valorDois + " = " + soma);

        // EXERCICIO 02 - Faça um programa para ler o valor do raio de um círculo, e
        // depois mostrar
        // o valor da área deste círculo com quatro casas decimais
        System.out.println("=======================================");
        System.out.println("= PEQUENO PROGRAMA DE EXPRESSÕES MATH =");
        System.out.println("=========== ÁREA de CIRCULO ===========");
        System.out.printf("Insira o RAIO deste circulo >>> ");

        raio = sc.nextDouble();
        vlrPi = 3.14159;
        area = vlrPi * (Math.pow(raio, 2));

        System.out.printf("%nA área deste circulo é : %.4f%n", area);

        // EXERCICIO 03 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
        // calcule e mostre a diferença do produto
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
        // D).
        System.out.println("=======================================");
        System.out.println("= PEQUENO PROGRAMA DE EXPRESSÕES MATH =");
        System.out.println("=========== DIF de PRODUTOS ===========");
        System.out.printf("Insira o valor de [A] >>> ");
        a = sc.nextInt();
        System.out.printf("Insira o valor de [B] >>> ");
        b = sc.nextInt();
        System.out.printf("Insira o valor de [C] >>> ");
        c = sc.nextInt();
        System.out.printf("Insira o valor de [D] >>> ");
        d = sc.nextInt();

        prodAB = a * b;
        prodCD = c * d;
        dif = prodAB - prodCD;

        System.out.println("O resultado da expressão: (" + a + " x " + b + ") - (" + c + " x " + d + ") é = " + dif);

        // EXERCICIO 04 - Fazer um programa que leia o número de um funcionário, seu número de horas
        // trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o
        // salário do funcionário, com duas casas decimais.
        System.out.println("=======================================");
        System.out.println("= PEQUENO PROGRAMA DE EXPRESSÕES MATH =");
        System.out.println("============ SALÁRIO MENSAL ===========");
        System.out.printf("Insira a matrícula deste Funcionário >>> ");
        mat = sc.nextInt();
        System.out.printf("Preencha com a quantidade de horas trabalhadas >>> ");
        horMes = sc.nextDouble();
        System.out.printf("Qual o valor do Salário Hora deste funcionário? >>> ");
        salHora = sc.nextDouble();

        salMes = salHora * horMes;

        System.out.printf(" O valor do salário do colaborador " + mat + " é : ");
        System.out.printf("%.2f%n", salMes);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
        System.out.println("=======================================");
        System.out.println("= PEQUENO PROGRAMA DE EXPRESSÕES MATH =");
        System.out.println("=========== VALOR TOTAL LOJA ==========");
        System.out.printf("Insira o código do primeiro tipo de peça >>> ");
        codPecUm = sc.nextInt();
        System.out.printf("Insira a quantidade de peças nesta venda >>> ");
        qntPecUm = sc.nextInt();
        System.out.printf("Insira o valor unitário >>> ");
        vlrPecUm = sc.nextDouble();

        System.out.printf("Insira o código do segundo tipo de peça >>> ");
        codPecDois = sc.nextInt();
        System.out.printf("Insira a quantidade de peças nesta venda >>> ");
        qntPecDois = sc.nextInt();
        System.out.printf("Insira o valor unitário >>> ");
        vlrPecDois = sc.nextDouble();

        totalPecUm = qntPecUm*vlrPecUm;
        totalPecDois = qntPecDois * vlrPecDois;
        vlrTotal = totalPecDois + totalPecUm;    

        System.out.printf("O valor total a ser pago pela compra é: R$");
        System.out.printf("%.2f%n", vlrTotal);
        System.out.println("---- DETALHES DA COMPRA ----");
        System.out.println("Cód Item: " +codPecUm+ " | Qtd. Item: " +qntPecUm+ " | Vlr. Unidade: " +vlrPecUm+ " | Valor Total Item: " +totalPecUm);
        System.out.println("Cód Item: " +codPecDois+ " | Qtd. Item: " +qntPecDois+ " | Vlr. Unidade: " +vlrPecDois+ " | Valor Total Item: " +totalPecDois);

        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: x, y e z. Em seguida, calcule e mostre:
        //a) a área do triângulo que tem X por base e Z por altura.
        //b) a área do círculo de raio Z. (pi = 3.14159)
        //c) a área do trapézio que tem X e Y por bases e Z por altura.
        //d) a área do quadrado que tem lado Y.
        //e) a área do retângulo que tem lados X e Y.

        System.out.println("=======================================");
        System.out.println("= PEQUENO PROGRAMA DE EXPRESSÕES MATH =");
        System.out.println("=========== CALCULO de AREAS ==========");
        System.out.printf("Insira o valor de [X] >>> ");
        x = sc.nextFloat();
        System.out.printf("Insira o valor de [Y] >>> ");
        y = sc.nextFloat();
        System.out.printf("Insira o valor de [Z] >>> ");
        z = sc.nextFloat();

        triangulo = (x*z)/2;
        circulo = vlrPi*(Math.pow(z, 2));
        trapezio = ((x+y)*z)/2;
        quadrado = Math.pow(y, 2);
        retangulo = x*y;

        System.out.printf("Área do triângulo que tem X por base e Z por altura %.3f%n", triangulo);
        System.out.printf("Área do círculo de raio Z %.3f%n", circulo);
        System.out.printf("Área do trapézio que tem X e Y por bases e Z por altura %.3f%n", trapezio);
        System.out.printf("Área do quadrado que tem lado Y %.3f%n", quadrado);
        System.out.printf("Área do retângulo que tem lados X e Y %.3f%n",retangulo);

        sc.close();
    }

}