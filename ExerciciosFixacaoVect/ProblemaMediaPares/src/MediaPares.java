import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

        Scanner sc = new Scanner(System.in);
        double media = 0, soma = 0, qsoma = 0;
        System.out.print("Insira quantos numeros quer ler: ");
        int n = sc.nextInt();
        double[] Array = new double[n];

        for (int i = 0; i < Array.length; i++) {
            System.out.print("Insira o " + (1+i) + "º número: ");
            Array[i] = sc.nextDouble();
                if (Array[i] % 2 == 0){
                    soma += Array[i];
                    qsoma += 1;
                }
        }

        media = soma / qsoma;

        if (media > 0) {
            System.out.println("A média dos números foi: " + String.format("%.1f",media));
        }else {
            System.out.println("Não temos números Pares...");
        }


    }
}