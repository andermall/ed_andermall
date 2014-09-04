/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAvancado;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuario {

    public static void main(String[] args) {
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
        Estrutura estrutura = new Estrutura(maxSize);
        Scanner scanner = new Scanner(System.in);
        estrutura.insert("anderson", 20, 1.8);
        estrutura.insert("andrade", 24, 1.7);
        estrutura.insert("klayton", 23, 1.6);
        estrutura.insert("jonatas", 25, 1.9);
        estrutura.insert("moises", 22, 2.0);
        estrutura.insert("fabio", 18, 2.1);
        estrutura.insert("roberto", 19, 2.2);
        estrutura.insert("everton", 21, 2.3);
        estrutura.display();

        System.out.println("\nDigite uma idade para pesquisar: ");
        int idade = Integer.parseInt(scanner.nextLine());
        int posicao = estrutura.findByIdade(idade);
        if (posicao == estrutura.size()) {
            System.out.println("Ninguém possuí essa idade!");
        } else {
            estrutura.DisplayByPosition(posicao);
        }

        System.out.println("Digite um nome para pesquisar: ");
        String nome = scanner.nextLine();
        estrutura.DisplayByName(nome);
        
        System.out.println("Digte um nome para deletar");
        nome = scanner.nextLine();
        if (!estrutura.delete(nome)) {
            System.out.println("Não encontrado");
        } else {
            System.out.println("Deletado!");
        }        
        estrutura.display();
    }
}
