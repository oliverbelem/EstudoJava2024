package Util;

public class alunos {
    private String nome;
    private double Nota1;
    private double Nota2;

    public alunos(String nome, double nota1, double nota2) {
        this.nome = nome;
        Nota1 = nota1;
        Nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        Nota2 = nota2;
    }
}
