
package javaapplication1;

import  java.util.Scanner;
public class exercicio8 {
    
    public static void exercicio8(String []args){
    //sistema de promoçao de loja com multiplas regras
    
    Scanner read = new Scanner(System.in);
    
    double valorCompra;
    int cliente, pagForma;
    
    System.out.println("Digite o valor da sua compra: ");
    valorCompra = read.nextInt();
    
       System.out.println("Cliente VIP 1-sim ou 2-nao ");
    cliente = read.nextInt();
    
       System.out.println("Pagamento 1-A vista ou 2-Parcelado:");
    pagForma = read.nextInt();
    
        if (cliente == 2 && valorCompra < 500) {
             System.out.println("Sem desconto disponivel");
        }
        if (cliente == 1 &&  pagForma == 1) {
            valorCompra = valorCompra-(valorCompra * 20/100);
             System.out.println("20% de desconto valor da compra total:" + valorCompra);
        }
        if(cliente == 1 &&  pagForma == 2) {
                valorCompra = valorCompra-(valorCompra * 10/100);
             System.out.println("10% de desconto valor da compra total:" + valorCompra);
        }
        if ( cliente == 2 && pagForma == 1) {
                valorCompra = valorCompra-(valorCompra * 15/100);
             System.out.println("15% de desconto valor da compra total:" + valorCompra +" Vire vip para aumentar seu desconto.");
        }
        if (cliente == 2 && pagForma == 2) {
                valorCompra = valorCompra-(valorCompra * 5/100);
             System.out.println("5% de desconto valor da compra total:" + valorCompra +" Vire vip para aumentar seu desconto.");
        }
    
    
    
    
    }
    
}
