/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo2;

/**
 *
 * @author Admin
 */
public class ContaBanco {
    public int numConta;
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

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }
    
    public void mensalidadecp (){
        this.saldo = this.saldo - 50;
    }
    
    public void mensalidadecc (){
        this.saldo = this.saldo - 15;
    }
    
    public void saque (float valor){
        this.saldo = this.saldo - valor;
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

    void getStatus(boolean b) {
        this.status = b;
    }
    
 
    
    
    
}
