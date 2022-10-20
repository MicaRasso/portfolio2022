import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { images } from '../model/images.model';

@Injectable({
  providedIn: 'root'
})
export class ImagesService {
  URL='http://localhost:8090/img/';

  constructor(private http:HttpClient) { }

  public list():Observable<images[]>{
    return this.http.get<images[]>(this.URL+'list')
  }

  //para obtener datos de una exp particular
  public detail(id:number):Observable<images[]>{
    return this.http.get<images[]>(this.URL + `get/${id}`);
  }

  //guardar
  public save(exp:images):Observable<any>{
    return this.http.post<any>(this.URL + `create`,exp);
  }

  //actualizar
  public update(id:number,exp:images):Observable<any>{
    return this.http.put<any>(this.URL + `update/${id}` ,exp)
  }
  
  //borrar
  public delete(id:number):Observable<any>{
    return this.http.delete<any>(this.URL + `delete/${id}`)
  }
}
