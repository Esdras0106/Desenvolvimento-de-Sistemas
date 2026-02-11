// -PROBLEMA: Controlar o acesso a uma porta usando uma senha pré-configurada no sistema.
// DADO DE ENTRADA: SENHA (variável alfanumérica)
// DADO DE SAÌDA: porta aberta (simulado com msg "PORTA ABERTA") ou mensagem de "SENHA NAO CONFERE"
// VARIÁVEIS: SENHA (tipo alfanumérica)



import java.util.Scanner;
public class At6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme sua senha: ");
        String senha = sc.nextLine();
        boolean acesso = senha.equals("010608");
        if (acesso) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NÃO CONFERE");
        }
        
        
        sc.close();
    }
}
