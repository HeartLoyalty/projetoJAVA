
package javaapplication1;
import java.util.Scanner;
public class ActivitSwitch3 {
    /*
    Crie um algoritmo que solicite o salário de um funcionário e calcule o imposto de renda com base nas seguintes faixas:
 
Salário até R$ 1.903,98: isento
Salário de R$ 1.903,99 a R$ 2.826,65: 7,5%
Salário de R$ 2.826,66 a R$ 3.751,05: 15%
Salário de R$ 3.751,06 a R$ 4.664,68: 22,5%
Salário acima de R$ 4.664,68: 27,5%  
    */
    
    
    
  public  static void Activit3(){
      Scanner read = new Scanner(System.in);
      double Salario = 0;
      double Imposto1 = 7.5;
      double Imposto2 = 15;
      double Imposto3 = 22.5;
      double Imposto4 = 27.5;
      double ImpSalario;
      
      System.out.println("Qual é o seu salario? ");
      Salario = read.nextDouble();
      if(Salario <= 1903.98){
          System.out.println("Voce está INSENTO ");
      }else if(Salario <= 2826.65){
      
      ImpSalario = (Salario * Imposto1) / 100;
      System.out.println("o valor a ser pago de imposto pe de: " + ImpSalario);
      
      
  }else if(Salario <= 3751.05){
      ImpSalario = (Salario * Imposto2) / 100;
      System.out.println("o valor a ser pago de imposto pe de: " + ImpSalario);
      
  }else if(Salario <= 4664.68){
      ImpSalario = (Salario * Imposto3) / 100;
      System.out.println("o valor a ser pago de imposto pe de: " + ImpSalario);
      
  }else if (Salario > 4664.68){
      ImpSalario = (Salario * Imposto4) / 100;
      System.out.println("o valor a ser pago de imposto pe de: " + ImpSalario);
  }else{
  System.out.println("valor invalido");
  }
      
      
      
  }
}
