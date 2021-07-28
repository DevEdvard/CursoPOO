package poo5;

/**
 *
 * @author Admin
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public void fazerAniver (){
        this.idade = this.getIdade() + 1;
        System.out.println("Parabéns pelos " + this.getIdade() + " anos");
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
