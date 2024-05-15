/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Agregacao;

/**
 *
 * @author polon
 */
public class Produto
{
   public String nome;
   public double valor;
   
   public Produto(String nome, double valor)
   {
       this.nome = nome;
       this.valor = valor;
   }
   
   public String getNome()
   {
      return nome; 
   }
   
   public double getValor()
   {
       return valor;
   }
   
   public void setNome(String nome)
   {
       this.nome = nome;
   }
   
   public void setValor(double valor)
   {
       this.valor = valor;
   }
}
