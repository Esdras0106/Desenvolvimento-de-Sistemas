import java.util.Scanner;

public class gestaoViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays e Constantes
        int MAX_ONIBUS = 4;
        int MAX_RESERVAS = 20;
        
        int[] idOnibus = new int[MAX_ONIBUS];
        int[] qtdAssentos = new int[MAX_ONIBUS];
        
        // Arrays para guardar os dados das reservas
        String[] nomePassageiros = new String[MAX_RESERVAS];
        int[] onibusReservados = new int[MAX_RESERVAS];

        // Variáveis de controle
        int opcao = 0;
        int qtOnibus = 0;
        int qtReservas = 0;
        boolean assentosRegistrados = false;

        do {
            System.out.println("\n=== Menu Viagem RoadTrip ===");
            System.out.println("1 - Registrar o número de cada ônibus");
            System.out.println("2 - Registrar o quantitativo de assentos disponíveis");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Quantos ônibus deseja registrar? (Máximo de 4): ");
                    qtOnibus = sc.nextInt();
                    sc.nextLine();

                    if (qtOnibus <= 0 || qtOnibus > MAX_ONIBUS) {
                        System.out.println("Quantidade inválida! Deve ser entre 1 e 4.");
                        qtOnibus = 0; 
                    } else {
                        for (int i = 0; i < qtOnibus; i++) {
                            System.out.print("Digite o número (ID) do ônibus " + (i + 1) + ": ");
                            idOnibus[i] = sc.nextInt();
                        }
                        sc.nextLine();
                        System.out.println("Ônibus registrados com sucesso!");
                    }
                    break;

                case 2:
                    if (qtOnibus == 0) {
                        System.out.println("Atenção: Você precisa registrar os ônibus (Opção 1) primeiro!");
                        break;
                    }
                    
                    System.out.println("--- Cadastro de Assentos ---");
                    for (int i = 0; i < qtOnibus; i++) {
                        System.out.print("Quantidade de assentos para o ônibus " + idOnibus[i] + "(Max 20): ");
                        qtdAssentos[i] = sc.nextInt();
                        if (qtdAssentos[i] < 0 || qtdAssentos[i] > 20) {
                            System.out.println("Quantidade de assentos inválida! Deve ser entre 0 e 20.");
                            qtdAssentos[i] = 0; 
                        }
                    }
                    sc.nextLine();
                    assentosRegistrados = true;
                    System.out.println("Assentos registrados com sucesso!");
                    break;

                case 3:
                    if (qtOnibus == 0 || !assentosRegistrados) {
                        System.out.println("Atenção: Registre os ônibus e os assentos antes de fazer reservas!");
                        break;
                    }
                    if (qtReservas >= MAX_RESERVAS) {
                        System.out.println("Limite total de 20 reservas atingido no sistema!");
                        break;
                    }

                    System.out.print("Digite o número do ônibus para reserva: ");
                    int idBusca = sc.nextInt();
                    sc.nextLine();
                    
                    boolean onibusEncontrado = false;
                    for (int i = 0; i < qtOnibus; i++) {
                        if (idOnibus[i] == idBusca) {
                            onibusEncontrado = true;
                            if (qtdAssentos[i] > 0) {
                                System.out.print("Digite o nome do passageiro: ");
                                String nome = sc.nextLine();
                                
                                // Salva a reserva
                                nomePassageiros[qtReservas] = nome;
                                onibusReservados[qtReservas] = idBusca;
                                qtReservas++;
                                qtdAssentos[i]--; // Diminui 1 assento disponível
                                
                                System.out.println("Reserva realizada com sucesso!");
                            } else {
                                System.out.println("Não há assentos disponíveis para este ônibus!");
                            }
                            break; // Sai do loop 
                        }
                    }
                    
                    if (!onibusEncontrado) {
                        System.out.println("Este ônibus não existe!");
                    }
                    break;

                case 4:
                    if (qtOnibus == 0) {
                        System.out.println("Atenção: Nenhum ônibus registrado ainda.");
                        break;
                    }

                    System.out.print("Digite o número do ônibus para consultar: ");
                    int idConsulta = sc.nextInt();
                    sc.nextLine();
                    
                    boolean existeBus = false;
                    boolean temReserva = false;

                    // Verifica se o ônibus existe na frota
                    for (int i = 0; i < qtOnibus; i++) {
                        if (idOnibus[i] == idConsulta) {
                            existeBus = true;
                            break;
                        }
                    }

                    if (!existeBus) {
                        System.out.println("Este ônibus não existe!");
                    } else {
                        System.out.println("--- Reservas para o ônibus " + idConsulta + " ---");
                        // Busca nas reservas
                        for (int i = 0; i < qtReservas; i++) {
                            if (onibusReservados[i] == idConsulta) {
                                System.out.println("- Passageiro: " + nomePassageiros[i]);
                                temReserva = true;
                            }
                        }
                        if (!temReserva) {
                            System.out.println("Não há reservas realizadas para este ônibus!");
                        }
                    }
                    break;

                case 5:
                    if (qtReservas == 0) {
                        System.out.println("Não há nenhuma reserva no sistema ainda!");
                        break;
                    }
                    
                    System.out.print("Digite o nome do passageiro: ");
                    String nomeConsulta = sc.nextLine();
                    
                    boolean achouPassageiro = false;
                    System.out.println("--- Reservas de " + nomeConsulta + " ---");
                    
                    for (int i = 0; i < qtReservas; i++) {
                        
                        if (nomePassageiros[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Ônibus: " + onibusReservados[i]);
                            achouPassageiro = true;
                        }
                    }
                    
                    if (!achouPassageiro) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha entre 1 e 6.");
            }
        } while (opcao != 6); // O loop repete até o usuário digitar 6

        sc.close();
    }
}