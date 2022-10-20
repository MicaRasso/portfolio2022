import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { skills } from '../model/skills.model';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {
  URL='http://localhost:8090/skills/';

  constructor(private http:HttpClient) { }

  public list():Observable<skills[]>{
    return this.http.get<skills[]>(this.URL+'list')
  }

  //para obtener datos de una exp particular
  public detail(id:number):Observable<skills[]>{
    return this.http.get<skills[]>(this.URL + `detail/${id}`);
  }

  //guardar
  public save(exp:skills):Observable<any>{
    return this.http.post<any>(this.URL + `create`,exp);
  }

  //actualizar
  public update(id:number,exp:skills):Observable<any>{
    return this.http.put<any>(this.URL + `update/${id}` ,exp)
  }
  
  //borrar
  public delete(id:number):Observable<any>{
    return this.http.delete<any>(this.URL + `delete/${id}`)
  }
}
