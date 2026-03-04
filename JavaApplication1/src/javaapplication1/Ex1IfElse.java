
package javaapplication1;
import java.util.Scanner;
public class Ex1IfElse {
    public static void exercicio1(String[] args){
        Scanner read = new Scanner(System.in);
        
        /*
        1. Calculadora de Tarifas de Energia Elétrica
 
Implemente um programa que receba o consumo mensal de energia
(em kWh) e calcule a tarifa de acordo com a seguinte regra:
 
Até 50 kWh → R$ 0,20 por kWh
De 51 a 150 kWh → R$ 0,25 por kWh
De 151 a 300 kWh → R$ 0,30 por kWh
Acima de 300 kWh → R$ 0,40 por kWh
Mostre o valor total a pagar, levando em conta apenas um preço por faixa (não acumulativo).*/
        
        int csMensal;
        double vlTotal;
        System.out.println("Informe o seu consumo mensal em kWh: ");
        csMensal = read.nextInt();
        if(csMensal<=0){
            System.out.println("valor invalido.");
        }else if(csMensal <= 50){
            vlTotal = csMensal * 0.20;
           System.out.println("O valor total a pagar é: R$ " + vlTotal);
           
        }else if(csMensal <= 150){
            vlTotal = csMensal * 0.25;
            System.out.println("O valor total a pagar é: R$ " + vlTotal);
            
        }else if(csMensal <= 300){
            vlTotal = csMensal * 0.30;
            System.out.println("O valor total a pagar é: R$ " + vlTotal);
            
        }else if(csMensal > 300){
            vlTotal = csMensal * 0.40;
            System.out.println("O valor total a pagar é: R$ " + vlTotal);
        }
        
        
        
    }
}
