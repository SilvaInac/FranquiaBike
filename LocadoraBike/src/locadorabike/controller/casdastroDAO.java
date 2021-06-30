/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.controller;

import locadorabike.model.Franquia;
import locadorabike.model.Usuario;
import locadorabike.model.Bicicleta;
import locadorabike.model.Acessorio;

import java.sql.SQLException;

/**
 *
 * @author Cap
 */
public class casdastroDAO extends ConnectionDAO{
    boolean sucesso = false;
    
    public boolean inserirFranquia(Franquia fraq) {
        connectToDB();
        String sql = "INSERT INTO Franquia (cnpj, nome, telefone, endereco) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, fraq.getCnpj());
            pst.setString(2, fraq.getNome());
            pst.setLong(3, fraq.getTelefone());
            pst.setString(4, fraq.getEndereco());
            
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
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
    
    public boolean inserirBicibleta(Bicicleta bike) {
        connectToDB();
        String sql = "INSERT INTO Bicicleta (cor, modelo, aro, alocada) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, bike.getCor());
            pst.setString(2, bike.getModelo());
            pst.setInt(3, bike.getAro());
            pst.setBoolean(4, bike.isLocada());
            
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
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
    
    public boolean inserirUsuario(Usuario user) {
        connectToDB();
        String sql = "INSERT INTO Usuario (cpf, telefone, nome, endereco, senha, adm) values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, user.getCpf());
            pst.setLong(2, user.getTelefone());
            pst.setString(3, user.getNome());
            pst.setString(4, user.getEndereco());
            pst.setString(5, user.getSenha());
            pst.setBoolean(6, user.isAdm());
            
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
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
    
    public boolean inserirAcessorio(Acessorio itens) {
        connectToDB();
        String sql = "INSERT INTO Usuario (protecao, corCapacete, tamanhoCapacete) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setBoolean(1, itens.protecao);
            pst.setInt(2, itens.tam_cap);
            pst.setString(3, itens.cor_cap);
            
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
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
