
package javaapplication1;

import java.util.Scanner;
public class ActivitSwitch4 {
    public static void Activit4(String arg[]){
        Scanner read = new Scanner(System.in);
        
        /*
        Um banco concede empréstimo seguindo as regras:
Idade entre 21 e 65 anos.
Renda mínima de R$ 2.500.
Nome não pode estar negativado.
 
Se renda = 5.000 ? aprovado automaticamente. 
Se renda entre 2.500 e 4.999 ? aprovado somente se tempo de trabalho = 2 anos.
Caso contrário ? negado.
 
Solicite: idade, renda, tempo de trabalho e situação do nome (S/N).
Mostre o resultado da análise com justificativa.
        */
        int Idade;
        boolean S;
        boolean N;
        S = true;
        N  = false;
        double renda;
        int timework = 0;
        
       System.out.println("Qual é a sua idade? ");
       Idade = read.nextInt();
       if(Idade < 21 || Idade > 65){
           System.out.println("Emprestimo nao foi aprovado. ");
           
           
       }else{
           System.out.println("Seu nome está negativado? ");
           
           
           if(S){
               System.out.println("Emprestimo nao foi aprovado. ");
               
               
           }else if(N){
                System.out.println("Qual é a sua renda? ");
                renda = read.nextDouble();
                if(renda < 2500.00){
                     System.out.println("Emprestimo nao foi aprovado. ");
                }else if(renda > 5000.00){
                    System.out.println("Emprestimo foi aprovado. ");
                }else if(renda > 2500.00 && renda < 5000.00 ){
                    System.out.println("Quanto tempo voce tem de carteira?  ");
                    if(timework > 24){
                        System.out.println("Emprestimo foi aprovado. ");
                    }else{
                        System.out.println("Emprestimo nao foi aprovado. ");
                    }
                }
           }
       }
        
        
        
    }
}
