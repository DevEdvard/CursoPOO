package poo5;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada!");
        System.out.println("");
    }
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga!");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
