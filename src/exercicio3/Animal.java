/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio3;

/**
 *
 * @author Aluno
 */
public class Animal {
    
    private String Cor;

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public Animal(String Cor, double altura) {
        this.Cor = Cor;
        this.altura = altura;
    }

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Display(){
        System.out.println("Cor: "+Cor + " - Altura: "+altura);
    }
}
