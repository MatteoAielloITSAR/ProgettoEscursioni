import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Post } from '../model/Post';
import { Utente } from '../model/utente';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-creazione-post',
  templateUrl: './creazione-post.component.html',
  styleUrls: ['./creazione-post.component.css']
})
export class CreazionePostComponent implements OnInit {

  difficolta : number;
  utente : Utente;

  constructor(
    private http: HttpClient
  ) { }

  ngOnInit(): void {
  }

  invio(form : NgForm) {
    alert("Tutto il form: " + JSON.stringify(form.value));
  }

  creaPost(nome, descrizione, difficolta) {

    // let difficolta : number;

    this.utente = JSON.parse(localStorage.getItem('utente'));
    
    let post : Post = new Post();
    post.nome_percorso = nome;
    post.descrizione = descrizione;
    post.difficolta = difficolta;
    post.visibilita = "pubblico";
    post.tipologiaPercorso = "personalizzato";
    post.utente = this.utente;

    this.http.post<Utente>('http://localhost:8080/utenti/' + this.utente.idUtente, post).subscribe();
    window.location.href="/account";

  }

  /*
  invio(form: any) {
    alert("Valore radiobox: " + this.sesso_modello);
    }
    */

}
