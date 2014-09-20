/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_Pilha;

/**
 *
 * @author Anderson
 */
public class Estrutura {

    private String input;                   // input vai guardar a string que virá da classe usuária
    Pilha aPilha;  // cria objeto pilha com tamanho da expressão
//--------------------------------------------------------------

    public Estrutura(String in) // nosso método construtor
    {
        input = in;
        int tamanhoPilha = input.length();
        aPilha = new Pilha(tamanhoPilha);
        
    }                           //guarda em input o que vem via parametro da classe usuária
//--------------------------------------------------------------

    public void invert() {
              // pega o tamanho maximo da pilha, que será a qty de caracteres da entrada
        

        for (int j = 0; j < input.length(); j++) // esse for girará para cada caracterer!!!
        {
            aPilha.inserir(input.charAt(j));          // ...nós inserimos ele na pilha!!!
        }  // fim do for
    }  // fim invert()
    
    
    public String getInvertido(){
        String res = "";
        while (!aPilha.estaVazio())
        {
            res = res + aPilha.remove();
        }
        return res;
    }
    

}
