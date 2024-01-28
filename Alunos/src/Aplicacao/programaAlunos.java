package Aplicacao;

import Entitities.Alunos;

import java.util.Scanner;

public class programaAlunos {

    public static void main(String[] Args) {
        /* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano.
        Ao final, mostrar qual a nota final do aluno no
        ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        para o aluno obter o mínimo para ser aprovado. Você deve criar uma classe Student para
        resolver este problema. */

        Scanner sc = new Scanner(System.in);
        Alunos aluno = new Alunos();

        System.out.print("Nome do Aluno: ");
        aluno.nomeAluno = sc.nextLine();
        System.out.print("Digite as 3 notas do aluno (de 0 à 10): ");
        aluno.notaTri1 = sc.nextDouble();
        aluno.notaTri2 = sc.nextDouble();
        aluno.notaTri3 = sc.nextDouble();
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Nota final: " + aluno.notaFinal());

        if (aluno.notaFinal() < 6 ) {
            System.out.println("Reprovado");
            System.out.println("Faltaram " + aluno.notaFaltosa() + " pontos para você passar");
        } else {
            System.out.println("Parabéns, você foi aprovado");
        }


        sc.close();

    }
}