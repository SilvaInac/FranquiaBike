/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import locadorabike.model.Bicicleta;
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
                if(aux.isEmpty()){
                    sucesso = false;
                } else {
                    userAux = new Usuario();
                    userAux.setNome(rs.getString("nome"));
                    userAux.setEndereco(rs.getString("endereco"));
                    userAux.setCpf(rs.getLong("cpf"));
                    userAux.setTelefone(rs.getLong("telefone"));
                    userAux.setSenha(rs.getString("senha"));
                    userAux.setAdm(rs.getBoolean("adm"));
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
    
    public ArrayList<Bicicleta> buscarBicicletaSemFiltro() {
        ArrayList<Bicicleta> listaDeBike = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Pessoa";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Pessoas: ");
            while (rs.next()) {
                Bicicleta bikeAux = new Bicicleta();
                bikeAux.id_bike = rs.getInt("id");
                bikeAux.modelo = rs.getString("modelo");
                bikeAux.id_bike = rs.getInt("aro");
                bikeAux.locada = rs.getBoolean("alocada");
                
                listaDeBike.add(bikeAux);
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeBike;
    }
}
