import java.io.FileWriter;

public class Ex02 {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("Exemplo.txt");
            escritor.write("Olá, este é um exemplo de escrita em um arquivo de texto.");
            escritor.close();
            System.out.println("Arquivo escrito com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
