package Entitities;

import java.util.Scanner;

public class Alunos {

    public String nomeAluno;
    public double notaTri1, notaTri2, notaTri3;

    public double notaFinal(){
           return (notaTri1 + notaTri2 + notaTri3) / 3;
    }

    public double notaFaltosa() {
        return 6 - notaFinal();
    }

}
