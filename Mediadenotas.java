/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediadenotas;

/**
 *
 * @author FATEC ZONA LESTE
 */
   import java.util.Scanner;
public class Mediadenotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // escolha os numeros
        double nota1, nota2, nota3, nota4;
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.print("Insira a nota1: ");
        System.out.print("Insira a nota2:");
        System.out.print("Insira a nota3: ");
        System.out.print("Insira a nota4");
        
        System.out.println("Média:" + media);
        scanner.close();       
    }  
}
