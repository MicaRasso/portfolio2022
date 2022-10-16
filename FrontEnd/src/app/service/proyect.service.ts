import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { proyect } from '../model/proyect.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectService {
  URL='http://localhost:8090/proyects/';

  constructor(private http:HttpClient) { }

  public getProyects():Observable<proyect>{
    return this.http.get<proyect>(this.URL+'get')
  }
}
