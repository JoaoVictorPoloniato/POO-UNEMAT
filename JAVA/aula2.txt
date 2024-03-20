CLASSES

Conceito é um molde, um model, um prototipo a partir do qual os obejtos podem ser criados.
public class Sala { // indentificador da classe na linguagem java

}

exemplo
public class Projeto {
    public static void main(string[], args){
        System.out.println("Apenas um teste");
    }
}

exemplo 2

public class Sala {

    public String nome;
    public int tamanho;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public String getNome () {
        return nome;
    }

    public int getTamanho () {
        return tamanho;
    }
}

------------------

Sintaxe
-Qualificador class nome_da_classe {
    //Atributos
    //Métodos
}

QUALIFICADOR - indica como a classe pode ser usada por outras classes, isto é, define a sua visibilidade.
°Visibilidade (public e private)
public usada por qualquer outro objeto da classe.
private nao é mais visivel e so pode ser usada por ela mesma e por mais ninguem.

O nome da classe deve sempre iniciar com letras maisculas Ex. Menu, NumberFormat, Exception

Classes contem
Atributos - determinam o estado do obejeto por exemplo, String cor, String nome, float peso, float altura etc.

Métodos - são utilizados para manipular os atributos. Por exemplo setNome(String nome), setCor(String cor), 
getPeso(float peso), getAltura(float altura) etc

public class Televisor {
    public int volume;
    public int canal;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int c) {
        canal = c;
    } 

    public void mostrar() {
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
}

-------------------------------------------------------------------

Obejetos
Conceito -  é uma abstração dos objetos reais existentes;
Os oobjetos sao instancias de classes que pertencem em memória e mantem os seus valores de maneira individual.
    Ex. Aluno, Cadeira, Mesa, Quadro.

l