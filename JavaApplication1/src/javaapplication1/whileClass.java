/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

public class whileClass {
    public static void whileclass(){
        Scanner read = new Scanner(System.in);
        int tab, c=1;
        System.out.println("Escolha a tabuada de um a 10: ");
        tab = read.nextInt();
        
        while(c <= 10){
            System.out.println(tab + "x" + c + "=" + (tab * c));
            c++;
        }


}
    
}
