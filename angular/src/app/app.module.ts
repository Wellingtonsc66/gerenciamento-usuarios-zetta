import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CargosComponent } from './cargos/cargos.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { HttpClientModule } from '@angular/common/http';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { PessoasComponent } from './pessoas/pessoas.component';

@NgModule({
  declarations: [
    AppComponent,
    CargosComponent,
    PessoasComponent,
    UsuariosComponent
  ],
  imports: [
    BrowserModule,
    FontAwesomeModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
