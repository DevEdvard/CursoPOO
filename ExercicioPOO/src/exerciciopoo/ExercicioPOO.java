/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExercicioPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0, cont = 0;
        String nome=null,tipo=null;
        while(cont < 1) {
        System.out.println("----------- Bem vindo ao CloudBank -----------");
        System.out.println("Digite o número correspondente da operação:");
        System.out.println("");
        System.out.println("1- Criar uma conta?");
        System.out.println("2- Fechar uma conta?");
        System.out.println("3- Depositar!");
        System.out.println("4- Sacar!");
        System.out.println("5- Pagar mensalidade!");
        System.out.println("6- Sair!");
        System.out.println("");
        
//        try {
        Scanner input = new Scanner (System.in);
        n = input.nextInt();
        
        
        ContaBanco conta = new ContaBanco(1,tipo,nome,true);
        
        switch(n){
            case 1:
                System.out.println("Insira os dados solicitados:");
                System.out.println("Seu nome:");
                nome = input.next();
                System.out.println("Tipo da conta (CC ou CP):");
                tipo = input.next();
                n = 0;
                break;
            case 2:
                System.out.println("Conta fechada!");
                System.out.println(conta);
                n = 0;
                break;
            case 3:
                System.out.println("Quanto deseja depositar?");
                n = 0;
                break;
            case 4:
                System.out.println("Quanto vc irá sacar?");
                n = 0;
                break;
            case 5:
                System.out.println("Valor pago!");
                n = 0;
                break;
            case 6:
                System.out.println("Até logo!");
                cont ++;
                break;
            default:
                System.out.println("Não entendi, tente novamente!");
                n = 0;
                break;
            
        
//    }
//    catch (Exception erro) {
//        System.out.println("Operação inválida!");
//    }
    }

    }
}}
