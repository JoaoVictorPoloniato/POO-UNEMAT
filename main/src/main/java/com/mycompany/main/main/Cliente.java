/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.main;

/**
 *
 * @author polon
 */
public class Cliente
{
    public int id;
    public String nome;
    public String cpf;
    public int Anonascimento;
    public String email;
    
    public Cliente(String nome, int anonascimento, String CPF, String Email)
    {
        id++;
        this.nome = nome;
        anonascimento = Anonascimento;
        cpf = CPF;
        email = Email;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getAnonascimento()
    {
        return Anonascimento;
    }
    
    public String getCPF()
    {
        return cpf;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setAnonascimento(int Anonascimento)
    {
        this.Anonascimento = Anonascimento;
    }
    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
                
    
    
}
