/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExercicioPOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0, cont = 0, numConta = 0, tipo=0;
        float dinheiro=0;
        String nome=null;
        
        ContaBanco conta = new ContaBanco(0,null,null,0.0f,false);
        
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
                System.out.println("Que tipo de conta vc quer abrir?");
                System.out.println("(1 - Para conta correte / 2 - Para Poupança)");
                tipo = input.nextInt();
                if (tipo == 1){
                conta.setTipo("CC");
                } else {
                    conta.setTipo("CP");
                }
                System.out.println("Qual o seu nome?");
                nome = input.next();
                conta.setDono(nome);
                conta.setNumConta(numConta+1);
                conta.setStatus(true);
                System.out.println("Conta criada!");
                break;
            case 2:
                if (conta.getSaldo() > 0) {
                    System.out.println("Não é possível fechar a conta com valores depositados.");
                    System.out.println("Por favor, realizar o saque do salvo restante.");
                } else {
                System.out.println("Conta fechada!");
                conta.getStatus(false);
                System.out.println(conta);
                }
                break;
            case 3:
                System.out.println("Quanto deseja depositar?");
                dinheiro = input.nextFloat();
                conta.setSaldo(dinheiro);
                dinheiro = 0;
                break;
            case 4:
                System.out.println("Quanto vc irá sacar?");
                conta.getSaldo();
                dinheiro = input.nextFloat();
                conta.saque(dinheiro);
                dinheiro = 0;
                break;
            case 5:
                if (conta.getTipo() == "CC"){
                conta.mensalidadecc();
                } else {
                conta.mensalidadecp();
                }
                System.out.println("Valor pago!");
                break;
            case 7:
                System.out.println("Até logo!");
                cont = 1;
                break;
            case 6:
                System.out.println(conta);
                break;
            default:
                System.out.println("Não entendi, tente novamente!");
                n = 0;
                break;
    }
    
}}}
