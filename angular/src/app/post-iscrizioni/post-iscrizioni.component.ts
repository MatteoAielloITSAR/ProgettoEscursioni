import { Component, OnInit } from '@angular/core';
import { Post } from '../model/Post';

@Component({
  selector: 'app-post-iscrizioni',
  templateUrl: './post-iscrizioni.component.html',
  styleUrls: ['./post-iscrizioni.component.css']
})
export class PostIscrizioniComponent implements OnInit {

  postIscr:any[];

  constructor() { }

  ngOnInit(): void {
  }

}
