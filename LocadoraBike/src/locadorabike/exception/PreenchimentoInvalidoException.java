/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.exception;

import javax.swing.JOptionPane;

/**
 *
 * @author Cap
 */
public class PreenchimentoInvalidoException extends Exception{
    
    public PreenchimentoInvalidoException(int i){
        
        System.out.println("Exceção de preenchimento invalido detectado!");
        
        if(i == 1){
            JOptionPane.showMessageDialog(null, "O CPF não deve conter ponto(.) ou traço(-)", "CPF Inválido", 2);
        }
        else if(i == 2){
            JOptionPane.showMessageDialog(null, "O Telefone não deve conter parenteses'( )' ou traço(-)", "Telefone Inválido", 2);
        }
        System.out.println("Mensagem foi exibida ao usuário!");
    }
    
    public PreenchimentoInvalidoException(int i, int x){
        
        System.out.println("Exceção de preenchimento invalido detectado!");
        if(x == 1){
            JOptionPane.showMessageDialog(null, "O nome deve ter no minimo 6 caracteres\n Atualmente esta com: " + i + " Caracteres", "Nome Inválido", 2);
        }
        else if(x == 2){
            JOptionPane.showMessageDialog(null, "O CPF deve conter 11 caracteres\n Atualmente esta com: " + i + " Caracteres", "CPF Inválido", 2);
        }
        else if(x == 3){
            JOptionPane.showMessageDialog(null, "O Telefone deve conter 11 digitos\n Atualmente esta com: " + i + " Digitos", "Telefone Inválido", 2);
        }
        else if(x == 4){
            JOptionPane.showMessageDialog(null, "A senha deve no minimo 8 caracteres\n Atualmente esta com: " + i + " Caracteres", "Senha Inválido", 2);
        }
        System.out.println("Mensagem foi exibida ao usuário!");
    }
    
}
