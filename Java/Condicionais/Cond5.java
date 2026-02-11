import java.util.Scanner;

public class Cond5 {
    public static void main(String[] args) {
        // OPERADOR TERNÁRIO - Uma forma mais concisa de fazer if-else
        // Sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso
        
        Scanner sc = new Scanner(System.in);
        
        // Exemplo 1: Verificar paridade
        System.out.println("=== VERIFICADOR DE PAR OU ÍMPAR ===");
        System.out.println("Informe um número: ");
        int numero = sc.nextInt();
        
        // Usando ternário em vez de if-else
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é " + resultado);
        
        // Exemplo 2: Comparar duas notas com ternário
        System.out.println("\n=== COMPARADOR DE NOTAS ===");
        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        double maiorNota = (nota1 > nota2) ? nota1 : nota2;
        String disciplina = (nota1 > nota2) ? "Primeira" : "Segunda";
        
        System.out.println("A maior nota é " + maiorNota);
        System.out.println("Maior desempenho em: " + disciplina);
        
        // Exemplo 3: Ternário aninhado (usar com cuidado - deixa o código menos legível)
        System.out.println("\n=== CATEGORIZADOR DE PREÇO ===");
        System.out.println("Informe o preço do produto: ");
        double preco = sc.nextDouble();
        
        String categoria = (preco < 50) ? "Barato" : 
                          (preco < 100) ? "Médio" : 
                          (preco < 500) ? "Caro" : 
                          "Muito Caro";
        
        System.out.println("Categoria do preço: " + categoria);
        
        // Exemplo 4: Usando ternário em cálculos
        System.out.println("\n=== CALCULAR DESCONTO ===");
        System.out.println("Informe o valor da compra: ");
        double valor = sc.nextDouble();
        
        // Se compra >= 100, desconto de 10%, senão 5%
        double desconto = (valor >= 100) ? (valor * 0.10) : (valor * 0.05);
        double valorFinal = valor - desconto;
        
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
        
        sc.close();
    }
}
