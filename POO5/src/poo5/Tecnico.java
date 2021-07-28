package poo5;

/**
 *
 * @author Admin
 */
public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(){
            System.out.println("você praticou!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
