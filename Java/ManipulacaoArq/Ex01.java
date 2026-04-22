import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try{
            File arquivo = new File("Exemplo.pdf");
            if (arquivo.createNewFile()){
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("O arquivo já existe.");
            }

        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}