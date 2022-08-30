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
public class Carro {

    String tipo;
    String cor;
    String placa;
    int numPlaca;

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumPlaca() {
        return numPlaca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
   public void setNumPlaca (int numPlaca){
        this.numPlaca=numPlaca;
    }
} 