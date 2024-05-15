/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Agregacao;

/**
 *
 * @author polon
 */
public class Agregacao
{
    public static void main(String[] args)
    {
        Produto p = new Produto("Martelo", 10.45);
        Produto p1 = new Produto("Cerrote", 15.00);
        Carrinho c = new Carrinho();
        
        c.Adicionar(p);
        c.Adicionar(p1);
        c.Exibir();
    }
   
}
