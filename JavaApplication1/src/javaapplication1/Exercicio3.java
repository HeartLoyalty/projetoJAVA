
package javaapplication1;
import java.util.Scanner;
public class Exercicio3 {
    public static void exercicio3(){
        Scanner read = new Scanner(System.in);
        
        /*
        3. Calculadora de IMC (Índice de Massa Corporal)
 
Crie um programa que receba o peso (em kg) e a altura (em metros) de
uma pessoa e calcule o IMC = peso / (altura*altura).
Classifique o resultado de acordo com a tabela:
Menor que 18.5 → "Abaixo do peso"
Entre 18.5 e 24.9 → "Peso normal"
Entre 25.0 e 29.9 → "Sobrepeso"
Entre 30.0 e 34.9 → "Obesidade Grau I"
Entre 35.0 e 39.9 → "Obesidade Grau II"
40.0 ou mais → "Obesidade Grau III".*/
        double IMC, altura, peso;
        System.out.println("Digite qual a sua altura: ");
        altura = read.nextDouble();
        
        System.out.println("Digite qual a seu peso: ");
        peso = read.nextDouble();
        
        IMC = peso / (altura * altura);
        
        if(peso <= 0 || altura <= 0 ){
           System.out.println("altura ou peso são invalidos.");
           
        }else if(IMC <= 18.5){
            System.out.println("IMC: "+IMC+"voce está abaixo do peso.");
        }else if(IMC <= 24.9){
            System.out.println("IMC: "+IMC+"voce está peso normal.");
        }else if(IMC <= 29.9){
            System.out.println("IMC: "+IMC+"voce está acima do peso.");
        }else if(IMC <= 34.9){
            System.out.println("IMC: "+IMC+"voce está com obesidade grau I.");
        }else if(IMC <= 39.9){
            System.out.println("IMC: "+IMC+"voce está com obesidade grau II");
        }else if(IMC >= 40){
            System.out.println("IMC: "+IMC+ "voce está com obesidade grau III");
        }
        
        
    }
}
