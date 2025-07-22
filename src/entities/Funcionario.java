package entities;

public class Funcionario {

    private String nome;
    private char sexo;
    private String nivel;
    private double salario;

    //criação de construtor para o objeto do tipo funcionário receber dados
    public Funcionario(String nome, char sexo,String nivel, double salario ) {
        this.nome = nome;
        this.sexo = sexo;
        this.nivel = nivel;
        this.salario= salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário(a):"+
                nome + ","
                + " Sexo:" + sexo + " ,"
                + " Nível:" + nivel + " ,"
                + " Salário: R$" + String.format("%.2f", salario);
    }
}
