/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seusdados;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class Seusdados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite data de nascimento (DD/MM/AAAA):");
    String aniversario = scanner.nextLine();
    scanner.nextLine(); // Consumir o caractere de nova linha

    System.out.print("Digite seu curso: ");
    String curso = scanner.nextLine();

    System.out.print("Digite seu série: ");
    String serie = scanner.nextLine();
    
    System.out.print("Altura:");
    String altura = scanner.nextLine();
    
    System.out.print("Peso ( em kg):");
    String peso = scanner.nextLine();

    System.out.println("Dados do usuário:");
    System.out.println("Nome: " + nome);
    System.out.println("Data de Nacimento: " + aniversario);
    System.out.println("Curso: " + curso);
    System.out.println("Série: " + serie);
    System.out.println("Altura: " + altura + "m");
    System.out.println("Peso: " + peso + "kg");

    scanner.close();
    }
}
