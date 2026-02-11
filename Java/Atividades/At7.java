// PROBLEMA: Entrar com dois números e na sequência uma operação aritmética. O resultado da operação sobre os
// dois números deve ser mostrado.
// DADOS DE ENTRADA: OPERANDO1(real), OPERANDO2 (real) e OPERADOR (caracter)
// DADOS DE SAÍDA: RESULTADO (real)
// // Atenção: para fins de simplificação não são mostradas mensagens para as entradas de dados

import java.util.Scanner;

public class At7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.println("Informe o segundo número: ");
        float n2 = sc.nextFloat();
        System.out.println("Informe a operação desejada: +, -, *, /");
        char operador = sc.next().charAt(0);
        float resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = n1 + n2;
                break;

            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, escolha entre +, -, *, /.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado da operação: " + resultado);
        }
        sc.close();
    }
}