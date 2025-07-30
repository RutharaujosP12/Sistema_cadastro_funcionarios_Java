package application;


import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner scanner = new Scanner(System.in);

                Funcionario func = new Funcionario();

                String msgIniciar = """
                "Bem vindo ao sistema de cadastro de funcionários:"
                Para iniciar o cadastro, iremos criar um ID único.
                """;
                System.out.println(msgIniciar);

                System.out.print("Entre com o nome do funcionário:");
                String nome = scanner.nextLine();
                func.setNome(nome);

                System.out.print("Sexo (como se identifica):");
                char opSexo = scanner.next().charAt(0);
                scanner.nextLine();
                func.setSexo(opSexo);
                System.out.print("Nível: ");
                String opNivel = scanner.nextLine();
                func.setNivel(opNivel);
                System.out.print("Salário:");
                double salario = scanner.nextDouble();
                func.setSalario(salario);
                scanner.nextLine();
                System.out.println();

                System.out.println("Exibindo Funcionário cadastrado:");

                 System.out.println(func);
                 System.out.println();
                 System.out.println();

                System.out.println("Deseja atualizar os dados?(S/N)");

                 char respostaAtualizacao = scanner.next().charAt(0);
                  System.out.println();
                  System.out.println();
                  System.out.println(func);
                        if (respostaAtualizacao =='S'|| respostaAtualizacao == 's') {
                            System.out.println();
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
                                    func.setSalario(novoSalario);
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Dados atualizados:");
                                    System.out.println(func);
                                    System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");
                                    break;

                                case 2:

                                    System.out.println("Entre com o novo nível:");
                                    scanner.nextLine();
                                    String novoNivel = scanner.nextLine();

                                    //chamada de metodo set para alteração de dados de um atributo
                                    func.setNivel(novoNivel);
                                    System.out.println("Entre com o novo salário:");
                                    novoSalario = scanner.nextDouble();
                                    scanner.nextLine();
                                    func.setSalario(novoSalario);
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Dados atualizados:");
                                    System.out.println(func);
                                    System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");
                                 break;

                                 default:
                                     String atencao = """
                                                    Opção Inválida.
                                                    Selecione uma opção ou entre com "0" para encerrar o programa .
                                                    """;
                                         System.out.println(atencao);

                                     }

                                     do {
                                         System.out.println(opcoes);
                                         opcaoAtualizacao = scanner.nextInt();
                                     }
                                         while (opcaoAtualizacao!=0);
                                         if (opcaoAtualizacao ==0) {
                                             System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");

                                         }

                        }  else {
                        System.out.println("Finalizando o sistema. Obrigada por utilizar nossos serviços!");
                        }

                        scanner.close();
       }

    }
