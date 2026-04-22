import java.io.File;

public class RemoverArquivo {
    public static void main(String[] args) {
        
        String caminho = "popopo.txt";

        File arquivo = new File(caminho);

        if (arquivo.exists()){
            if (arquivo.delete()){
                System.out.println("Arquivo deletado: " + arquivo.getName());
            } else {
                System.out.println("Falha ao deletar o arquivo.");
            }
        } else {
            System.out.println("O arquivo não existe.");
        }
    }
}
