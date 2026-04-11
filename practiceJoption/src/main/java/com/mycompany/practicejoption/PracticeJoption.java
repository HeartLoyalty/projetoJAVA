/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicejoption;

import javax.swing.JOptionPane;

/**
 *
 * @author heartloyalty
 */
public class PracticeJoption {
    static void atividade2(){
        int n1, n2, resposta;
         String x;
      x = JOptionPane.showInputDialog(null,"Informe o primeiro valor");
      n1 = Integer.parseInt(x);
       x = JOptionPane.showInputDialog(null,"Informe o segundo valor");
      n2 = Integer.parseInt(x);
      
      resposta = n1 + n2;
      JOptionPane.showMessageDialog(null, n1 +" + " +n2+ " = "+ resposta);
      
      resposta = n1 - n2;
      JOptionPane.showMessageDialog(null, n1 +" - " +n2+ " = "+ resposta);
      
      resposta = n1 * n2;
      JOptionPane.showMessageDialog(null, n1 +" * " +n2+ " = "+ resposta);
      
      resposta = n1 / n2;
      JOptionPane.showMessageDialog(null, n1 +" / " +n2+ " = "+ resposta);
      
     
        
    }
    static void atividade3(){
        String nome, x;
        double peso, altura, IMC;
        nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
        x = JOptionPane.showInputDialog(null,"Digite qual é o seu peso" );
        peso = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null,"Digite qual é o sua altura" );
        altura = Double.parseDouble(x);
        
        IMC = peso/(altura*altura);
        
        JOptionPane.showMessageDialog(null, nome + " seu Indice de Massa Corporal é "+IMC);
        
                JOptionPane.showMessageDialog(null, String.format("%.2f", d));
                
                
    }
    public static void main(String[] args) {
        atividade3();
      atividade2();
      double resposta, valor;
      String x;
      x = JOptionPane.showInputDialog(null,"Informe um Valor em reais");
      valor = Double.parseDouble(x);
      resposta = valor * 0.10;
      JOptionPane.showMessageDialog(null, "10% de "+ valor +" é "+resposta);
      
    }
}
