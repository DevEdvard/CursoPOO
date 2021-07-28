/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpratico;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de página: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        if (this.isAberto()){
            System.out.println("O livro está aberto");
        } else {
            System.out.println("O livro está fechado");
        }
        System.out.println("O leitor do livro é " + leitor.getNome());
        System.out.println("");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.aberto){
            System.out.println("O livro já está aberto!");
            System.out.println("");
        } else {
            this.setAberto(true);
            System.out.println("Livro aberto");
            System.out.println("");
        }
    }

    @Override
    public void fechar() {
        if(this.aberto){
            this.setAberto(false);
            System.out.println("Livro fechado");
            System.out.println("");
        } else {
            System.out.println("O livro já está fechado");
            System.out.println("");
        }
    }

    @Override
    public void folhear() {
        if(this.aberto){
            Random aleatorio = new Random();
            int folhear = aleatorio.nextInt(this.getTotPaginas());
            this.setPagAtual(folhear);
            System.out.println("Você está na página: " + this.getPagAtual());
            System.out.println("");
        } else {
            System.out.println("O livro não está aberto");
            System.out.println("");
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto){
            this.setPagAtual(this.getPagAtual()+1);
            System.out.println("Você está na página " + this.getPagAtual());
            System.out.println("");
        } else {
            System.out.println("O livro está fechado!");
            System.out.println("");
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto){
            this.setPagAtual(this.getPagAtual()-1);
            System.out.println("Você está na página " + this.getPagAtual());
            System.out.println("");
        } else {
            System.out.println("O livro está fechado!");
            System.out.println("");
        }
    }
    
    
}
