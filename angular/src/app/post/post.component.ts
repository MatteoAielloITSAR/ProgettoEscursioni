import { HttpClient } from '@angular/common/http'
import { Component, OnInit } from '@angular/core';
import { Utente } from '../model/utente';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';
import { Post } from '../model/Post';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})

export class PostComponent implements OnInit {
  utente : Utente;
  posts: Post[];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.utente = JSON.parse(localStorage.getItem('utente'));
    console.log(JSON.stringify(this.utente.post));
  
    }

/*
  ngOnInit(): void {
    this.posts = JSON.parse(localStorage.getItem('posts'));
    console.log(JSON.stringify(this.posts));
  }
*/
}
