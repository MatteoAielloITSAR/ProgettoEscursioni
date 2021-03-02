import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { PostIscrizioniComponent } from './post-iscrizioni/post-iscrizioni.component';
import { RicercaPostComponent } from './ricerca-post/ricerca-post.component';
import { LoginComponent } from './login/login.component';

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
    path: '',
    redirectTo: '/account',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [PostIscrizioniComponent, AccountComponent, RicercaPostComponent]
