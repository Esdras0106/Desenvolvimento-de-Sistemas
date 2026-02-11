import java.util.Scanner;

public class Cond1 {
    public static void main(String[] args) {
        // String nome = "Guilherme";
        // int idade = 25;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.next();

        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();

        if (idade>=18) {
            System.out.println(nome+" sua idade é "+idade+" você é maior de idade");
        }

        System.out.println("Ola "+nome+ "sua idade é "+idade);

        sc.close();

        System.out.println("olá "+nome+ "sua idade é "+idade);
    
    }
    
}

