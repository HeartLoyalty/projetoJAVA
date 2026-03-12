
package javaapplication1;

import java.util.Scanner;
public class ActivitSwitch {
    public static void activit1(){
        /*
        1 - SOLICITE AO USUÁRIO AS SEGUINTES INFORMAÇÕES :
 
- VELOCIDADE PERMITIDA NA VIA
- VELOCIDADE QUE O CARRO ESTA NO MOMENTO
 
 
SE VELOCIDADE ESTIVER ACIMA DE  10KM DO PERMITIDO , O SISTEMA DARA UM AVISO DE "MULTA DE 80,00"
SE A VELOCIDADE ESTIVER ACIMA  ENTRE 11KM E 39 KM , O SISTEMA DA UM AVISO DE "MULTA DE 120,00"
SE A VELOCIDADE FOR MAIOR OU IGUAL A 40 KM O SISTEMA DA UM AVISO DE "MULTA DE 200,00"*/
        
        Scanner read = new Scanner(System.in);
        
        int VelocidadePermitida;
        int VelocidadeDoVeiculo;
        
        System.out.println("Informe qual a velocidade permitida na via: ");
        VelocidadePermitida = read.nextInt();
        
        System.out.println("Informe qual a velocidade do Veiculo: ");
        VelocidadeDoVeiculo = read.nextInt();
        
        VelocidadeDoVeiculo = VelocidadeDoVeiculo - VelocidadePermitida;
        
        if(VelocidadeDoVeiculo == 10){
            
             System.out.println("AVISO: MULTA DE 80,00 POR VELOCIDADE ACIMA DO PERMITIDO ");
        }else if(VelocidadeDoVeiculo > 10 && VelocidadeDoVeiculo <= 39 ){
            
            System.out.println("AVISO: MULTA DE 120,00 POR VELOCIDADE ACIMA DO PERMITIDO ");
        }else if(VelocidadeDoVeiculo >= 40){
            
            System.out.println("AVISO: MULTA DE 200,00 POR VELOCIDADE ACIMA DO PERMITIDO ");
        }else{
            
            System.out.println("VEICULO NA VELOCIDADE CORRETA ");
        }
        
    }
}
