package com.mycompany.main.ATV1;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int calcularIdadeEmAnosBissextos() {
        int anosBissextos = 0;
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);

        for (int ano = anoAtual - idade; ano <= anoAtual; ano++) {
            if (ehAnoBissexto(ano)) {
                anosBissextos++;
            }
        }

        return anosBissextos;
    }

    private boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }
}
