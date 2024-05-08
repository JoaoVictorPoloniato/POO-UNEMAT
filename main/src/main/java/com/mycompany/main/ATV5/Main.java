/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.ATV5;

/**
 *
 * @author polon
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números que deseja inserir
        System.out.print("Quantos números você deseja inserir: ");
        int quantidadeNumeros = scanner.nextInt();

        // Array para armazenar os números inseridos pelo usuário
        double[] numeros = new double[quantidadeNumeros];

        // Loop para receber os números inseridos pelo usuário
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Realiza as operações com base nos números inseridos
        double resultadoSoma = Calculadora.soma(numeros);
        double resultadoSubtracao = Calculadora.subtracao(numeros);
        double resultadoMultiplicacao = Calculadora.multiplicacao(numeros);
        double resultadoDivisao = Calculadora.divisao(numeros);

        // Exibe os resultados das operações
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);

        scanner.close();
    }
}