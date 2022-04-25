import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        //Fazer um programa para ler um valor inteiro de 1 a 7 representando um
        //dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
        //Escrever na tela o dia da semana correspondente

        int nDiaSem;
        String aDiaSem;
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("DIA DA SEMANA - SWITCH");
        System.out.println("=======================");
        System.out.printf("Insira o Nº que corresponde ao dia da semana >>> ");
        nDiaSem = sc.nextInt();
        switch (nDiaSem) {
            case 1:
                aDiaSem = "Domingo";
                break;
            case 2:
                aDiaSem = "Segunda";
                break;
            case 3:
                aDiaSem = "Terça";
                break;
            case 4:
                aDiaSem = "Quarta";
                break;
            case 5:
                aDiaSem = "Quinta";
                break;
            case 6:
                aDiaSem = "Sexta";
                break;
            case 7:
                aDiaSem = "Sábado";
                break;
            default:
                aDiaSem = "Valor Inválido";
                break;
        }

        System.out.println("O dia da semana é: " + aDiaSem);
        sc.close();
    }
}
