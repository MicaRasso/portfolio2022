import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { elementAt, Observable } from 'rxjs';
import { proyect } from '../model/proyect.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectService {
  URL='http://localhost:8090/proyects/';

  constructor(private http:HttpClient) { }

  public getProyects():Observable<proyect>{
    //public getProyects():Array<any>{
/*
    let data
    let aux=[]
    let id=1
    data=this.http.get<proyect>(this.URL+`get/${id}`)
    while(data){
      aux.push(data)
      id++;
      data=this.http.get<proyect>(this.URL+`get/${id}`)
    }

    return aux;
*/
    return this.http.get<proyect>(this.URL+'get')
  }
}
