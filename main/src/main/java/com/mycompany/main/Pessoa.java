/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author polon
 */
public class Pessoa
{
    protected String nome;
    protected String cpf;
    
    public Pessoa(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void imprimir()
    {
       System.out.println("Nome: " + nome +"CPF: " + cpf);
    }
}