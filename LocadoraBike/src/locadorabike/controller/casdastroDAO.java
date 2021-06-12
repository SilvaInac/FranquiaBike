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
import java.util.ArrayList;

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
            pst.setInt(1, fraq.cnpj);
            pst.setString(2, fraq.nome);
            pst.setInt(3, fraq.telefone);
            pst.setString(4, fraq.endereco);
            
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
            pst.setString(1, bike.cor);
            pst.setString(2, bike.modelo);
            pst.setInt(3, bike.aro);
            pst.setBoolean(4, bike.locada);
            
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
        String sql = "INSERT INTO Usuario (cpf, telefone, nome, endereco, senha) values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, bike.cor);
            pst.setString(2, bike.modelo);
            pst.setInt(3, bike.aro);
            pst.setBoolean(4, bike.locada);
            
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
