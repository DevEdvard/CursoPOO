package poo5;

/**
 *
 * @author Admin
 */
public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga! Pagamento facilitado.");
        System.out.println("");
    }

    public float getBolsa() {
        return bolsa;
    }
    
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
