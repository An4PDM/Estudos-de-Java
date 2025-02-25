
package receitafederal;

public class ReceitaFederal {

    public static void main (String []args) {
        Contribuinte c;
        c = new Contribuinte ("Ana", "123456789-00","Rua 1",5000.0);
        c.calcularIrpf();
        System.out.println("Nome do contribuinte: " + c.getNome()); // Acessando apenas um atributo com get
        System.out.println("Salário Liquido: " + c.getSalarioLiquido());
        System.out.println("Imposto de Renda: " + c.getIrpf());
        c.imprimir();
        
    }
    
}
