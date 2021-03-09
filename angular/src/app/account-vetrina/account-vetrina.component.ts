import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Post } from '../model/Post';

@Component({
  selector: 'app-account-vetrina',
  templateUrl: './account-vetrina.component.html',
  styleUrls: ['./account-vetrina.component.css']
})
export class AccountVetrinaComponent implements OnInit {

  posts: Post[];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  requestHttp() {
    console.log('inizio la richiesta');

    this.http.get<Post[]>('http://localhost:8080/posts').subscribe((dati) => {
      console.log(dati);
      this.posts = dati;
    });

    console.log('fine');
    }
  }

