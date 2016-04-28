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
public class Gerente extends Funcionario {
    protected int senha;
    protected int numerodeFuncionariosGerenciados;
    
    public void setSenha(int s){
        senha = s;
    }
    
    public void setNumerodeFuncionariosGerenciados(int n){
        numerodeFuncionariosGerenciados = n;
    }
    
    public int getNumerodeFuncionariosGerenciados(){
        return numerodeFuncionariosGerenciados;
    }
    
    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }
        else{
            System.out.println("Acesso negado");
            return false;
        }
    }
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao()+1000;
    }
    
}
