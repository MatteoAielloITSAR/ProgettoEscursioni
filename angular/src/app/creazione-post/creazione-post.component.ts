import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Post } from '../model/Post';
import { Utente } from '../model/utente';

@Component({
  selector: 'app-creazione-post',
  templateUrl: './creazione-post.component.html',
  styleUrls: ['./creazione-post.component.css']
})
export class CreazionePostComponent implements OnInit {


  utente : Utente;

  constructor(
    private http: HttpClient
  ) { }

  ngOnInit(): void {
  }

  creaPost() {
    
    this.utente = JSON.parse(localStorage.getItem('utente'));
    console.log(this.utente.idUtente);
    let post : Post = new Post();
    post.nome_percorso = "nomePost2";
    post.descrizione = "descrizione1";
    post.difficolta = 2;
    post.visibilita = "privato";
    post.tipologiaPercorso = "standard";
    post.utente = this.utente;

    

    this.http.post<Utente>('http://localhost:8080/utenti/' + this.utente.idUtente, post).subscribe();
  }

}
