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
    int senha;
    int numerodeFuncionariosGerenciados;
    
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
    
}
