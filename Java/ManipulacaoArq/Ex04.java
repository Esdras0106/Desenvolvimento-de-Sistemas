import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        
        try{
            FileWriter fw = new FileWriter("Exemplo.txt");
            fw.write("Olá, este é um exemplo de escrita em um arquivo de texto.");
            fw.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace();   
        }
    }    
}
