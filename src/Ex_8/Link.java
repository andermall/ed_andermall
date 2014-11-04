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
public class Link {

    private String palavra;
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private Link next;

    public Link(String palavra, String nome, int idade) {
        this.palavra = palavra;
        this.nome = nome;
        this.idade = idade;
    }

    public String displayLink() // mostra os valores do proprio nó
    {
        return "Nome: " + nome + " Palavra: " + palavra + " Idade: "+idade;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getNome() {
        return nome;
    }

    public void setNext(Link n) {
        next = n;
    }

    public Link getNext() {
        return next;
    }
}
