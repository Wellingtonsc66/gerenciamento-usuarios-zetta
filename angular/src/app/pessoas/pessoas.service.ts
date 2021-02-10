import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Pessoas} from './pessoas';

@Injectable({
  providedIn: 'root'
})
export class PessoasService {

  private baseURL = 'api/pessoas';
  constructor(private httpClient: HttpClient) { }

  getPessoas(): Observable<Pessoas[]>{
      return this.httpClient.get<Pessoas[]>(this.baseURL);
  }
}
