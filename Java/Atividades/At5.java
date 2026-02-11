

// -ESCREVA UM PROGRAMA QUE SOLICITE A IDADE DE UMA PESSOA E EXIBA SE ELA É MAIOR DE IDADE OU NÃO.

import java.util.Scanner;
public class At5 {
    public static void main(String[] args) {
        System.out.println("Informe uma idade: ");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        boolean maior = n1 >= 18;
            if (maior) {
                System.out.println("A pessoa é maior de idade");
            } else {
                System.out.println("A pessoa é menor de idade");
            }
        System.out.println("A pessoa é maior de idade ? " + maior);
        sc.close();
    }
}

