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
public class Barco {
    
    String nome;
    String cor;
    int tamanho;
    int num;
    
    void ImprimeDadosBarco(){
          
    System.out.println("--------------Barco----------------");
     System.out.println ("Nome: "+nome);
    System.out.println("Cor: "+cor);
    System.out.println("Tamanho: "+tamanho);
    System.out.println("Número: "+num);
    }
    
    public String getNome(){
        return nome;
    }
      public String getCor(){
        return cor;
    }  
      public int getTamanho(){
        return tamanho;
    }  
      public int getNum(){
        return num;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
     public void setCor(String cor){
        this.cor=cor;
    }
      public void setTamanho(int tamanho){
        this.tamanho=tamanho;
    }
       public void setNum(int num){
        this.num=num;
    }
}
