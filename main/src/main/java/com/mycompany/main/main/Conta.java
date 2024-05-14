package com.mycompany.main.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author polon
 */
public class Conta 
{
    public int numero;
    public String Agencia;
    public Cliente Titular;
    public double Saldo;
    
    public Conta(int numero, String agencia, Cliente titular, double saldo)
    {
        this.numero = numero;
        Agencia = agencia;
        Titular = titular;
        Saldo = saldo;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    public String getAgencia()
    {
        return Agencia;
    }
    
    public void setAgencia(String Agencia)
    {
        this.Agencia = Agencia;
    }
    
    public Cliente getTitular()
    {
        return Titular;
    }
    
    public void setTitular(Cliente Titular)
    {
        this.Titular = Titular;
    }
    
    public double getSaldo()
    {
        return Saldo;
    }
    
    public void setSaldo(double saldo)
    {
        this.Saldo = saldo;
    }
}
