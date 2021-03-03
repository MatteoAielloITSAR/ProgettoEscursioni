import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Utente } from '../model/utente'; 

@Component({
  selector: 'app-registrazione',
  templateUrl: './registrazione.component.html',
  styleUrls: ['./registrazione.component.css']
})
export class RegistrazioneComponent implements OnInit {

  constructor(
    private http: HttpClient,
    ) { }

  ngOnInit(): void {
  }

  register(user,pass,ripass,nome,cog){
    if(pass==ripass){
       let utente=new Utente;
       utente.cognome=cog;
       utente.nome=nome;
       utente.password=pass;
       utente.username=user;
       this.http.post<Utente>('http://localhost:8080/utenti', utente).subscribe();
    }
    
  }


}
