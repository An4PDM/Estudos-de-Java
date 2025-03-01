package faturamento;


public class Produto {
    private int codigo;
    private String descricao;
    private double valorunitario;
    private double quantidadevendida;
    
    
    // Métodos construtor
    public Produto (int codigo, String descricao, double valorunitario, double quantidadevendida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorunitario = valorunitario;
        this.quantidadevendida = quantidadevendida;
    }
    
    // Setters e getters
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public void setValorunitario (double valorunitario) {
        this.valorunitario = valorunitario;
    }
    
    public void setQuantidadevendida (double quantidadevendida) {
        this.quantidadevendida = quantidadevendida;
    }
    
    public int getCodigo () {
        return codigo;
    }
    
    public String getDescricao () {
        return descricao;
    }
    
    public double getValorunitario () {
        return valorunitario;
    }
    
    public double getQuantidadevendida () {
        return quantidadevendida;
    }
    
    // Calculando o total de vendas
    public double calcularTotalVendido () {
        return quantidadevendida * valorunitario;
    }
      
    
}
