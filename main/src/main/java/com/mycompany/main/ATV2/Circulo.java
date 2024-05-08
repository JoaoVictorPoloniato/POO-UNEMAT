/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.ATV2;

/**
 *
 * @author polon
 */
public class Circulo {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
    
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void exibirInformacoes() 
    {
        System.out.println("Raio do Circulo: " + raio);
        System.out.println("Area do Circulo: " + calcularArea());
        System.out.println("Perimetro do circulo: " + calcularPerimetro());
 
    }
}
