
package javaapplication1;
import java.util.Scanner;
//CONDICIONAIS DE COMPARAÇÃO.
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        exercicio9.exercicio9(args);
        exercicio8.exercicio8(args);
        exercicio7.exercicio7(args);
        ActivitSwitch4.Activit4(args);
        ActivitSwitch3.Activit3();
        ActivitSwitch2.activit2(args);
        ActivitSwitch.activit1();
        Exercicio4.exercicio4();
        Exercicio3.exercicio3();
        Exercicio2.exercicio2();
        Exercicio1.exercicio1(args);
            
        
            /*
            == IGUAL
            != DIFERENTE
            > MAIOR Q
            < MENOR Q
            >= MAIOR IGUAL
            <= MENOR IGUAL
            % MODULO
            && E
            || OU
        
          int x = 3;
            if(x == 1){
                (valor igual a 1);
            }else if(x == 2){
          (valor igual a 2);
    }else if(x == 3){
    (valor igual a 3);
}else{
        (nenhum dos valores é igual a x)
    }*/
            int idade;
            System.out.println("informe a idade do usuario: ");
            idade = read.nextInt();
            if(idade <= 0){
                System.out.println("idade invalida.");
            }else if(idade >= 1 && idade <= 10){
                
            System.out.println("INFATIL - manhã.");
            
            
            }else if(idade <= 13){
                
            System.out.println("INFANTO-JUVENIL - tarde.");
            
            
            }else if(idade <= 17){
                
            System.out.println("PRÉ ADOLESCENTE - tarde.");
            
            
            }else if(idade >= 18){
                
            System.out.println(" ADULTO - noite.");
            }
}
}
