
package entities;

import java.util.Random;

public class Funcionario {

    private int id;
    private String nome;
    private char sexo;
    private String nivel;
    private double salario;

    //construtor para criar o ID automaticamente
    public Funcionario() {
        Random idFuncionario = new Random();
        this.id = idFuncionario.nextInt(9000) + 1000; // Gera ID entre 1000 e 9999
    }



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
        return "Funcionário(a):" +
                id + ","
                +nome + ","
                + " Sexo:" + sexo + " ,"
                + " Nível:" + nivel + " ,"
                + " Salário: R$" + String.format("%.2f", salario);
    }
}
