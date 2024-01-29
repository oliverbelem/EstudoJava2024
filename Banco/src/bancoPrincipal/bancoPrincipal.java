package bancoPrincipal;

import UtilBanco.contaBancaria;

import java.util.Objects;
import java.util.Scanner;

public class bancoPrincipal {
    public static void main(String[] args) {

        contaBancaria contaBanco = new contaBancaria();
        Scanner sc = new Scanner(System.in);
        double depositoConta = 0;
        double saqueConta = 0;
        double valorEmConta = 0;

        System.out.print("Número da conta: ");
        int numConta = sc.nextInt();
        System.out.print("Nome do titular: ");
        String nomeConta = sc.nextLine();
        nomeConta = sc.nextLine();
        System.out.print("Deseja realizar deposito inicial? (S/N): ");
        String validacao = sc.nextLine();

        while(!Objects.equals(validacao, "S") || !Objects.equals(validacao, "N")) {
            if (Objects.equals(validacao, "S") || Objects.equals(validacao, "sim")) {
                System.out.print("Coloque o valor a ser depositado: ");
                depositoConta = sc.nextDouble();
                break;
            }else if (Objects.equals(validacao, "N") || Objects.equals(validacao, "não")) {
                System.out.println("Nenhum valor a ser depositado\n");
                break;
            }else {
                System.out.print("Insira um valor valido: ");
                validacao = sc.nextLine();
            }
        }
        //Aqui é inserio do valor, se adicionado na validação acima.
        contaBanco.depositoConta(depositoConta);
        contaBanco = new contaBancaria(numConta, depositoConta, nomeConta);
        System.out.println(contaBanco);
        System.out.println();
        //Aqui será feito a adição do deposito
        System.out.print("Digite o valor do seu depósito: ");
        depositoConta = sc.nextDouble();
        contaBanco.depositoConta(depositoConta);
        System.out.println("Atualização da conta:" + contaBanco);
        //Aqui será feito o saque
        System.out.println();
        System.out.print("Digite o valor do seu saque: ");
        saqueConta = sc.nextDouble();
        contaBanco.saqueConta(saqueConta);
        System.out.println("Atualização da conta:" + contaBanco);

    }
}
