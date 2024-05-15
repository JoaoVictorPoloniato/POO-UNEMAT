/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Agregacao;

/**
 *
 * @author polon
 */
import java.util.ArrayList;

public class Carrinho
{
    public ArrayList<Produto> Produtos = new ArrayList();
    
    public void Adicionar(Produto produto)
    {
        Produtos.add(produto);
    }
    
    public void Exibir()
    {
        for(Produto p: Produtos)
        {
            System.out.println(p.nome);
        }
    }
}
