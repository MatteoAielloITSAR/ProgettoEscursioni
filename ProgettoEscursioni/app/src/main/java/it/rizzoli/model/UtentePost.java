package it.rizzoli.model;

public class UtentePost {

    private int id;
    private String nomePercorso;
    private String descrizione;
    private String tipologia;
    private String username;

    public UtentePost(Utente u, Post p){
        id=p.getId_Post();
        nomePercorso=p.getNomePercorso();
        descrizione=p.getDescrizione();
        tipologia=p.getTipologia();
        username=u.getUsername();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
