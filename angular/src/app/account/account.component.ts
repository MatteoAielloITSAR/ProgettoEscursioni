import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Utente } from '../model/utente';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';
import { Post } from '../model/Post';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  utente : Utente;
  posts : Post[];
  //pt:Post=null;
  constructor(
    private http: HttpClient
  ) { }



  visualizzaPost(p){
    
  localStorage.setItem('post', JSON.stringify(p));
        window.location.href="/post";
        console.log(p);
  }
  ngOnInit(): void {

    
    this.utente = JSON.parse(localStorage.getItem('utente'));
    // console.log(localStorage.getItem('utente'))
    console.log(JSON.stringify(this.utente.post));
    
    /*
    visualizzaPost(){
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
        
        }
        else{
          localStorage.setItem('utente', JSON.stringify(this.ut));
          window.location.href="/menu";
        }
    */
        //this.http.put<Utente>('http://localhost:4200/post', body).subscribe((dati) => 
          
        //this.http.put<any>('http:localhost:4200/post').subscribe((dati) =>
    
  /*
    this.http.get<Post[]>('http://localhost:8080/posts/').subscribe((dati) => {
      for (let i = 0; i < dati.length; i++) {
        let post = dati[i];
        
      }
      
    });
    */

    
  }


}
