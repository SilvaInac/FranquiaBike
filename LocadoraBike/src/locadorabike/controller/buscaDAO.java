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
public class buscaDAO extends ConnectionDAO{    
    boolean sucesso = false;
    
    //bucando o usuario pelo CPF
    public Usuario buscarUsuarioPorCPF(long cpf) {
        
        connectToDB();
        Usuario userAux = null;
        String sql = "SELECT * FROM Usuario WHERE cpf = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("nome");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    userAux = new Usuario();
                    userAux.setNome(rs.getString("nome"));
                    userAux.setEndereco(rs.getString("endereco"));
                    userAux.setCpf(rs.getLong("cpf"));
                    userAux.setTelefone(rs.getLong("telefone"));
                    userAux.setSenha(rs.getString("senha"));
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return userAux;
    }
    
}
