/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
    
    import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        
        //leitura de texto
        System.out.print("Digite seu nome");
        String nome = scanner.nextLine();
        
        // leitura de número inteiro 
        System.out.print("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Óla,"+" nome"+"!Você tem"+"dade"+" anos ");
        
        scanner.close();
    }
    
}
