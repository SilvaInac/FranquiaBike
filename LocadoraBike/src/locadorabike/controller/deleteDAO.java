/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.controller;

import java.sql.SQLException;

/**
 *
 * @author Cap
 */
public class deleteDAO extends ConnectionDAO{
    boolean sucesso = false;
    
    public boolean deletarUser(long cpf) {
        connectToDB();
        String sql = "DELETE FROM usuario where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, cpf);
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
