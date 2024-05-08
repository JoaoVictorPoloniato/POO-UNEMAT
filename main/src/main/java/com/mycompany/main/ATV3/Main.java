/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.ATV3;

/**
 *
 * @author polon
 */
public class Main {
       public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, "joao", 1000.0);
        conta.exibirInformacoes();
        conta.depositar(500.0);
        conta.exibirInformacoes();
        conta.sacar(200.0);
        conta.exibirInformacoes();
    }
}
