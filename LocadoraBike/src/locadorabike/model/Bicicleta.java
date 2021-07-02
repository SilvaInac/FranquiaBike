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
public class Bicicleta {
    
    private int id_bike;
    private String cor;
    private String modelo;
    private int aro;// 26/29
    private boolean locada;

    public int getId_bike() {
        return id_bike;
    }

    public void setId_bike(int id_bike) {
        this.id_bike = id_bike;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public boolean isLocada() {
        return locada;
    }

    public void setLocada(boolean locada) {
        this.locada = locada;
    }

    @Override
    public String toString() {
        return "Bike " + Integer.toString(getId_bike());
    }
    
    
}
