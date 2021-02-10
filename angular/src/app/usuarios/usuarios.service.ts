import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Usuarios} from './usuarios';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  private baseURL = 'api/cargos';
  constructor(private httpClient: HttpClient) { }

  getUsuarios(): Observable<Usuarios[]>{
      return this.httpClient.get<Usuarios[]>(this.baseURL);
  }
}
