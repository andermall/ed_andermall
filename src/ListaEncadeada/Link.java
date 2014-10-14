/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaEncadeada;

/**
 *
 * @author Aluno
 */
public class Link {
    private String palavra;
    private String nome;
    private Link next;    

    public Link(String palavra, String nome) {
        this.palavra = palavra;
        this.nome = nome;
    }
    
    public void displayLink()      // mostra os valores do proprio nó
      {
      System.out.print("{" + nome + ", " + palavra + "} ");
      }

    public String getPalavra() {
        return palavra;
    }

    public String getNome() {
        return nome;
    }
   
   public void setNext(Link n){
       next = n;
   }
   
   public Link getNext(){
       return next;
   } 
}
