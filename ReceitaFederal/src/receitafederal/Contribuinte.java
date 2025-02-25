
package receitafederal;

public class Contribuinte {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;
    private double irpf;
    
    // Construtor
    public Contribuinte (String nome, 
                         String cpf, 
                         String endereco,
                         Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }
    
    // Métodos de acesso
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }
    
    public void setSalario (double salario) {
        this.salario = salario;
    }
    
    public String getNome () {
        return nome;
    }
    
    public String getCpf () {
        return cpf;
    }
    
    public String getEndereco () {
        return endereco;
    }
    
    public double getSalario () {
        return salario;
    }
    
    public double getIrpf () {
        return irpf;
    }
    
    // Cálculo do irpf
    public void calcularIrpf () {
        if (salario <= 1058) {
            irpf = 0;
        }
        else if (salario <= 2100) {
            irpf = salario * 0.15;
        }
        else {
            irpf = salario * 0.275;
        }
    }
    

    // Salario liquido
    public double getSalarioLiquido () {
        return salario - irpf;
    }
    
    // Método imprimir
    public void imprimir () {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereco: " + endereco);
        System.out.println("Salario: " + salario);
        System.out.println("IRPF: " + irpf);
        System.out.println("Salario Liquido: " + getSalarioLiquido());
        
    }
    
    
}
