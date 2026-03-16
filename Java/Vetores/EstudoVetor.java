import java.util.Scanner;

public class EstudoVetor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String[] itens = new String[3];
        int[] idItem = new int[itens.length];
        int limiteItem = 0;
        do{
            System.out.println("== MENU ==");
        System.out.println("Digite 1 para adicionar um item: ");
        System.out.println("Digite 2 para ver a lista de itens: ");
        System.out.println("Digite 3 para alterar um item: ");
        System.out.println("Digite 4 para excluir um item: ");
        System.out.println("Digite 5 para sair: ");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                if(limiteItem >= 3){
                    System.out.println("Limite de itens atingido. Não é possível adicionar mais itens.");
                    break;
                }
                System.out.println("Digite o ID do item que deseja adicionar:");
                idItem[limiteItem] = sc.nextInt();
                System.out.println("Digite o nome do item que deseja adicionar:");
                itens[limiteItem] = sc.next();
                System.out.println("Item adicionado com sucesso.");
                limiteItem++;
                break;
                
                
                
            case 2:
                    System.out.println("Lista de itens:");
                    for(int i = 0; i < itens.length; i++){
                        System.out.println("ID: " + idItem[i] + " - Nome: " + itens[i]);
                    }
                    break;

            case 3: 
                boolean itemExists = true;
                for (int i = 0; i < itens.length; i++){
                    System.out.println("ID: " + idItem[i] + " - Nome: " + itens[i]);
                }
                System.out.println("Digite o nome do item que deseja alterar:");
                sc.nextLine(); // Limpar o buffer
                if (!itemExists){
                    System.out.println("Item não encontrado.");
                } else {
                    String itemAlterar = sc.nextLine();
                    System.out.println("Digite o novo nome do item:");
                    String novoNome = sc.nextLine();
                    for (int i = 0; i < itens.length; i++){
                        if (itens[i].equalsIgnoreCase(itemAlterar)){
                            itens[i] = novoNome;
                            System.out.println("Item alterado com sucesso.");
                            break;
                        }
                    }

                }
                
                break;
             
            case 4:
                boolean itemExistsExcluir = true;
                System.out.println("Digite o ID do item que deseja excluir:");
                if (!itemExistsExcluir){
                    System.out.println("Item não encontrado.");
                } else {
                    int itemExcluirId = sc.nextInt();
                    for (int i = 0; i < itens.length; i++){
                        if (idItem[i] == itemExcluirId){
                            itens[i] = null;
                            idItem[i] = 0;
                            System.out.println("Item excluído com sucesso.");
                            break;
                        }
                    }
                }
                sc.nextLine(); // Limpar o buffer  
                break;
            
            case 5:
                System.out.println("Saindo do programa...");
                break;
            }
            
        } while (true);
        
    }
}

