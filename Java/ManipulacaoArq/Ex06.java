import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Ex06 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Exemplo.txt"));
            bw.write("Terceira linha do arquivo.");
            bw.newLine();
            bw.write("Quarta linha do arquivo.");
            bw.close();
            System.out.println("Arquivo escrito com sucesso.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
