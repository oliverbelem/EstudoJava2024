import java.util.Scanner;

@SuppressWarnings("ALL")
public class EstudoVetor {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas alturas você quer ler: ");
        int Vetor = sc.nextInt();
        double somaAltura = 0;
        double[] Altura = new double[Vetor]; //Declaração do Vetor;

        for (int i = 0; i < Vetor; i++ ){
            //Teste para tornar exercicio mais gráfico, implementado por mim mesmo.
            if ( i==0 ) {
                System.out.print("Digite a 1º altura: ");
                Altura[i] = sc.nextDouble();
            }else if (i!= 0){
                System.out.printf("Digite a %dº altura: ", i+1);
                Altura[i] = sc.nextDouble();
            }
            somaAltura += Altura[i]; // Fará a soma das alturas para entrar na média posteriormente.
        }

        double media = somaAltura / Vetor;
        System.out.println("A média das alturas é " + String.format("%.2f", media));


    }
}