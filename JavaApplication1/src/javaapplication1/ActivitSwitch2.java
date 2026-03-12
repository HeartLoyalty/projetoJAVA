
package javaapplication1;
import java.util.Scanner;
public class ActivitSwitch2 {
    public static void activit2(String args[]){
       // 2 - Monte um quiz com 4 perguntas e pontuação final para as respostas certas.
       Scanner read = new Scanner(System.in);
      int pontos = 0;
      
      String resposta = null;
      System.out.println("Somente numeros");
      System.out.println("Quanto é 2 + 2: ");
      resposta = read.next();
      if(resposta.equals("4")){
          pontos += 10;
          
      }else{
          pontos += 0;
      }
      System.out.println("Somente numeros");
       System.out.println("Quanto é 7 x 8: ");
      resposta = read.next();
      if(resposta.equals("56")){
          pontos += 10;
          
      }else{
          pontos += 0;
          
      }
      System.out.println("Somente numeros");
       System.out.println("Quanto é 48 / 4: ");
      resposta = read.next();
      if(resposta.equals("12")){
          pontos += 10;
      }else{
          pontos += 0;
      }
      System.out.println("Somente numeros");
        System.out.println("Quanto é 23 - 9: ");
      resposta = read.next();
      if(resposta.equals("14")){
          pontos += 10;
      }else{
          pontos += 0;
      }
      
      System.out.println("Voce marcou: " + pontos +" pontos");
         
    }
}
