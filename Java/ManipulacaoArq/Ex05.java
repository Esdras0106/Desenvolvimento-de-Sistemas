import java.io.File;
import java.io.FileReader;

public class Ex05 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("Exemplo.txt");
            int caractere;

            while((caractere = fr.read()) != -1){
                System.out.print((char) caractere);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }    
}
