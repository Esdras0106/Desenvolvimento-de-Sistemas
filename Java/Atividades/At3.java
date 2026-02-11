// -Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.



import java.util.Scanner;

public class At3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double n1 = sc.nextDouble();
        boolean par = n1 % 2 == 0;
        boolean impar = n1 % 2 != 0;
        System.out.println("O número é par? " + par);
        System.out.println("O número é ímpar? " + impar);
       
        sc.close();
    }
}
