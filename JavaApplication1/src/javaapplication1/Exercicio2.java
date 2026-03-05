
package javaapplication1;
import java.util.Scanner;
public class Exercicio2 {
    public static void exercicio2(){
        /*
        2. Verificador de Triângulos
Faça um programa que leia três valores inteiros e determine se eles podem formar um triângulo.
Caso positivo, informe qual o tipo de triângulo:
 
Equilátero → três lados iguais
Isósceles → dois lados iguais
Escaleno → três lados diferentes
Se não for possível formar um triângulo, exiba "Não é um triângulo".
        */
        Scanner read = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite 3 valores para formar um triangulo: ");
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        
        if(a == 0 || b == 0 || c == 0){
            System.out.println("Esses valores nao formam um triangulo");
            
        }else if(a == b && a == c){
            System.out.println("Esses valores formam um triangulo Equilatero");
            
        }else if(a != b && a != c && c != b ){
            System.out.println("Esses valores formam um triangulo Escaleno");
            
        }else{
            System.out.println("Esses valores formam um triangulo Isósceles");
        }
        
       
        
        
    }
    
}
