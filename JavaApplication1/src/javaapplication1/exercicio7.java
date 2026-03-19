
package javaapplication1;

import java.util.Scanner;

public class exercicio7 {
    public static void exercicio7(String []args){
    //sistema de avaliaçao escolar complexo
    
   Scanner read = new Scanner(System.in);
   
   double nota1, nota2, nota3, media;
   int faltas, presenca;
   
   
   
   
   System.out.println("Digite a nota do primeiro bimestre: ");
   nota1 = read.nextDouble();
   System.out.println("Digite a nota do primeiro bimestre: ");
   nota2 = read.nextDouble();
   System.out.println("Digite a nota do primeiro bimestre: ");
   nota3 = read.nextDouble();
   
    System.out.println("Digite o percentual de faltas: ");
    faltas = read.nextInt();
    
    presenca = 100 - faltas;
    
    
    media = (nota1 + nota2 + nota3)/3;
    
    if(presenca <= 75 || media < 5){
           System.out.println("Aluno reprovado.");
           }
        if (media >= 7) {
               System.out.println("Aluno aprovado ");

        }
        if ( media <=6.9) {
               System.out.println("Aluno ficou de recuperacao ");

        }
        if (media == 10 && presenca == 100) {
               System.out.println("Aprovado mençao honrosa: ");

        }

   
   
    
    }
    
}
