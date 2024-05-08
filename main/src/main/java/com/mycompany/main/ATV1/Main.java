package com.mycompany.main.ATV1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Engenheiro");
        pessoa.exibirInformacoes();
        System.out.println("Número de anos bissextos vividos: " + pessoa.calcularIdadeEmAnosBissextos());
    }
}
