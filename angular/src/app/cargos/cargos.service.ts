import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Cargos} from './cargos';

@Injectable({
  providedIn: 'root'
})
export class CargosService {

  private baseURL = 'api/cargos';
  constructor(private httpClient: HttpClient) { }

  getCargos(): Observable<Cargos[]>{
      return this.httpClient.get<Cargos[]>(this.baseURL);
  }
}
