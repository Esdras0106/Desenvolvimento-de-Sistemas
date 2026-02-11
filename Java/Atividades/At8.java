// Em uma loja e CD ́s existem apenas quatro tipos de preços que estão associados a cores. 
// Assim os CD ́s que ficam na loja não são marcados por preços e sim por cores.
// Desenvolva o algoritmo que a partir a entrada da cor o software mostre o preço.
// A loja está atualmente com a seguinte tabela de preços.

import java.util.Scanner;

public class At8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a cor do CD: ");
        String cor = sc.nextLine();
        float preco = 0;
        boolean corValida = true;

        switch (cor.toLowerCase()) {
            case "verde":
                preco = 10.00f;
                break;
            case "azul":
                preco = 20.00f;
                break;
            case "amarelo":
                preco = 30.00f;
                break;
            case "vermelho":
                preco = 40.00f;
                break;
            default:
                System.out.println("Cor inválida.");
                corValida = false;
        }

        if (corValida) {
            System.out.println("O preço do CD da cor " + cor + " é R$ " + preco);
        }
        sc.close();
    }
}
