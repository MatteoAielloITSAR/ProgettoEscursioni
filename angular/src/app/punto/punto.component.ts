import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Punto } from '../model/Punto';

@Component({
  selector: 'app-punto',
  templateUrl: './punto.component.html',
  styleUrls: ['./punto.component.css']
})
export class PuntoComponent implements OnInit {

  tappe: Punto[];

  constructor (private http: HttpClient) { }

  ngOnInit(): void {

    /*this.http.get<Punto[]>('http://localhost:8080/tappe').subscribe((dati) => {
      this.tappe = dati;
    });*/
  }

  richiestaHttp() {
    console.log('inizio');

    this.http.get<Punto[]>('http://localhost:8080/tappe').subscribe((dati) => {
      console.log(dati);
      this.tappe = dati;
    });

    console.log('fine della funzione');
  }

}
