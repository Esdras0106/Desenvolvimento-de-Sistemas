import java.io.BufferedReader;
import java.io.FileReader;

public class Ex07 {
    public static void main(String[] args) {

        try{BufferedReader br = new BufferedReader(new FileReader("Exemplo.txt"));
            String linha;

            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
}
}