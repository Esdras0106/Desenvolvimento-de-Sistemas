//  2-Menu de Canetas

// Implemente um programa em Java que exiba um menu com três tipos de canetas: esferográfica, gel e tinteiro. 
// Ao escolher uma opção, o programa deve apresentar uma descrição sobre a caneta selecionada. O menu deve continuar sendo exibido até que o usuário escolha sair. 
//  Caneta Esferográfica: Econômica e de longa duração 
// Caneta Gel: Tinta mais pigmentada e escrita suave 
// Caneta Tinteiro: Clássica e elegante, usada para caligrafia 



import java.util.Scanner;
public class At2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("Menu de Canetas:");
        System.out.println("1. Esferográfica");
        System.out.println("2. Gel");
        System.out.println("3. Tinteiro");
        System.out.println("4. Sair");
            do {
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração.");
                    break;
                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave.");
                    break;
                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia.");
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);
        sc.close();}
}