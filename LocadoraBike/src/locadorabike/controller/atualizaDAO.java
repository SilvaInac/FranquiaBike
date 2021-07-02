/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.controller;

import java.sql.SQLException;
import locadorabike.model.Usuario;

/**
 *
 * @author Cap
 */
public class atualizaDAO extends ConnectionDAO{
    boolean sucesso = false;
    public boolean atualizarUsuario(long cpf, Usuario user) {
        System.out.println(cpf);
        System.out.println(user.getCpf());
        System.out.println(user.getEndereco());
        System.out.println(user.getNome());
        System.out.println(user.getSenha());
        System.out.println(user.getTelefone());
        connectToDB();
        String sql = "UPDATE Usuario SET telefone=?, nome=?, endereco=?, senha=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, user.getTelefone());
            pst.setString(2, user.getNome());
            pst.setString(3, user.getEndereco());
            pst.setString(4, user.getSenha());
            pst.setLong(5, user.getCpf());
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
}
