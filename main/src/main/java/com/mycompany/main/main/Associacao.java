/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.main;

/**
 *
 * @author polon
 */
public class Associacao
{
    public static void main(String[] args)
    {
        Cliente c = new Cliente("Joao",1852,"06039241152","poloniato155@gmail.com");
        Conta cc = new Conta(123, "dsdsds", c, 24430);
        
        System.out.println("A conta " + cc.numero + " tem como titular " + cc.Titular.nome);
    }
}
