import Util.alunos;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {

        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        alunos[] Array = new alunos[n];


        for (int i = 0; i < Array.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            Array[i] = new alunos(nome, nota1, nota2);
        }
        System.out.println("-----------------");
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < Array.length; i++) {
            if ((Array[i].getNota1() + Array[i].getNota2()) / 2 >= 6 ) {
                System.out.println(Array[i].getNome());
            }
        }
    }
}