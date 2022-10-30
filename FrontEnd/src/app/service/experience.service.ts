import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experience } from '../model/experience.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienceService {
  URL='http://localhost:8090/experience/';

  constructor(private http:HttpClient) { }

  public list():Observable<experience[]>{
    return this.http.get<experience[]>(this.URL + 'list');
  }

  //para obtener datos de una exp particular
  public detail(id:number):Observable<experience>{
    return this.http.get<experience>(this.URL + `detail/${id}`);
  }

  //guardar
  public save(exp:experience):Observable<any>{
   return this.http.post<any>(this.URL + `create`,exp);
  }

  //actualizar
  public update(id:number,exp:experience):Observable<any>{
    return this.http.put<any>(this.URL + `update/${id}` ,exp)
  }
  
  //borrar
  public delete(id:number):Observable<any>{
    return this.http.delete<any>(this.URL + `delete/${id}`)
  }

}
