import java.util.Scanner;

public class Cond4 {
    public static void main(String[] args) {
        // CONDICIONAIS ANINHADAS (if dentro de if)
        // Útil quando você precisa verificar condições dependentes
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== VERIFICADOR DE APROVAÇÃO ===");
        System.out.println("Informe sua nota (0 a 10): ");
        double nota = sc.nextDouble();
        
        System.out.println("Informe suas faltas: ");
        int faltas = sc.nextInt();
        
        // Primeiro verifica se a nota é válida
        if (nota >= 0 && nota <= 10) {
            // Depois verifica se foi aprovado por nota
            if (nota >= 7) {
                // Depois verifica se tem falta excessiva
                if (faltas > 3) {
                    System.out.println("Reprovado por falta excessiva!");
                } else {
                    System.out.println("Parabéns! Você foi aprovado!");
                }
            } else {
                System.out.println("Reprovado por nota baixa!");
            }
        } else {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10");
        }
        
        // Exemplo 2: Verificar se pode comprar em loja de maiores
        System.out.println("\n=== VERIFICADOR DE ACESSO À LOJA ===");
        System.out.println("Qual é sua idade? ");
        int idade = sc.nextInt();
        
        System.out.println("Você tem documentação? (1=sim, 0=não): ");
        int temDocumento = sc.nextInt();
        
        if (idade >= 18) {
            if (temDocumento == 1) {
                System.out.println("Bem-vindo à loja! Você pode entrar.");
            } else {
                System.out.println("Você é maior de idade, mas precisa de documentação para entrar.");
            }
        } else {
            System.out.println("Desculpe, você é menor de idade e não pode entrar.");
        }
        
        sc.close();
    }
}
