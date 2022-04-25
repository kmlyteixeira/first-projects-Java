import java.util.Scanner;

public class ExercRepeticao {
    public static void main(String[] args) {

        
        int senha, x, impar;
        Scanner sc = new Scanner(System.in);

        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002

        System.out.println("==================");
        System.out.println("VALIDAÇÃO DA SENHA");
        System.out.println("==================");
        System.out.printf("Insira a senha de 4 digitos >>> ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.printf("Senha inválida! Tente novamente >>> ");
            senha = sc.nextInt();
        }

        System.out.println("Senha correta, be continued...");
        
        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.

        System.out.println("================");
        System.out.println("FOR - REPETICAO");
        System.out.println("================");
        System.out.printf("Insira um valor para X >>> ");
        x = sc.nextInt();

        System.out.printf("Numeros ímpares nesta seleção: ");
        for (int i = 1; i <=x; i++) {
            if (i%2!=0) {
                impar = i;
                System.out.printf(impar + " | ");
            }
        }
        sc.close();
    }
}
