package poo5;


import poo5.Pessoa;

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa {
    private String espec;
    private float sal;
    
    public void receberAum(float aum){
        this.sal += aum;
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
    
}
