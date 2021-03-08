import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Utente} from '../model/utente';

@Component({
  selector: 'app-lista-utenti',
  templateUrl: './lista-utenti.component.html',
  styleUrls: ['./lista-utenti.component.css']
})
export class ListaUtentiComponent implements OnInit {

  utenti: Utente[];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  richiestaHttp() {
    console.log('inizio');

    this.http.get<Utente[]>('http://localhost:8080/utenti').subscribe((dati) => {
      console.log(dati);
      this.utenti = dati;
    });

    console.log('fine della funzione');
  }

}
