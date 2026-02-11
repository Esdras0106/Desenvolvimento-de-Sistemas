//ESCREVA UM PROGRAMA QUE SOLICITE AO USUÁRIO DOIS NÚMEROS E EXIBA A SOMA, SUBTRAÇÃO, DIVISÃO E MULTIPLICAÇÃO.
//ESCREVA UM PROGRAMA QUE SOLICITE AO USUÁRIO DOIS NÚMEROS E CALCULE A MÉDIA
//ESCREVA UM PROGRAMA QUE CALCULE A MÉDIA ARITMÉTICA DE DOIS NÚMEROS.
//ESCREVA UM PROGRAMA QUE CALCULE A MÉDIA ARITMÉTICA DE TRÊS NÚMEROS.
//ESCREVA UM PROGRAMA QUE CALCULE O TRABALHO REALIZADO POR UMA FORÇA QUE ATUA SOBRE UM OBJETO, UTILIZANDO A FÓRMULA T=F*D, ONDE T É O TRABALHO, F É A FORÇA APLICADA E D É A DISTÂNCIA PERCORRIDA PELO OBJETO
//ESCREVA UM PROGRAMA QUE CALCULE O IMC DE UM INDIVÍDUO, UTILIZANDO A FÓRMULA IMC =PESO / ALTURA2.

import java.util.Scanner;

public class At1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        double n1 = sc.nextDouble();

        System.out.println("Informe um numero");
        double n2 = sc.nextDouble();

        double soma = n1+n2;
        double sub = n1-n2;
        double mult = n1*n2;
        double div = n1/n2;
       
        System.out.println("Soma: " +soma );
        System.out.println("Subtração: " +sub );
        System.out.println("Multiplicação: " +mult );
        System.out.println("Divisão: "+div);

        sc.close();
    }
}

