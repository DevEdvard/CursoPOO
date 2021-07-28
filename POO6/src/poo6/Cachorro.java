package poo6;

/**
 *
 * @author Admin
 */
public class Cachorro extends Lobo{
    
    public void enterrarOsso(){
        System.out.println("Osso enterrado");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String f){
        if("toma comida".equals(f) || "olá".equals(f)){
            System.out.println("Abanar e latir");
    } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int h, int m){
        if(h<12){
            System.out.println("Abanar");
        } else if(h>=18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean d){
        if(d){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir (int i, float p){
        if (i < 5) {
            if (p < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (p < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
