import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { userValidation } from '../model/userval.model';


@Injectable({
  providedIn: 'root'
})
export class ValidationService {
  URL='http://localhost:8090/userVal/';
  
  private auth:boolean=false;

  constructor(private http:HttpClient) { }

  public getUser():Observable<userValidation> {
    return this.http.get<userValidation>(this.URL+'get/1');
  }

  logIn(us:userValidation){
    this.getUser().subscribe(
      data=>{
        if(us.mail==data.mail && us.password==data.password)
          this.auth=true;
    }) 
  }

  isLogged():boolean{
    return this.auth;
  }

}
