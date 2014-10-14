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
public class usuario {

    public static void main(String[] args) {
        Estrutura theList = new Estrutura();  // criamos uma nova lista
        
        theList.insertFirst("Palavra 1", "nome1");// inserimos quatro itens nela
        theList.insertFirst("Palavra 2", "nome2");
        theList.insertFirst("Palavra 3", "nome3");
        theList.insertFirst("Palavra 4", "nome4");

        theList.displayList();              // mostramos a lista
        
        Link search = theList.findNome("nome1");
        if (search != null)
            search.displayLink();
        else
            System.out.println("\nNao encontrado");
        
        search = theList.findNome("nome6");
        if (search != null)
            search.displayLink();
        else
            System.out.println("\nNao encontrado");

        while (!theList.isEmpty()) // until it's empty,
        {
            Link aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
            System.out.print("Deletado ");         // 
            aLink.displayLink();                     // mostramos o nó deletado
            System.out.println("");
        }
        theList.displayList();
    }
}
