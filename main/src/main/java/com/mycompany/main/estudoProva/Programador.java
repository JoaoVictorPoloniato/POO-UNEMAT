/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.estudoProva;

/**
 *
 * @author polon
 */
public class Programador extends Funcionario {
    @Override
    public void aumentarSalario(){
        double novoSalario = getSalario() * 1.05;
        setSalario(novoSalario);
    }
}
