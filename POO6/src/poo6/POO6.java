package poo6;

/**
 *
 * @author Admin
 */
public class POO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamifero m = new Mamifero();
        
        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        Lobo p = new Lobo();
        System.out.println("");
        
        p.setPeso(55.30f);
        p.setIdade(3);
        p.setMembros(4);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        //p.usarBolsa();
        
        Cachorro a = new Cachorro();
        System.out.println("");
        a.setPeso(3.39f);
        a.setIdade(5);
        a.setMembros(4);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.reagir("olá");
        a.reagir("Vai apanhar");
        a.reagir(11, 45);
        a.reagir(21, 00);
        a.reagir(true);
        a.reagir(false);
        a.reagir(2, 12.5f);
        a.reagir(17, 4.5f);
    }
    
}
