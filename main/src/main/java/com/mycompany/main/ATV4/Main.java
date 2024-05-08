/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.ATV4;

/**
 *
 * @author polon
 */
public class Main {
    public static void main(String[] args) {
        // Criando um triângulo com lados 3, 4 e 5
        Triangulo triangulo = new Triangulo(3, 4, 5);
        
        // Verificando se é um triângulo válido e calculando a área
        if (triangulo.verificarTrianguloValido()) {
            double area = triangulo.calcularArea();
            System.out.println("É um triângulo válido.");
            System.out.println("Área do triângulo: " + area);
        } else {
            System.out.println("Não é um triângulo válido.");
        }
    }
}
