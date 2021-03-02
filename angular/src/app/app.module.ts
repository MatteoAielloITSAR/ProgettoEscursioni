import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { PostComponent } from './post/post.component';
import { IscrizioniComponent } from './iscrizioni/iscrizioni.component';
//import { LoginComponent } from './login/login.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    PostComponent,
    IscrizioniComponent,
    //LoginComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
