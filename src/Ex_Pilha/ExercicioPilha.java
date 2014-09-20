/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex_Pilha;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class ExercicioPilha {

        
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase");
        String palavra = scan.next();
        Estrutura es = new Estrutura(palavra);
        es.invert();
        System.out.println(es.getInvertido());
    }
    
}
