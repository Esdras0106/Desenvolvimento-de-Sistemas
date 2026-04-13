// "Você foi contratado para ajustar o módulo de pagamentos do SafeBank.
// O sistema atual fecha inesperadamente quando o usuário digita um 
// valor inválido ou tenta sacar mais do que possui. 
// Sua tarefa é envolver a lógica de saque em uma estrutura de tratamento de erros que:
// Capture erros de digitação (ex: InputMismatchException).
// Previna divisões por zero ou valores negativos.
// Utilize o bloco finally para exibir a mensagem 'Operação encerrada' independente do que aconteça."
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial

        try {
            System.out.println("Digite o valor a ser sacado: ");
            double valorSaque = sc.nextDouble();

            if (valorSaque < 0) {
                throw new IllegalArgumentException("Erro: O valor de saque deve ser positivo.");
            }

            if (valorSaque > saldo) {
                throw new IllegalArgumentException("Erro: Saldo insuficiente para o saque.");
            }

            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo restante: " + saldo);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operação encerrada.");
            sc.close();
        }
    }
} 