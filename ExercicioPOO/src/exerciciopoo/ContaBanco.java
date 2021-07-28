/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo;

/**
 *
 * @author Admin
 */
public class ContaBanco {
    public int numConta = 0;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo,String dono, boolean status) {
        this.numConta = numConta+1;
        if (this.tipo != "CP"){
        this.tipo = "CC";
        this.saldo = 50;
        } else {
            this.tipo = "CP";
            this.saldo = 150;
        }
        this.dono = dono;
        this.status = status;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String toString() {
        return "O número da conta é " + this.numConta +
               "O tipo da conta é " + this.tipo;
    }
    
}
