import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Utente } from '../model/utente';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  utenti:any[];
  i:number;


  constructor(
    private http: HttpClient,
  ) { }

  ngOnInit(): void {
  }

  login(user,pass){
    let utente;
    this.http.get<any[]>('http://localhost:8080/utenti').subscribe((dati) => {
      // questa funzione viene richiamata dall'http client quando
      // la richiesta al web server si è completata
      this.utenti = dati;
    });
    for(utente of this.utenti){
      if(utente.username==user&&utente.password==pass){
        this.i=utente.id;
        alert(this.i);
        break;
      }
    }

  }

}
