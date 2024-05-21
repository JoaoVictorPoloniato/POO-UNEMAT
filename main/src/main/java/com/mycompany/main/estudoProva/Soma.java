/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.estudoProva;

/**
 *
 * @author polon
 */
public class Soma extends OperacaoMatematica{
    @Override
    public void calcular(double a, double b){
        double resultado = a + b;
        System.out.println(resultado);
    }
}
