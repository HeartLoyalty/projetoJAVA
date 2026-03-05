
package javaapplication1;
import java.util.Scanner;
public class Exercicio4 {
    public static void exercicio4(){
        Scanner read = new Scanner(System.in);
        
        /*
        4. Sistema de Pedágio
Implemente um programa que calcule o valor do pedágio 
a ser pago de acordo com o tipo de veículo e a quantidade de eixos:
Carro de passeio → R$ 10,00 fixo
Caminhonete → R$ 15,00 fixo
Ônibus → R$ 5,00 por eixo
Caminhão → R$ 8,00 por eixo
O usuário deve informar o tipo de veículo e, se for o caso
o número de eixos. Exibir o valor total a pagar.
 */
        String veiculo;
        int eixos;
        double valor;
        
        System.out.println("Informe qual é o seu veiculo: ");
        veiculo = read.next();
        veiculo = veiculo.toLowerCase();
        
        
        if(veiculo.equals("carro")){
            System.out.println("O valor a ser pago é R$10,00");
        }else if(veiculo.equals("caminhonete")){
            System.out.println("O valor a ser pago é R$15,00");
        }else if(veiculo.equals("onibus")){
            System.out.println("Informe quantos eixos tem: ");
            eixos  = read.nextInt();
            valor = eixos * 5;
             System.out.println("O valor a pagar é: R$"+valor);
            
        }else if(veiculo.equals("caminhao")){
            System.out.println("Informe quantos eixos tem: ");
            eixos  = read.nextInt();
            valor = eixos * 8;
             System.out.println("O valor a pagar é: R$"+valor);
        }else{
        System.out.println("veiculo invalido");
        
        }
        
        
    }
}
