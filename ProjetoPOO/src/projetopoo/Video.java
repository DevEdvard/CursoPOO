package projetopoo;

/**
 *
 * @author Admin
 */
public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video (String t){
        this.titulo = t;
        this.avaliacao = 1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    @Override
    public void play() {
        if (this.reproduzindo){
            System.out.println("O vídeo já está em reprodução!");
        } else {
            this.reproduzindo = true;
            System.out.println("Play!");
        }
    }

    @Override
    public void pause() {
        if (this.reproduzindo){
            this.reproduzindo = false;
            System.out.println("Pause!");
        } else {
            System.out.println("O vídeo já está pausado!");
        }
    }

    @Override
    public void like() {
        this.curtidas = this.curtidas + 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
