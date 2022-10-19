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
public detail(id:number):Observable<academic[]>{
  return this.http.get<academic[]>(this.URL + `detail/${id}`);
}

//guardar
public save(exp:academic):Observable<any>{
  return this.http.post<any>(this.URL + `create`,exp);
}

//actualizar
public update(id:number,exp:academic):Observable<any>{
  return this.http.put<any>(this.URL + `update/${id}` ,exp)
}

//borrar
public delete(id:number):Observable<any>{
  return this.http.delete<any>(this.URL + `delete/${id}`)
}



}
