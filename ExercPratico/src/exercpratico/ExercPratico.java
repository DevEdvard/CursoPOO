package exercpratico;

/**
 *
 * @author Admin
 */
public class ExercPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa leitor = new Pessoa("Eduardo", 22, "M");
        Livro ebook = new Livro("Dale", "Deli", 230, leitor);
        
        
        ebook.abrir();
        ebook.detalhes();
        ebook.folhear();
        ebook.avancarPag();
        ebook.voltarPag();
        
    }
    
}
