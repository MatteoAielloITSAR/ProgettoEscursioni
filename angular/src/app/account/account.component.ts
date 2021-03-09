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

  constructor(
    private http: HttpClient
  ) { }

  ngOnInit(): void {
    this.utente = JSON.parse(localStorage.getItem('utente'));
    // console.log(localStorage.getItem('utente'))
    console.log(JSON.stringify(this.utente.post));
    

    /*
    this.http.get<Post[]>('http://localhost:8080/posts/').subscribe((dati) => {
      for (let i = 0; i < dati.length; i++) {
        let post = dati[i];
        
      }
      
    });
    */

    
  }


}
