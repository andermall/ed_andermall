/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExercicioAvancado;

/**
 *
 * @author Aluno
 */
public class Usuario {
    
    public static void main(String[] args) {
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
        Estrutura estrutura = new Estrutura(maxSize);
        
        estrutura.insert("anderson", 20, 1.8);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("andrade", 24, 1.7);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("klayton", 23, 1.6);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("jonatas", 25, 1.9);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("moises", 22, 2.0);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("fabio", 18, 2.1);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("roberto", 19, 2.2);
        estrutura.display();
        System.out.println("===========");
        estrutura.insert("everton", 21, 2.3);
        estrutura.display();
        System.out.println("===========");
        
    }
    
}
