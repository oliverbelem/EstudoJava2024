import util.funcionarios;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programaPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List <funcionarios> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i+1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            //Teste de existência de Id
            while(hasId(list, id)){
                System.out.print("Esse Id já existe, tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            funcionarios func = new funcionarios(id, nome, salario);
            list.add(func);
        }

        System.out.print("Qual ID do funcionário que irá receber aumento? ");
        int id = sc.nextInt();

        //Buscando na lista um funcionário que tenha a ID igual a digitada...
        funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (func == null) {
            System.out.println("ID inexistente...");
        }else {
            System.out.print("Qual a porcentagem de aumento? ");
            double porcentagem = sc.nextDouble();
            func.aumentoSalario(porcentagem);
        }

        for (funcionarios fun : list) {
            System.out.println(fun);
        }
    }

    public static boolean hasId(List<funcionarios> list, int id) {
        funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }

}