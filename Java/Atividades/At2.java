import java.util.Scanner;

public class At2 {
    public static void main(String[] args) {
       
        System.out.println("Informe um numero: ");
        Scanner sc = new Scanner(System.in);    
        double n1 = sc.nextDouble();

        boolean positivo = n1>0 ;
        boolean negativo = n1 <0 ;
        System.out.println("O número é positivo? " + positivo);
        System.out.println("O número é negativo? " + negativo);
        sc.close();
    }
}
