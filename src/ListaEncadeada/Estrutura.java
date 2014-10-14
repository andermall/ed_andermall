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
public class Estrutura {

    private Link first;

    public Estrutura() {
        first = null;
    }

    public boolean isEmpty() // se o primeiro (first) nó estiver como NULL
    {                             // estará vazia
        return (first == null);
    }

    public void insertFirst(String palavra, String nome) // insere o primeiro nó
    {
        Link newLink = new Link(palavra, nome);
        newLink.setNext(first);       // colocamos o antigo "primeiro nó" na referência do que esta sendo inserido
        first = newLink;            // e aí colocamos o que esta sendo inserido como o primeiro
    }

    public Link deleteFirst() // removemos o primeiro nó
    {                           // assumimos que a lista não esta vazia!
        Link temp = first;          // o primeiro nó vai p/ variavel temporária
        first = first.getNext();         // o segundo nó se torna o novo primeiro
        return temp;                // retornarmos para classe usuária o item removido
    }

    public void displayList() {
        System.out.print("Lista (primeiro-->último): ");
        Link current = first;       // começamos pelo começo da lista
        while (current != null) // enquanto não chegarmos no item null ...
        {
            current.displayLink();   // mostramos o item
            current = current.getNext();  // movemos a lista para o proximo
        }
        System.out.println("");
    }
    
    public Link findNome(String nome){
        Link current = first;
        while (!current.getNome().equals(nome))
        {
            if (current.getNext() == null)
                return null;
            else
                current = current.getNext();
        }        
        return current;
    }

}
