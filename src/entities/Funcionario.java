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
    //construtor padrão vazio.
    public Funcionario() {

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public char getSexo(){
        return sexo;
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
