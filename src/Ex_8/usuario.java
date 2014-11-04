/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_8;

import ListaEncadeada.*;

/**
 *
 * @author Aluno
 */
public class usuario {

    public static void main(String[] args) {
        Estrutura theList = new Estrutura();  // criamos uma nova lista
        
        theList.insertFirst("Palavra 1", "nome1", 10);// inserimos quatro itens nela
        theList.insertFirst("Palavra 2", "nome2", 15);
        theList.insertFirst("Palavra 3", "nome3", 11);
        theList.insertFirst("Palavra 4", "nome4", 13);
        theList.insertFirst("Palavra 5", "nome5", 8);
        theList.insertFirst("Palavra 6", "nome6", 9);
        theList.insertFirst("Palavra 7", "nome7", 19);
        theList.insertFirst("Palavra 8", "nome8", 20);
        theList.insertFirst("Palavra 9", "nome9", 1);

        System.out.println(theList.displayList());              // mostramos a lista
        
        Link search = theList.findNome("nome1");
        if (search != null)
            System.out.println(search.displayLink());
        else
            System.out.println("\nNao encontrado");
        
        search = theList.findNome("nome6");
        if (search != null)
            System.out.println(search.displayLink());
        else
            System.out.println("\nNao encontrado");

        while (!theList.isEmpty()) // until it's empty,
        {
            Link aLink = theList.deleteFirst();   
            System.out.print("Deletado ");         
            System.out.println(aLink.displayLink());                     
            //System.out.println("");
        }
        System.out.println(theList.displayList());
    }
}
