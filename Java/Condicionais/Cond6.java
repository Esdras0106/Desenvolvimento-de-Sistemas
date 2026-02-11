import java.util.Scanner;

public class Cond6 {
    public static void main(String[] args) {
        // ESTRUTURA SWITCH-CASE
        // Usada quando você tem múltiplas opções de UM mesmo valor
        // Mais limpa que muitos if-else-if
        
        Scanner sc = new Scanner(System.in);
        
        // Exemplo 1: Número do dia da semana
        System.out.println("=== CONVERSOR DE DIA DA SEMANA ===");
        System.out.println("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido! Digite um número entre 1 e 7");
        }
        
        // Exemplo 2: Menu de operações
        System.out.println("\n=== CALCULADORA SIMPLES ===");
        System.out.println("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.println("Digite a opção (1-4): ");
        int operacao = sc.nextInt();
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro! Não é possível dividir por zero.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida! Digite um número entre 1 e 4");
                operacaoValida = false;
        }
        
        // Exemplo 3: Avaliação com switch usando char
        System.out.println("\n=== AVALIADOR DE CONCEITO ===");
        System.out.println("Digite seu conceito (A, B, C ou D): ");
        char conceito = sc.next().toUpperCase().charAt(0);
        
        switch (conceito) {
            case 'A':
                System.out.println("Excelente! Parabéns!");
                break;
            case 'B':
                System.out.println("Bom trabalho!");
                break;
            case 'C':
                System.out.println("Satisfatório, mas pode melhorar");
                break;
            case 'D':
                System.out.println("Precisa estudar mais");
                break;
            default:
                System.out.println("Conceito inválido!");
        }
        
        sc.close();
    }
}
