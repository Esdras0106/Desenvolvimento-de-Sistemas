import java.util.Scanner;

public class CrudAtt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] carros = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.err.println("Digite o "+i+"º nome:");
            carros[i] = sc.nextLine();
        
        }

        for (String c: carros){
            System.out.println("Os nomes dos carros são: "+c);
        }

        System.out.print("\nDigite a posição para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (posAlterar >= 0 && posAlterar < carros.length) {
            System.out.print("Digite o novo nome: ");
            carros[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após alteração:");
        for (int i = 0; i < carros.length; i++) {
            System.out.println(i + " - " + carros[i]);
        }
        System.out.println("Digite a posição para remover: ");
        int posRemover = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (posRemover >= 0 && posRemover < carros.length) {
            for (int i = posRemover; i < carros.length - 1; i++) {
                carros[i] = carros[i + 1];
            }
            carros[carros.length - 1] = null;
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após remoção:");
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null) {
                System.out.println(i + " - " + carros[i]);
            }
        }

       
    }    
}
