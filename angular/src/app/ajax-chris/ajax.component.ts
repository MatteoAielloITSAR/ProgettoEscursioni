import { HttpClient} from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ajax',
  templateUrl: './ajax.component.html',
  styleUrls: ['./ajax.component.css']
})
export class AjaxComponent implements OnInit {

  //collezione di tappe 
  tappe:any[];

  //injection della dependecy 
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  richiestaHttp() {
    // la chiamata get verrà eseguita solo se io chiamo la funzione subscribe()
    console.log('inizio');
    // nelle parentesi angolari <>, indico il tipo di dato che mi aspetto da GET
    this.http.get<any[]>('http://localhost:8080/libri').subscribe((dati) => {
      // questa funzione viene richiamata dall'http client quando
      // la richiesta al web server si è completata
      console.log(dati);
      this.tappe = dati;
    });
    console.log('fine della funzione');
  }

}
