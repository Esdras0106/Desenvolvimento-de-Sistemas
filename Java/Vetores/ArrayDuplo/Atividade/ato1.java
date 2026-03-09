// Uma loja precisa de um sistema simples para controlar seus produtos.

// Você deverá criar um programa em Java que permita:

// Funcionalidades obrigatórias

// 1-Cadastrar produto

// -Solicitar nome do produto

// -Solicitar quantidade em estoque

// -Armazenar em arrays

// 2-Listar produtos

// -Mostrar todos os produtos cadastrados

// -Exibir índice, nome e quantidade

// 3-Pesquisar produto

// -Buscar pelo nome

// -Mostrar dados se encontrado

// 4-Alterar produto

// -Buscar produto pelo nome

// -Permitir alterar nome e quantidade

// 5-Remover produto

// -Buscar pelo nome

// -Remover deslocando os elementos do array

// 6-Sair do sistema

// Regras do Sistema:

// Capacidade máxima: 5 produtos
// Controlar cadastros com variável qtd
// Não deixar espaços vazios no array ao remover


import java.util.Scanner;

public class ato1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] NomeProduto = new String[5];
        int[] quantidade = new int[5];

        int qtd = 0;
        int opcao;

        while (qtd < 5) {
            System.out.println("INFORME A OPÇÃO DESEJADA: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Excluir produto");
            System.out.println("6 - Sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1: // Cadastrar produto
                    if (qtd < 5) {
                        System.out.println("Digite o nome do produto: ");
                        NomeProduto[qtd] = sc.nextLine();
                        System.out.println("Digite a quantidade do produto: ");
                        quantidade[qtd] = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer
                        qtd++;
                        } else {
                            System.out.println("Limite de produtos atingido.");
                        }
                        break;
                    case 2: // Listar produtos
                    
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("\tÍndice: " + i + " - Produto: " + NomeProduto[i] + " - Quantidade: " + quantidade[i]);
                        }
                        boolean itemEncontrado = true;
                        if(itemEncontrado == false){
                            System.out.println("Nenhum produto cadastrado.");
                        }
                        break;
                    case 3: // Pesquisar produto
                    System.out.println("Digite o nome do produto para pesquisar: ");
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 1; i < qtd; i++) {
                        if (NomeProduto[i].equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("\tÍndice: " + i + " - Produto encontrado: " + NomeProduto[i] + " - Quantidade: " + quantidade[i]);
                            encontrado = true;
                            System.out.println("Pressione Enter para continuar...");
                            sc.nextLine(); // Limpar o buffer
                            break;
                        }
                    }
                        if (!encontrado) {
                            System.out.println("Produto não encontrado.");
                        }
                        break;
                    case 4: // Alterar produto
                    System.out.println("Digite o nome do produto para alterar: ");
                    String nomeAlterar = sc.nextLine();
                    boolean encontradoAlterar = false;
                    for (int i = 1; i < qtd; i++) {
                        if (NomeProduto[i].equalsIgnoreCase(nomeAlterar)) {
                            System.out.println("\tÍndice: " + i + " - Produto encontrado: " + NomeProduto[i] + " - Quantidade: " + quantidade[i]);
                            encontradoAlterar = true;
                            
                                System.out.println("Digite o novo nome do produto: ");
                                NomeProduto[i] = sc.nextLine();
                                System.out.println("Digite a nova quantidade do produto: ");
                                quantidade[i] = sc.nextInt();
                                sc.nextLine(); // Limpar o buffer

                            break;

                        }
                    }
                    if (!encontradoAlterar) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                    
                    case 5: // Excluir produto
                    System.out.println("Digite o nome do produto para excluir: ");
                    String nomeExcluir = sc.nextLine();
                    boolean encontradoExcluir = false;  
                    for (int i = 1; i < qtd; i++) {
                        if (NomeProduto[i].equalsIgnoreCase(nomeExcluir)) {{

                            System.out.println("\tÍndice: " + i + " - Produto encontrado: " + NomeProduto[i] + " - Quantidade: " + quantidade[i]);
                            
                            // Shift dos produtos para excluir o produto encontrado
                            for (int j = i; j < qtd - 1; j++) {
                                NomeProduto[j] = NomeProduto[j + 1];
                                quantidade[j] = quantidade[j + 1];
                            }
                            NomeProduto[qtd - 1] = null; // Limpar a última posição
                            quantidade[qtd - 1] = 0; // Limpar a última posição
                            qtd--; // Reduzir a contagem de produtos
                            System.out.println("Produto excluído com sucesso.");
                            encontradoExcluir = true;                            
                            break;
                            
                        }
                    }
                        


                    }
                    if (!encontradoExcluir) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                    
                    case 6: // Sair
                        System.out.println("Saindo do programa.");
                        sc.close();
                        return;
                    
                default:
                    throw new AssertionError();
            }
        }
    }
}
