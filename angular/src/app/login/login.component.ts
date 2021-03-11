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
  ut:Utente=null;

  constructor(
    private http: HttpClient,
  ) { }

  ngOnInit(): void {
  }

  login(user,pass){
    this.http.get<any[]>('http://localhost:8080/utenti/').subscribe((dati) => {
      // questa funzione viene richiamata dall'http client quando
      // la richiesta al web server si è completata
      this.utenti = dati;
      for(let i=0;i< this.utenti.length;i++){
        if(this.utenti[i].username==user&&this.utenti[i].password==pass){
          this.ut=this.utenti[i];
        }
      }
      if(this.ut==null){
        alert("Username o Password errati");
      }
      else{
        localStorage.setItem('utente', JSON.stringify(this.ut));
        window.location.href="/menu";
      }
    });
    
    

  }

}
