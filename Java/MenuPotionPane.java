import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuPotionPane {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        boolean executando = true;

        while (executando) { 
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção:\n1. Entrada\n2. Confirmação\n3. Sair");
            if(opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break; // Encerra o loop se o usuário cancelar a entrada
            }
            switch(opcao){
                case "1":
                    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                    if(nome != null) {
                        produtos.add(nome);
                        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!", "Saudação", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada cancelada.");
                    }
                    break;
                case "2":
                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if(resposta == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Você escolheu SIM", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Você escolheu NÃO", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "3":
                    executando = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }

    }    
}
