import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  id:number;

  constructor() {
    if(localStorage.getItem('utente').length==0){
      window.location.href="/login";
    }
   }

  ngOnInit(): void {
  }

  logout(){
    localStorage.removeItem('utente');
    window.location.href="/login";
  }

  

}
