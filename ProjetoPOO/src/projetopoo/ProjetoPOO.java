package projetopoo;

/**
 *
 * @author Admin
 */
public class ProjetoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Video v[] = new Video[3];
        v[1] = new Video("Curso POO");
        //System.out.println(v[1].toString());
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[1] = new Gafanhoto("Eduardo", 22, "M", "Edusan");
        //System.out.println(g[1].toString());
        
        Visualizacao vi[] = new Visualizacao[2];
        vi[1] = new Visualizacao(g[1], v[1]);
        vi[1] = new Visualizacao(g[1], v[1]);
        vi[1].avaliar();
        System.out.println(vi[1].toString());
    }
    
}
