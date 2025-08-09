/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromagico;

/**
 *
 * @author Gomes
 */
import javax.swing.JOptionPane;
public class NumeroMagico {

    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null, "🔮 Descubra os segredos do Número Mágico!");
        int numeroMagico = 10;

        String entrada = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(entrada);

        String mensagem = "";

        // == Igual
        if (numero == numeroMagico) {
            mensagem += "O número é exatamente o Número Mágico!\n";
        }

        // > Maior
        if (numero > numeroMagico) {
            mensagem += "Seu número é maior que o Número Mágico.\n";
        } else {
            mensagem += "Seu numero é igual o Número mágico ./n";
        }

        // < Menor
        if (numero < numeroMagico) {
            mensagem += "Seu número é menor que o Número Mágico.\n";
        } else {
            mensagem += "Seu numero é igual o Número mágico ./n";
        }

        // != Diferente
        if (numero != numeroMagico) {
            mensagem += "Não é o Número Mágico!\n";
        }

        // >= Maior ou igual
        if (numero >= 15) {
            mensagem += "Está muito acima do Número Mágico!\n";
        }

        // <= Menor ou igual
        if (numero <= 5) {
            mensagem += "Está muito abaixo do Número Mágico!\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
