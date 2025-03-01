
package faturamento;

import java.util.Scanner;

public class Faturamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Codigo.................: ");
        int c = entrada.nextInt();
        entrada.nextLine(); // Consome a quebra de linha pendente
        
        System.out.print("Descriçao..............: ");
        String d = entrada.nextLine();
        
        System.out.print("Valor Unitario.........: ");
        double v = entrada.nextDouble();
        
        System.out.print("Quantidade Vendida.....: ");
        double q = entrada.nextDouble();
        
        Produto p = new Produto (c,d,v,q);
        System.out.println("Total Vendido........: " + p.calcularTotalVendido());
    }
    
}
