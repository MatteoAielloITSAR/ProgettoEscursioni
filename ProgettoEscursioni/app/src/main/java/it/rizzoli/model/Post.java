package it.rizzoli.model;

public class Post {

    private int id_Post;
    private String nomePercorso;
    private String descrizione;
    private int difficolta;
    private String visibilita;
    private String tipologia;

    public Post(String nomePercorso, String descrizione, int difficolta, String visibilita, String tipologia) {
        this.nomePercorso = nomePercorso;
        this.descrizione = descrizione;
        this.difficolta = difficolta;
        this.visibilita = visibilita;
        this.tipologia = tipologia;
    }

    public int getId_Post() {
        return id_Post;
    }

    public void setId_Post(int id_Post) {
        this.id_Post = id_Post;
    }

    public String getNomePercorso() {
        return nomePercorso;
    }

    public void setNomePercorso(String nomePercorso) {
        this.nomePercorso = nomePercorso;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public void setDifficolta(int difficolta) {
        this.difficolta = difficolta;
    }

    public String getVisibilita() {
        return visibilita;
    }

    public void setVisibilita(String visibilita) {
        this.visibilita = visibilita;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}
