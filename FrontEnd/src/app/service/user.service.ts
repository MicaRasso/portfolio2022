import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { user } from '../model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  URL='http://localhost:8090/user/';

  constructor(private http:HttpClient) { }

  public getUser(): Observable<user>{
    return this.http.get<user>(this.URL+'get');
  }

    //para obtener datos de un user particular
  public detail(id:number):Observable<user>{
    return this.http.get<user>(this.URL + `detail/${id}`);
  }

  //guardar
  public save(us:user):Observable<any>{
    return this.http.post<any>(this.URL + `create`,us);
  }

  //actualizar
  public update(id:number,us:user):Observable<any>{
    return this.http.put<any>(this.URL + `update/${id}` ,us)
  }

  //borrar
  public delete(id:number):Observable<any>{
    return this.http.delete<any>(this.URL + `delete/${id}`)
  }


}
