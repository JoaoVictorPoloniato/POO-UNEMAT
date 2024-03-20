public class Pessoa {
    public String nome;
    private int idade;
    
    // Método setter para o nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Construtor padrão
    public Pessoa() {
        nome = "João";
        idade = 21;
    }
    
    // Construtor com parâmetros
    public Pessoa(String A, int B) {
        nome = A;
        idade = B;
    }
}

public class PF extends Pessoa {
    private String CPF;
    
    public setCPF(String CPF){
        this.CPF = CPF;
    }
    public setCPF(){
        return CPF;
    }
}

public class PJ extends Pessoa {
    private String CNPJ;
    
    public setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }
    public setCNPJ(){
        return CNPJ;
    }
}


public operacao ( int A, int B){
    return A + B;
}

public operacao (int A, int B){
    return A * B;
}