import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-creazione-post',
  templateUrl: './creazione-post.component.html',
  styleUrls: ['./creazione-post.component.css']
})
export class CreazionePostComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  creaPost() {
    console.log('prova');
  }

}
