/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo3;

/**
 *
 * @author Admin
 */
public class ContaBanco {
    public int numConta=0;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
        @Override
       public String toString() {
        return "Número da conta: " + numConta + " "
                + tipo + " "
                + "Nome: " + dono + " "
                + "Saldo da conta: R$" + saldo + " "
                + status;
    }

    public ContaBanco() {
        this.saldo=0.0f;
        this.status=false;
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(150f);
        } else if ("CP".equals(t)) {
            this.setSaldo(150f);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.status = false;
        }
    }
    
    public void depositar(float d) {
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito realizado na conta de" + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float s) {
        if (this.isStatus()){
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saldo realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }
    
    public void pagarMensal() {
        float m=0;
        if ("CC".equals(getTipo())) {
            m = 12;
        } else if ("CP".equals(getTipo())) {
            m = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > m) {
                this.setSaldo(this.getSaldo() - m);
                System.out.println("Mensalidade paga com sucesso pela conta do" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar com uma conta fechada");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
