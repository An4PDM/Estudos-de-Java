
package receitafederal;

public class ReceitaFederal {

    public static void main (String []args) {
        Contribuinte c;
        c = new Contribuinte ("Ana", "123456789-00","Rua 1",1500.0);
        c.calcularIrpf();
        c.imprimir();
        System.out.println("Nome do contribuinte: " + c.getNome()); // Acessando apenas um atributo com get
        
    }
    
}
