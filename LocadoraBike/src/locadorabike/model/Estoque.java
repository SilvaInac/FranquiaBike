/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.model;

/**
 *
 * @author Cap
 */
public class Estoque {
    
    private String cnpjFranquia;
    private int id_bike;
    private int id_acessorio;

    public String getCnpjFranquia() {
        return cnpjFranquia;
    }

    public void setCnpjFranquia(String cnpjFranquia) {
        this.cnpjFranquia = cnpjFranquia;
    }

    public int getId_bike() {
        return id_bike;
    }

    public void setId_bike(int id_bike) {
        this.id_bike = id_bike;
    }

    public int getId_acessorio() {
        return id_acessorio;
    }

    public void setId_acessorio(int id_acessorio) {
        this.id_acessorio = id_acessorio;
    }
    
    
    
}
