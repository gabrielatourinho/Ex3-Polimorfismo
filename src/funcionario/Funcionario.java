/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author Gabriela
 */
public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;
    
    public void setNome(String a){
        nome = a;
    }
    
    public void setCPF(String n){
        cpf = n;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public double getBonificacao(){
        return salario*0.1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
