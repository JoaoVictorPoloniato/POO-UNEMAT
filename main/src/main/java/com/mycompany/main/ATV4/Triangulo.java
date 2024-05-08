/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.ATV4;

/**
 *
 * @author polon
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean verificarTrianguloValido() {
        // Verifica se a soma de dois lados é maior que o terceiro lado para cada combinação de lados
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public double calcularArea() {
        // Utiliza a fórmula de Heron para calcular a área de um triângulo
        double s = (lado1 + lado2 + lado3) / 2; // Semi-perímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // Getters e setters para os atributos dos lados, se necessário
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
