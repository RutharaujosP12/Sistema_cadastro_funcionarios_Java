package entities;

public class Funcionario {

    private String nome;
    private char sexo;
    private String nivel;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setNivel(String nivel) {
        this.nivel = nivel;
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
