/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.estudoProva;

/**
 *
 * @author polon
 */
public abstract class Funcionario {
    private String nome;
    private double salario;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public abstract void aumentarSalario();
}
