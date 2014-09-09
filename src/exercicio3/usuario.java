/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class usuario {

    public static void main(String[] args) {
        Estrutura ed = new Estrutura(100);
        Scanner scan = new Scanner(System.in);
        
        String cor;
        double altura;

        while (true) {
             menuPrincipal();
             String res = scan.next();
             switch (res){
                 case "1":
                     System.out.println("Digite a cor");
                     cor = scan.next();
                     System.out.println("Digite o tamanho");
                     altura = Double.parseDouble(scan.next());
                     ed.insert(cor, altura);                     
                     break;
                 case "2":
                     menuConsulta();
                     String resC = scan.next();
                     switch (resC){
                         case "1":
                             System.out.println("Digite a cor");
                             cor = scan.next();
                             ed.buscaPorCor(cor);                        
                             break;
                         case "2":
                             System.out.println("Digite o tamanho");
                             altura = Double.parseDouble(scan.next());
                             ed.buscaPorAltura(altura);
                             break;                             
                         case "3":                             
                             ed.displayAll();
                             break;                        
                     }                                     
                     break;
                 default :
                     return;
             }
                 
        }

    }

    private static void menuPrincipal() {
        System.out.println("Menu do sistema");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Consulta");
                
    }
    
    private static void menuConsulta() {
        System.out.println("Menu de Consulta");
        System.out.println("1 - Consulta por cor");
        System.out.println("2 - Consulta por altura");
        System.out.println("3 - Exibir todos");
    }

}
