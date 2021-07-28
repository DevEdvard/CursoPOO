/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExercicioPOO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        int cont=0;
        String tipo;
        boolean status=false;
        float saldo=0f;
        
        ContaBanco Conta = new ContaBanco();
        
        while(cont < 1) {
        System.out.println("----------- Bem vindo ao CloudBank -----------");
        System.out.println("Digite o número correspondente da operação:");
        System.out.println("");
        System.out.println("1- Criar uma conta?");
        System.out.println("2- Fechar uma conta?");
        System.out.println("3- Depositar!");
        System.out.println("4- Sacar!");
        System.out.println("5- Pagar mensalidade!");
        System.out.println("6- Dados da conta!");
        System.out.println("7- Sair!");
        System.out.println("");
        
        Scanner input = new Scanner (System.in);
        n = input.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Qual o tipo da conta que você quer abrir?");
                tipo = input.next();
                Conta.abrirConta(tipo);
                n = 0;
                break;
            case 2:
                Conta.fecharConta();
                 n = 0;
                break;
            case 3:
                System.out.println("Qual o valor do deposito?");
                saldo = input.nextFloat();
                Conta.depositar(saldo);
                n = 0;
                break;
            case 4:
                System.out.println("Qual o valor a sacar?");
                saldo = input.nextFloat();
                Conta.sacar(saldo);
                n = 0;
                break;
            case 5:
                Conta.pagarMensal();
                n = 0;
            case 6:
                System.out.println(Conta);
                n = 0;
                break;
            case 7:
                System.out.println("Até logo!");
                n = 0;
                cont = 2;
                break;
            default:
                System.out.println("Não entendi, tente novamente!");
                n = 0;
                break;
                }
        } 
}
}