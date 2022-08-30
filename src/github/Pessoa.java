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
public class Pessoa {
    
    String nome;
    String corCabelo;
    String biotipo;
    int idade;
    
    public String getNome(){
        return nome;
    }
    
    public String getCorCabelo(){
        return corCabelo;
    }
    
    public String getBiotipo(){
        return biotipo;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCorCabelo(String corCabelo){
        this.corCabelo=corCabelo;
    }
    
    public void setBiotipo (String biotipo){
        this.biotipo=biotipo;
    }
    public void setIdade (int idade){
        this.idade=idade;
    }
}
