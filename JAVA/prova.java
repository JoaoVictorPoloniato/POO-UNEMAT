// QUESTAO1
// RESPOSTA LETRA E (É UMA herança dos objestos reais existentes. sao instancias de classes que pertencem em memoria e mantem os seus valores de mariera individual

// QUESTAO 2
// RESPOSTA LETRA B ( V V F)

// QUESTAO 3
// RESPOSTA LETRA D (Na reutilização de codigo e modularidade)

// QUESTAO 4 
// RESPOTA LETRA B 

// QUESTAO 5 
// RESPOSTA 

public class Calcular
{
    public int Somar(int a, int b)
    {
        return a + b;
    }

    public double Somar(double a, double b)
    {
        return a + b;
    }
}

//SOBRE CARGA


public class Animal
{
    public void Som()
    {
        system.out.println("SOM");
    }
}

public class Dog extends Animal
{
    @Override
    public void Som()
    {
        system.out.println("Au au");
    }
}

//sobreescrita

// Questao 6

public class Pessoa
{
    private String nome;

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }
}

public class PF extends Pessoa
{
    private String RG;

    public void setRG(String RG)
    {
        this.RG = RG;
    }

    public String getRG()
    {
        return RG;
    }
}

public class PJ extends Pessoa
{
    private String CNPJ;

    public void setCNPJ(String CNPJ)
    {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ()
    {
        return CNPJ;
    }
}

public class Funcionario extends PF
{
    private String cartao;

    public void setCartao(String cartao)
    {
        this.cartao = cartao;
    }

    public String getCartao()
    {
        return cartao;
    }
}

//QUESTAO 7
//RESPOSTA

public class Main
{
    public static void main(String[] args)
    {
        Pessoa P = new Pessoa();
        Pessoa PJ = new PJ();
        Pessoa PF = new PF();
        Pessoa F = new Funcionario();

        Pessoa.P("João");
        Pessoa.PJ("06039241152");
        Pessoa.PF("54545454");
        Pessoa.F("8787878");

        system.out.println("NOME: " + Pessoa.getNome());
        system.out.println("CNPJ: " + Pessoa.getCNPJ());
        system.out.println("RG: " + Pessoa.getRG());
        system.out.println("Cartao: " + Pessoa.getCartao());
    }
}