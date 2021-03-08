import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { PostIscrizioniComponent } from './post-iscrizioni/post-iscrizioni.component';
import { RicercaPostComponent } from './ricerca-post/ricerca-post.component';
import { LoginComponent } from './login/login.component';
import { RegistrazioneComponent } from './registrazione/registrazione.component';
import { MenuComponent } from './menu/menu.component';
import { PuntoComponent } from './punto/punto.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { AccountVetrinaComponent } from './account-vetrina/account-vetrina.component';
<<<<<<< HEAD
import { ListaUtentiComponent } from './lista-utenti/lista-utenti.component';
=======
import { PostComponent } from './post/post.component';
>>>>>>> ef69bbb949e9c70f5bd3ddcdcbf3e12ae2409c64

const routes: Routes =  [
  {
    path: 'account',
    component: AccountComponent
  },
  {
    path: 'post-iscrizioni',
    component: PostIscrizioniComponent
  },
  {
    path: 'ricerca-post',
    component: RicercaPostComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'registrazione',
    component: RegistrazioneComponent
  },
  {
    path: 'menu',
    component: MenuComponent
  },
  {
    path: 'toolbar',
    component: ToolbarComponent
  },
  {
    path: 'punto',
    component: PuntoComponent
  },
  {
    path: 'account-vetrina',
    component: AccountVetrinaComponent
  },
  {
<<<<<<< HEAD
    path: 'utenti',
    component: ListaUtentiComponent
=======
    path: 'post',
    component: PostComponent
>>>>>>> ef69bbb949e9c70f5bd3ddcdcbf3e12ae2409c64
  },
  {
    path: '',
    redirectTo: '/menu',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
<<<<<<< HEAD
export const routingComponents = [PostIscrizioniComponent, AccountComponent, 
  AccountVetrinaComponent, RicercaPostComponent, RegistrazioneComponent, 
  LoginComponent, MenuComponent, PuntoComponent, ToolbarComponent,
ListaUtentiComponent]
=======
export const routingComponents = [PostIscrizioniComponent, AccountComponent, AccountVetrinaComponent, PostComponent, 
  RicercaPostComponent, LoginComponent, RegistrazioneComponent, 
  MenuComponent, PuntoComponent, ToolbarComponent]
>>>>>>> ef69bbb949e9c70f5bd3ddcdcbf3e12ae2409c64
