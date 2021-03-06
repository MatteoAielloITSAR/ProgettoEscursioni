import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Ut} from '../model/ut';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  utenti:any[];
  id:number=null;

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
          Ut.idUtente=this.utenti[i].idUtente;
        }
      }
      alert(Ut.idUtente);
      if(Ut.idUtente==null){
        alert("Username o Password errati");
      }
      else{
        window.location.href="/menu";
      }
    });
    
    

  }

}
