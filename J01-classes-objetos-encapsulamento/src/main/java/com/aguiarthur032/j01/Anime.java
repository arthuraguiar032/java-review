package com.aguiarthur032.j01;

public class Anime {
    private String nome;
    private int episodios;
    private String estudio;

    public Anime(String nome, int episodios, String estudio){
        this.episodios = episodios;
        if (episodios < 0){
            this.episodios = 1;
        }
        this.nome = nome;
        this.estudio = estudio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        if (episodios > 0){
            this.episodios = episodios;
        }
        else{
            System.out.println("Episódios não podem ser negativos! Campo inalterado.");
        }
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString(){
        return String.format("Anime: %s; Estúdio: %s; %d Episódios.\n",
            this.nome, this.estudio, this.episodios);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        final Anime outro = (Anime) obj;

        if((outro.nome == null) ? (this.nome != null) : !(this.nome.equals(outro.nome))){
            return false;
        }

         if((outro.estudio == null) ? (this.estudio != null) : !(this.estudio.equals(outro.estudio))){
            return false;
        }

        if (this.episodios != outro.episodios){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        int hash = 9;

        int codigo = hash * this.nome.hashCode() * this.estudio.hashCode() * this.estudio.hashCode();
        return codigo;
    }
}
