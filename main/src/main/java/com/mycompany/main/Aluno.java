/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author polon
 */
public class Aluno extends Pessoa
{
    protected String RA; 
    
    public Aluno(String nome, String cpf, String RA)
    {
        super(nome, cpf);
        this.RA = RA;
    }
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("RA: " + RA);
    }
}