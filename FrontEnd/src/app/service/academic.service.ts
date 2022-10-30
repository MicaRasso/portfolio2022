import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { academic } from '../model/academic.model';

@Injectable({
  providedIn: 'root'
})
export class AcademicService {
  URL='http://localhost:8090/academic/';

  constructor(private http:HttpClient) { }

  public list():Observable<academic[]>{
    return this.http.get<academic[]>(this.URL+'list')
  }
  
//para obtener datos de una exp particular
public detail(id:number):Observable<academic>{
  return this.http.get<academic>(this.URL + `detail/${id}`);
}

//guardar
public save(aca:academic):Observable<any>{
  return this.http.post<any>(this.URL + `create`,aca);
}

//actualizar
public update(id:number,aca:academic):Observable<any>{
  console.log(aca.title);
  console.log(aca.iDate);
  console.log(aca.fDate);
  console.log(aca.institute);
  return this.http.put<any>(this.URL + `update/${id}` ,aca)
}

//borrar
public delete(id:number):Observable<any>{
  return this.http.delete<any>(this.URL + `delete/${id}`)
}



}
