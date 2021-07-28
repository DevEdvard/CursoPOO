package exerciciopoo04;

/**
 *
 * @author Admin
 */
public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
}

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos Abstratos

    @Override
    public void ligar() {
        if (this.getLigado()){
            System.out.println("A televisão já está ligada");
        } else {
            this.setLigado(true);   
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado()){
            this.setLigado(false);
        } else {
            System.out.println("A televisão já está desligada");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
        System.out.println("----------MENU----------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 10; i<= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
        } else {
            System.out.println("A televisão está desligada");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechando menu!");
        } else {
            System.out.println("A televisão está desligada");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+10);
        } else {
            System.out.println("Impossível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()-10);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        } else {
            System.out.println("Impossível ligar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        } else {
            System.out.println("Impossível ligar o mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
    
    
    
}
