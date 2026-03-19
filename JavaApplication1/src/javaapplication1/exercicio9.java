
package javaapplication1;
import java.util.Scanner;

public class exercicio9 {
    public static void exercicio9(String []args){
    //controle de acesso empresarial
    
    Scanner read = new Scanner(System.in);
    int cargo, weekDay;
    double HrEntrada;
    
    System.out.println("Informe o seu cargo:"+"\n 1-Gerente"+"\n 2-Supervisor"+"\n 3-Funcionrio");
    cargo = read.nextInt();
    
    System.out.println("Informe o dia da semana:" );
    weekDay = read.nextInt();
    
   System.out.println("Informe o Horario:");
    HrEntrada = read.nextDouble();
    
        if (HrEntrada < 1 && HrEntrada > 23 && cargo != 1) {
            System.out.println("Horario de acesso nao permitido");
        }
        if (cargo == 1 ) {
            System.out.println("acesso permitido");
        }
        if (cargo == 2 && HrEntrada >= 6 && HrEntrada <= 22) {
            System.out.println("acesso permitido");
            
        } 
        if (cargo ==2 && HrEntrada < 6 && HrEntrada > 22) {
            System.out.println("acesso negado, fora do horario determinado");
        }
         if (cargo == 3 && HrEntrada >= 8 && HrEntrada <= 18) {
            System.out.println("acesso permitido");
            
        }
         if( cargo ==3 && weekDay == 6 && weekDay == 7) {
            System.out.println("acesso permitido apenas em dias uteis");
        }
    
    }
}
