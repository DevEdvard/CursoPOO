/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursopoo;

/**
 *
 * @author Admin
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public Caneta(String m, String c, float p, int ca){
        this.tampar();
        this.cor = c;
        this.ponta = p;
        this.modelo = m;
        this.carga = ca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta (float p){
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar. Estou tampada!");
        } else{
            System.out.println("Estou rabiscando!");
        }
    }
    
    protected void tampar (){
        this.tampada = true;
    }
    
    protected void destampar (){
        this.tampada = false;
    }
    
}
