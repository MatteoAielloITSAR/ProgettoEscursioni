import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Utente } from '../model/utente';

@Component({
  selector: 'app-post-iscrizioni',
  templateUrl: './post-iscrizioni.component.html',
  styleUrls: ['./post-iscrizioni.component.css']
})
export class PostIscrizioniComponent implements OnInit {

  postIscr:Utente[];
  ut:Utente;

  constructor(
    private http: HttpClient
  ) {
    this.ut=JSON.parse(localStorage.getItem('utente'));
   }

  ngOnInit(): void {
    this.http.get<any[]>('http://localhost:8080/iscrizioni/'+this.ut.idUtente).subscribe((dati) => {
      this.postIscr=dati;
    });
  }

}
