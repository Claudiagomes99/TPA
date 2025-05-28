/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int numero = scanner.nextInt();

    System.out.println("Tabuada do " + numero + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }

    scanner.close();
    }
}
