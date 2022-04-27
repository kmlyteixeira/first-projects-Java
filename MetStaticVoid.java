import java.util.Scanner;

//Exemplo de criação de dois métodos
// 1º MAIOR VALOR Static - retorna valor a ser utilizado na Main
// 2º MOSTRA RESULTADO Void - não retorna um valor 

public class MetStaticVoid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ---- O MAIOR ENTRE TRÊS NUMEROS ---- ");
        int i, a = 0, b = 0, c = 0;
        for (i = 1; i <= 3; i++) {
            System.out.println("Enter the " + i + "º number");
            if (i == 1) {
                a = sc.nextInt();
            } else if (i == 2) {
                b = sc.nextInt();
            } else if (i == 3) {
                c = sc.nextInt();
            }
        }

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
