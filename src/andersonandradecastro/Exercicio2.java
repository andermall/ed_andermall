/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package andersonandradecastro;

import java.util.Scanner;

class EstruturaE2 //Criamos aqui nossa classe EstruturaVetor
{

    private String[] a;                 // cria a referência do vetor
    private int nElems;               // nElems controla quantos elementos o vetor terá ...
    //-----------------------------------------------------------

    public EstruturaE2(int max) // método construtor
    {
        a = new String[max];                 // cria o vetor ...
        nElems = 0;                        // inicialmente sem itens ...
    }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------

    public int find(String searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (upperBound < 0)
            {
                return nElems;
            }
            if (a[curIn].equals(searchKey)) {
                while (true) {
                    if (a[curIn].charAt(0) != searchKey.charAt(0)) {
                        return curIn;              // encontrei!
                    } else {
                        curIn--;
                        if (curIn < 0) {                            
                            return 0;
                        }
                    }
                }
            } else 
            if (lowerBound > upperBound) {
                return nElems;             // não pude encontra-lo
            } else // divide o range
            {
                if (a[curIn].compareTo(searchKey) < 0) {
                    lowerBound = curIn + 1; // esta na metade de cima
                } else {
                    upperBound = curIn - 1; // esta na metade de baixo
                }
                
                if (lowerBound > upperBound)
                    return curIn;
            }  // fim do else de divisão de range
        }  // fim do while
    }  // fim do método de pesquisa binária()
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------

    public void insert(String value) // insere um elemento no vetor
    {
        int nFirstChar, j;

        nFirstChar = find(value);
        j = nFirstChar;
        if (nFirstChar < nElems) {
            for (j = nFirstChar; j < nElems; j++)// localiza onde esse elemento se encaixa
            {
                if (a[j].compareTo(value) > 0) {
                    break;
                }
            }
        }

        for (int k = nElems; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            a[k] = a[k - 1];
        }

        a[j] = value;                  // insere o elemento na posição necessária
        nElems++;                      // incrementa a variavel de controle de tamanho                    // incrementa o tamanho
    }
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------

    public boolean delete(String value) {
        int nFirstChar, j;

        nFirstChar = find(value);
        j = nFirstChar;
        if (nFirstChar < nElems) {
            for (j = nFirstChar; j < nElems; j++)// localiza onde esse elemento se encaixa
            {
                if (a[j].compareTo(value) == 0) {
                    break;
                }
            }
        }

        if (j == nElems) // se não encontrar retorna falso
        {
            return false;
        }            
        for (int k = j; k < nElems; k++) // move os mais altos para "frente"
            {
                a[k] = a[k + 1];
            }
            
        nElems--;                   // decrementa o contador de elementos
        return true;
    }  // final do método de remoção
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------

    public void display() // mostra o conteúdo do vetor
    {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
   //-----------------------------------------------------------

    public boolean displayFirst(String letter) // mostra o conteúdo do vetor
    {
        boolean retorno = false;
        int j = find(letter);
        
        for (j = 0; j < nElems; j++) {
            if (letter.charAt(0) == a[j].charAt(0)) {
                System.out.print(a[j] + " ");
                System.out.println("");
                retorno = true;
            }
        }
        return retorno;
    }
    
    
    public boolean findString(String value) {
        int nFirstChar, j;

        nFirstChar = find(value);
        j = nFirstChar;
        if (nFirstChar < nElems) {
            for (j = nFirstChar; j < nElems; j++)// localiza onde esse elemento se encaixa
            {
                if (a[j].compareTo(value) == 0) {
                    break;
                }
            }
        }

        if (j == nElems) // se não encontrar retorna falso
            return false;
        else// decrementa o contador de elementos
            return true;
    }  // final do método de remoção

}

/**
 *
 * @author aleaguado
 */
public class Exercicio2 {

    public static void main(String[] args) {
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
        EstruturaE2 arr = new EstruturaE2(maxSize); // instancia a estrutura de dados
        Scanner entrada = new Scanner(System.in); //Instancio o objeto entrada do tipo Scanner
        System.out.println("Bem Vindo ao Programa de Vetores!!!");
        for (int i = 1; i < 6; i++) {
            System.out.println("Digite o nome " + i);
            arr.insert(entrada.nextLine());
        }
        

        System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");

        if (!arr.displayFirst(entrada.nextLine())) {
            System.out.println("Não encontrado nenhum nome!!");
        }

        System.out.println("Digite um nome para buscar:");

        if (arr.findString(entrada.nextLine())) {
            System.out.println("Encontrei!!!");
        } else {
            System.out.println("Não encontrado");
        }

        System.out.println("Digite um nome ser removido:");

        if (arr.delete(entrada.nextLine())) {
            System.out.println("Removido!!!");
        } else {
            System.out.println("Não encontrado!!!");
        }

        arr.display();
    }

}
