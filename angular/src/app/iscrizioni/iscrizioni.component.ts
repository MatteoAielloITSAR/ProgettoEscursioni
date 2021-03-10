import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Utente } from '../model/utente';

@Component({
  selector: 'app-iscrizioni',
  templateUrl: './iscrizioni.component.html',
  styleUrls: ['./iscrizioni.component.css']
})
export class IscrizioniComponent implements OnInit {

  iscrizioni:Utente[];
  ut:Utente;

  constructor(
    private http: HttpClient
  ) {
    this.ut=JSON.parse(localStorage.getItem('utente'));
   }

  ngOnInit(): void {
    this.http.get<any[]>('http://localhost:8080/utenti/'+this.iscrizioni).subscribe(((dati) =>{
      this.iscrizioni=dati
    }));
  }

}
