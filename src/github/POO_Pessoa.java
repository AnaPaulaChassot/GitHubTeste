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
public class POO_Pessoa {
       public static void main(String[] args) {

    Pessoa novaPessoa = new Pessoa();

    novaPessoa.setNome("Individuo");
    novaPessoa.setCorCabelo ("Preto");
    novaPessoa.setBiotipo("Baixo");
    novaPessoa.setIdade(20);
    
    
    /*System.out.println ("Tipo: "+novaPessoa.getNome());
    System.out.println("Cor: "+novaPessoa.getCorCabelo());
    System.out.println("Placa: "+novaPessoa.getBiotipo());
    System.out.println("Número da placa: "+novaPessoa.getIdade());
*/
    
    novaPessoa.ImprimeDadosPessoa();
    }
    
}
    

