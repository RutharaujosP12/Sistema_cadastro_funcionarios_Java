package exe;


import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
                Scanner scanner = new Scanner(System.in);


                System.out.println("Bem vindo ao sistema de cadastro de funcionários:");
                System.out.print("Entre com o nome do funcionário:");
                //não está pegando o nome completo pq o string lê uma palavra até o espaço em branco
                String nome = scanner.nextLine();

                System.out.print("Sexo (como se identifica):");
                char opSexo = scanner.next().charAt(0);
                scanner.nextLine();
                System.out.print("Nível: ");
                String opNivel = scanner.next();
                scanner.nextLine();
                System.out.print("Salário:");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                System.out.println();

                System.out.println("Exibindo Funcionário cadastrado:");
                //chamando o objeto já com seu construtor que espera os tipos de dados recebidos pelo usuário
        Funcionario funcionario = new Funcionario(nome,opSexo, opNivel,salario);
                 System.out.println(funcionario);
                 System.out.println();
                 System.out.println();



                System.out.println("Deseja atualizar os dados?(S/N)");
                 char respostaAtualizacao = scanner.next().charAt(0);
                  System.out.println();
                  System.out.println();

                        if (respostaAtualizacao =='S'|| respostaAtualizacao == 's') {
                            System.out.println(funcionario);
                            System.out.println();
                            System.out.println();

                            String opcoes = """
                                    Dados permitidos para atualização:
                                    1. Salário - valor de recebimento baseado no nível/cargo 
                                    2. Nível e Salário;
                                    """;
                            System.out.println(opcoes);
                            System.out.println(" O que deseja atualizar:");
                            int opcaoAtualizacao = scanner.nextInt();

                            switch (opcaoAtualizacao) {

                                case 1:
                                    System.out.println("Entre com o novo salário:");
                                    scanner.nextLine();
                                    double novoSalario = scanner.nextDouble();
                                    funcionario.setSalario(novoSalario);
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Dados atualizados:");
                                    System.out.println(funcionario);
                                    System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");
                                    break;

                                case 2:

                                    System.out.println("Entre com o novo nível:");
                                    scanner.nextLine();
                                    String novoNivel = scanner.nextLine();
                                    //chamada de métodos setter para alteração de dados de um atributo
                                    funcionario.setNivel(novoNivel);
                                    System.out.println("Entre com o novo salário:");
                                    novoSalario = scanner.nextDouble();
                                    scanner.nextLine();
                                    funcionario.setSalario(novoSalario);
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Dados atualizados:");
                                    System.out.println(funcionario);
                                    System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");

                                  default:
                                            String atencao = """
                                                    Opção Inválida. 
                                                    Selecione uma opção ou entre com "0" o programa .
                                                    """;
                                            System.out.println(atencao);

                                    }

                        }  else {
                        System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");
                        }

                        scanner.close();
       }

    }
