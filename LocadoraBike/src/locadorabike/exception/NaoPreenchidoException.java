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
public class NaoPreenchidoException extends Exception{
    
    public NaoPreenchidoException(){
        
        System.out.println("Exceção de campos vazios detectado!");
        JOptionPane.showMessageDialog(null, "!!Há campos vazios!!", "Campo Vazios", 2);
        System.out.println("Mensagem foi exibida ao usuário!");
        
    }
    
}
