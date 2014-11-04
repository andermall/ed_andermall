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
public class Estrutura {

    private Link first;

    public Estrutura() {
        first = null;
    }

    public boolean isEmpty() // se o primeiro (first) nó estiver como NULL
    {                             // estará vazia
        return (first == null);
    }

    public void insertFirst(String palavra, String nome, int Idade) // insere o primeiro nó
    {
        Link newLink = new Link(palavra, nome, Idade);
        Link preLink = null;
        Link current = first;
        while (current != null && current.getIdade() < Idade) {
            preLink = current;
            current = current.getNext();
        }

        if (preLink == null) {
            first = newLink;
        } else {
            preLink.setNext(newLink);
        }
        newLink.setNext(current);
    }

    public Link deleteFirst() // removemos o primeiro nó
    {                           // assumimos que a lista não esta vazia!
        Link temp = first;          // o primeiro nó vai p/ variavel temporária
        first = first.getNext();         // o segundo nó se torna o novo primeiro
        return temp;                // retornarmos para classe usuária o item removido
    }

    public String displayList() {
        String retorno = "Lista (primeiro-->último): ";
        Link current = first;       // começamos pelo começo da lista
        while (current != null) // enquanto não chegarmos no item null ...
        {
            retorno = retorno + "\n" + current.displayLink();   // mostramos o item
            current = current.getNext();  // movemos a lista para o proximo
        }
        return retorno;
    }

    public Link findNome(String nome) {
        Link current = first;
        while (!current.getNome().equals(nome)) {
            if (current.getNext() == null) {
                return null;
            } else {
                current = current.getNext();
            }
        }
        return current;
    }

    public Link findIdade(int idade) {
        Link current = first;
        while (current.getIdade() != idade) {
            if (current.getNext() == null) {
                return null;
            } else {
                current = current.getNext();
            }
        }
        return current;
    }
/*
    public Link findIdadeBuscaBinaria(int idade) {

        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].getTamanho() == searchKey) //mudamos aqui para comparar Tamanho
            {            //Se encontrou, ele irá rodar pra cima e pra baixo, imprimindo os valores
                for (int i = curIn; (a[i].getTamanho() == searchKey); i++) { //mudado p/exercicio
                    a[i].displayDino();//mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                    //Se encontrar na última vamor dar um break
                    if (i == (nElems - 1)) {
                        break;
                    }
                }

                //Testa se foi encontrado na posição zero, entao não anda mais pra baixo
                if (curIn == 0) {
                    return true;
                }

                for (int j = curIn - 1; (a[j].getTamanho() == searchKey); j--) {
                    a[j].displayDino();//mudado p/ imprimir todos os dados do dino
                    System.out.println("==============================================");
                    //Se encontrar na última vamor dar um break
                    if (j == 0) {
                        break;
                    }
                }

                return true;
            } // encontrei!
            else if (lowerBound > upperBound) {
                return false;             // não pude encontra-lo
            } else // divide o range
            {
        //O metodo compareTo do tipo String, retorna positivo se a primeira
                //String for maior que a segunda e negativo se for o contrário
                if (a[curIn].getTamanho() < searchKey) //mudamos aqui para comparar nome
                {
                    lowerBound = curIn + 1; // esta na metade de cima
                } else {
                    upperBound = curIn - 1; // esta na metade de baixo
                }
            }  // fim do else de divisão de range
        }  // fim do while
    }  // fim do método de pesquisa binária()  */
}
