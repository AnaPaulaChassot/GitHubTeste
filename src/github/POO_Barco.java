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
public class POO_Barco {
      public static void main(String[] args) {
        
    

    Barco meuBarco = new Barco();

    meuBarco.setNome ("Ventania");
    meuBarco.setCor ("Branco");
    meuBarco.setTamanho(9);
    meuBarco.setNum(1234);
    
    meuBarco.ImprimeDadosBarco();
      }
}
