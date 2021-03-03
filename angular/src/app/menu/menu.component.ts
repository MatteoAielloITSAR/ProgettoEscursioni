import { Component, OnInit } from '@angular/core';
import { Ut } from '../model/ut';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  id:number;

  constructor() { }

  ngOnInit(): void {
  }

  carica(){
    this.id=Ut.idUtente;
    alert(this.id);
  }

}
