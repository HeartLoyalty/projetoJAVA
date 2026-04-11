

package com.mycompany.systemipdi;

import java.util.Scanner;

public class SYSTEMIPDI {
    static boolean gripe, resfriado, alergia, sitGrave;// declara variaveis booleanas para verificaao de diagnostico
    
    
            static void sintomas(Scanner read){//cria um metodo para realizar a coleta de dados de sintomas
            int febre, tosse, dorGarganta, coriza, faltaAr; // declara variaveis de tipo inteiro para comparação evitando possiveis respostas invalidas
            
        System.out.println("Voce esta com febre? \n digite 1 para SIM e 2 para NAO:");// mostra ao usuario o que ele deve responder
        febre = read.nextInt();// valor esperado inteiro 1 ou 2
        System.out.println("Voce esta com tosse? \n digite 1 para SIM e 2 para NAO:");
        tosse = read.nextInt();
        System.out.println("Voce esta com dor de garganta? \n digite 1 para SIM e 2 para NAO:");
        dorGarganta = read.nextInt();
        System.out.println("Voce esta com coriza? \n digite 1 para SIM e 2 para NAO:");
        coriza = read.nextInt();
        System.out.println("Voce esta com falta de ar? \n digite 1 para SIM e 2 para NAO:");
        faltaAr = read.nextInt();
                                    //zera o estado da variavel booleana antes da comparação
                                sitGrave = false;
                                alergia = false;
                                resfriado = false;
                                gripe = false;
        // faz a comparação para identificar os sintomas.é
        if(faltaAr == 1){
            sitGrave = true;
        }else
        if(coriza == 1 && febre == 2 && tosse == 2){
            alergia = true;
        }else
        if(coriza == 1 && tosse == 1){
            resfriado = true;
        }else
        if(febre == 1 && tosse == 1 && dorGarganta == 1){
            gripe = true;
        }else{
            System.out.println("sintomas invalidos");
            sintomas(read); // se caso os valores forem invalidos ele retorna o metodo, até ter os dados necessarios para o diagnostico.

        }
        
        }
    // inicia o programa.
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    String nome;
    int idade, opcao = 0; // declara variavel inteira para comparaçoes.
    
    
    
    
    System.out.print("Bem vindo ao Sistema de Identificação e Prevençao de doencas de Inverno");
    System.out.println("Insira seus dados");
        
        System.out.println("Qual e seu nome? ");
        nome = read.next(); // recebe nome
        System.out.println("Qual e sua idade? ");
        idade = read.nextInt(); // recebe idade
        
        sintomas(read); // chama o metodo para analise dos sintomas
 
          while(opcao != 4){ // laço de repetiçao para executar ate o usuario digitar qualquer opao no menu diferente de 4
              System.out.println("""
                                 Escolha uma das opcoes a baixo: 
                                 1. Diagnostico 
                                 2. Recomendacoes 
                                 3. Informar novos sintomas 
                                 4. Sair""");
            opcao = read.nextInt();// recebe opcao do menu
          
            
            switch(opcao){ // executa a opcao recebida
                case 1:
                    // compara os diagnostico de acordo com os dados coletados dos sintomas.
                        if(sitGrave == true){ 
                            System.out.println("Nome: "+ nome);
                            System.out.println("Idade: "+ idade);

                            System.out.println("Diagnostico: \n"
                                    + "Identifcamos uma possivel condicao de uma Situação grave procure um medico imediatamente.");
                        }else if(alergia == true){
                            System.out.println("Nome: "+ nome);
                            System.out.println("Idade: "+ idade);
                            System.out.println("possivel crise alergica.");
                        }else if(resfriado == true){
                            System.out.println("Nome: "+ nome);
                            System.out.println("Idade: "+ idade);
                            System.out.println("possivel resfriado");
                        }else if(gripe == true){
                            System.out.println("Nome: "+ nome);
                            System.out.println("Idade: "+ idade);
                            System.out.println("possivel gripe");

                        }
                    
                    break;
                case 2:
                    
                   // compara possiveis recomendacoes.
                    if(sitGrave == true){
                        System.out.println("procure um Medico URGENTE!");
                    }else if(alergia == true){
                            System.out.println("Evite lugares com poeira");
                            System.out.println("Evite perfumes fortes");
                            System.out.println("Beba bastante liquido");
                        }else if(resfriado == true){
                            System.out.println("Consuma suco e alimentos ricos em vitamina C");
                            System.out.println("Mantenha a Higiene");
                            System.out.println("Beba bastante liquido");
                        }else if(gripe == true){
                            System.out.println("Consuma suco e alimentos ricos em vitamina C");
                            System.out.println("Mantenha a Higiene");
                            System.out.println("Beba bastante liquido");
                            System.out.println("Faça gargarejos");

                        }
                   System.out.println("Se persistir os sintomas um Medico devera ser consutado.");

                    break;
                case 3:
                    // reseta as informaçoes de sintomas dadas pelo usuario retornando ao metodo para uma nova comparaçao
                    System.out.println("Informe seus sintomas:");
                       sintomas(read);                    
                    break;
                case 4:
                    System.out.println("Obrigado por Utillizar nossos serviços!");// agradecimentos
                    
                    break;
                default:
                    System.out.println("opcao invalida, escolha uma opcao de 1 a 4");// pede para digitar uma opçao validaã
                    
                    break;
            }
        
        }
        
     }
    }

