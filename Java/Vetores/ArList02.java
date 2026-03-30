import java.util.ArrayList;

 public class ArList02{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        //Adicionar

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Listando
        for(int i=0; i < numeros.size();i++){
            System.out.println((i+1)+ "-"+numeros.get(i));
        }

        System.out.println("==================================");

        // Alterar
        numeros.set(2, 50);
        System.out.println(numeros);
        
        //Remover
        numeros.remove(1);
        System.out.println("==================================");
        for(Integer numero: numeros){
            System.out.println(numero);
        }
    }
}