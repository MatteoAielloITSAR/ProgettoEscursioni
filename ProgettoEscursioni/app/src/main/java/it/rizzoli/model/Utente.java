package it.rizzoli.model;

public class Utente {
    private int id;
    private String nome;
    private String cognome;
    private String username;
    private String password;

    public Utente(String user){
        username=user;

    }

    public Utente() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

/*
public class Utente {
    private int id;
    private String nome;
    private String cognome;
    private int eta;
    private String username;
    private String password;

    //crea utente assegnando solo username
    public Utente(String user){
        username=user;
    }

    //crea utente settando i valori a null
    public Utente() {
        this.nome = "";
        this.cognome = "";
        this.eta = 0;
    }

    //crea utente assegnando nome, cognome, eta
    public Utente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() { return eta; }

    public void setEta(int eta) { this.eta = eta; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
*/