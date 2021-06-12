/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike;

/**
 *
 * @author Cap
 */

import locadorabike.controller.casdastroDAO;
import locadorabike.model.Franquia;

public class LocadoraBike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Franquia fran1 = new Franquia();
        fran1.cnpj = 123456;
        fran1.nome = "Anchieta";
        fran1.endereco = "Rua alfredo";
        fran1.telefone = 994561257;
        
        casdastroDAO cDAO = new casdastroDAO();
        if(cDAO.inserirFranquia(fran1)){
            System.out.println("Franquia inserida");
        }
        else{
            System.out.println("Não conseguimos inserir");
        }
        
    }
    
}
