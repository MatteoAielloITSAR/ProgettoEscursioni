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
    // la chiamata get verrà eseguita solo se io chiamo la funzione subscribe()
    console.log('inizio');
    // nelle parentesi angolari <>, indico il tipo di dato che mi aspetto da GET
    this.http.get<any[]>('http://localhost:8080/tappe').subscribe((dati) => {
      // questa funzione viene richiamata dall'http client quando
      // la richiesta al web server si è completata
      console.log(dati);
      this.tappe = dati;
    });
    console.log('fine della funzione');
  }

}
