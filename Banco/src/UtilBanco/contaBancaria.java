package UtilBanco;

public class contaBancaria {

    private int numCont;
    private double saq_depConta;
    private double valorEmConta;
    private String nomeCont;

    public contaBancaria() {

    }


    public contaBancaria(int numCont, double depositoCont, String nomeCont) {
        this.numCont = numCont;
        this.saq_depConta = depositoCont;
        this.nomeCont = nomeCont;
    }


    public int getNumCont() {
        return numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }


    public void setValorEmConta(double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }

    public double getSaq_depConta() {
        return saq_depConta;
    }

    public void setSaq_depConta(double saq_depConta) {
        this.saq_depConta = saq_depConta;
    }

    public String getNomeCont() {
        return nomeCont;
    }

    public void setNomeCont(String nomeCont) {
        this.nomeCont = nomeCont;
    }

    public double valorEmConta() {
        return valorEmConta + saq_depConta;
    }

    public void saqueConta(double saq_depConta) {
        this.saq_depConta -= saq_depConta;
    }

    public void depositoConta(double saq_depConta) {
        this.saq_depConta += saq_depConta;
    }

    public String toString(){
        return "Nome do Titular: "
                + nomeCont
                + ", número da conta: "
                + numCont
                + ", valor em conta: R$"
                + String.format("%.2f",valorEmConta());
    }
}
