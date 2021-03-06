import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Utente } from '../model/utente';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  utenti : Utente[];
  utente : Utente;

  constructor(
    private http: HttpClient
  ) { }

  ngOnInit(): void {
    this.utente = new Utente();
    this.http.get<any[]>('http://localhost:8080/utenti').subscribe((dati) => {
      this.utenti = dati;  
      console.log(this.utenti.length)
      for(var i = 0; i < this.utenti.length; i++) {
        console.log(this.utenti[i]);
        /*
        if (this.utenti[i].nome == 'nome1') {
          this.utente = this.utenti[i]
        }
        */
       
      }
      
    });
  }

  getUtenti() {

  }

}
