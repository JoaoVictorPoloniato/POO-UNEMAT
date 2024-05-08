/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.ATV5;


/**
 *
 * @author polon
 */

public class Calculadora {
    // Método para realizar a soma dos números
    public static double soma(double[] numeros) {
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    // Método para realizar a subtração dos números
    public static double subtracao(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    // Método para realizar a multiplicação dos números
    public static double multiplicacao(double[] numeros) {
        double resultado = 1;
        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    // Método para realizar a divisão dos números
    public static double divisao(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                resultado /= numeros[i];
            } else {
                System.out.println("Erro: divisão por zero.");
                return Double.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero
            }
        }
        return resultado;
    }
}


