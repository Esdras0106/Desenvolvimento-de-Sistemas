import java.io.File;
import java.io.FileWriter;
public class AlterarArquivo {
    public static void main(String[] args) {
        String caminho = "Exemplo.txt";

        try{
            FileWriter writer = new FileWriter(caminho);
            writer.write("Conteúdo atualizado do arquivo.");
            writer.write("\nEste texto substituirá o conteúdo anterior.");
            writer.close();
            System.out.println("Arquivo atualizado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
