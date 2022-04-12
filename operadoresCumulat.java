import java.util.Scanner;

public class operadoresCumulat {
    public static void main(String[] args) {
        //EXERCICIO 01 - Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        //dá direito a 100 minutos de telefone. Cada minuto que exceder a
        //franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        //quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

        /* TIPOS DE OPERADORES DE ATRIBUIÇÃO CUMULATIVA
        a+= b >>>> a= a+b 
        a-= b >>>> a= a-b 
        a*= b >>>> a= a*b 
        a/= b >>>> a= a/b 
        a%= b >>>> a= a%b */

        int minutos;
        double vlrConta;
        Scanner sc = new Scanner(System.in);

        System.out.println("==================");
        System.out.println("OPERADORA TELEFONE");
        System.out.println("==================");

        System.out.println("Insira a quantidade de mintos utilizados >>> ");
        minutos = sc.nextInt();
        vlrConta = 50.00;

        if (minutos > 100){
            vlrConta =+ (minutos - 100) *2;
        }

        System.out.printf("O valor da conta ficará em R$%.2f%n" , vlrConta); 

        sc.close();
    }
}
