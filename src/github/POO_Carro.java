/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author Suporte
 */
public class POO_Carro {
    public static void main(String[] args) {
        
    

    Carro meuCarro = new Carro();

    meuCarro.setTipo ("Gol");
    meuCarro.setCor ("Preto");
    meuCarro.setPlaca("ABC");
    meuCarro.setNumPlaca(1234);
    
    
    System.out.println ("Tipo: "+meuCarro.getTipo());
    System.out.println("Cor: "+meuCarro.getCor());
    System.out.println("Placa: "+meuCarro.getPlaca());
    System.out.println("Número da placa: "+meuCarro.getNumPlaca());
    }
    
}
