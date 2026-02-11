// CRIE UM PROGRAMA QUE SOLICITE A IDADE DE UMA PESSOA E EXIBA SE ELA É
// CRIANÇA (0-12 ANOS), ADOLESCENTE(13-17 ANO), ADULTO (18-59 ANOS) OU IDOSO(60 ANOS OU MAIS)
import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();
        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else  {
            System.out.println("Idoso");
        }
        sc.close();
    }
}

