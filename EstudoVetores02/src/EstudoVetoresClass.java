import Util.programa;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EstudoVetoresClass {

    public static void main(String[] args) {

        //Temos o mesmo problema do 01, mas com classes neste.

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de Produtos: ");
        int v = sc.nextInt();
        double soma = 0;
        programa[] Vetor = new programa[v];

        //sout posto para incrementar vizualização do processo

        for (int i = 0; i < Vetor.length; i++) {

            if(i == 0) {
                System.out.println("Digite o primeiro produto:");
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor: ");
                double preco = sc.nextDouble();
                Vetor[i] = new programa(nome,preco);
            } else {
                System.out.println("Digite o " + (i+1) +"º produto:");
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor: ");
                double preco = sc.nextDouble();
                Vetor[i] = new programa(nome,preco);
            }

            soma += Vetor[i].getPreco();
        }

        for (int i = 0; i < Vetor.length; i++) {
            System.out.println(Vetor[i]);
        }

        //double media = soma / Vetor.length;
        //System.out.println("A média dos produtos: " + media);

    }
}