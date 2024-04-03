// polimorfismo um exemplo pratico seria a classe animal atributo som (TODO ANIMAL EMITE UM SOM), as classes filhos tbm emitem
// porem sons diferente entao todas tem o atributo SOM porem com saidas diferentes.

//formas do polimorfismo

// SOBRESCRITA (OVERRIDING): mesma função mas comportamentos diferentes

// SOBRECARGA (OVERLOADING): nome de uma função usado mais de uma vez com diferentes tipos de parametros 


// exemplo SOBRESCRITA
public class Brinquedo {    // classe pai metodo construto
    public Brinquedo() {
    }
    public void mover(){
        System.out.println("Mover brinquedo");
    }
}

public class Aviao extends Brinquedo{  // classe filha herdando de brinquedo metodo construtor
    public Aviao(){
    }
    public void mover(){
        System.out.println("voar");
    }
}

public class Barco extends Brinquedo {   // classe filha herdando de brinquedo metodo construtor
    public Barco() {
    }

    public void mover() {
        System.out.println("NAVEGAR");
    }
}

public class Carro extends Brinquedo {   // classe filha herdando de brinquedo metodo construtor
    public Carro(){
    }

    public void mover() {
        System.out.printl("CORRER");
    }
}

---------------------------------------------------------------------------------------------------------

// exemplo SOBRECARGA

package Polimorfismo;

public class Funcoes {
    public Funcoes() {

    }

    float area (float ladoQuadrado){
        return (ladoQuadrado * ladoQuadrado);
    }

    float area (float alturaRetangulo, float larguraRetangulo) {
        return (alturaRetangulo * larguraRetangulo);
    }
}

-----------------------------------------------------------------------------------------------------------

public class Pessoa {
    private String rg;
    private String nome;

    public Pessoa() {

    }

    public Pessoa(String rg, String nome){
        this.rg = rg;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("878794948", "Joao");

        System.out.println("RG: " + p.getRg() + " e nome: " + p.getNome());
        System.out.println("RG: " + p2.getRg() + " e nome: " + p2.getNome());
    }
}
-------------------------



public class Calculo {

    public int Operacao(int a, int b){
        return a + b;
    }
}

//outro codigo

public class Sub extends Calculo {

    @Override
    public int Operacao(int a, int b) {
        return a - b;
    }
}

//outro codigo

public class Mult extends Calculo {

    @Override
    public int Operacao(int a, int b){
        return a * b;
    }
}

// codigo da main

public class Main {
    
    public static void main(String[] args){

        Sub subtracao = new Sub();
        System.out.println("O resultado eh" + subtracao.Operacao(6, 4));

    }
}