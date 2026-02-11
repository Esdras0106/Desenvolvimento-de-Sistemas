import java.util.Scanner;

public class Cond3 {
    public static void main(String[] args) {
        // CONDICIONAL ENCADEADA (if-else-if)
        // Usa-se quando há múltiplas condições a verificar
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua nota (0 a 10): ");
        int nota = sc.nextInt();
        
        // Verificando faixas de notas
        if (nota >= 9) {
            System.out.println("Parabéns! Conceito A - Excelente!");
        } else if (nota >= 7) {
            System.out.println("Bom trabalho! Conceito B - Bom!");
        } else if (nota >= 5) {
            System.out.println("Conceito C - Satisfatório");
        } else {
            System.out.println("Conceito D - Insuficiente. Estude mais!");
        }
        
        // Exemplo 2: Categorizar idade
        System.out.println("\nInforme sua idade: ");
        int idade = sc.nextInt();
        
        if (idade < 12) {
            System.out.println("Você é uma criança");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente");
        } else if (idade < 60) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
        
        sc.close();
    }
}
