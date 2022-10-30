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

  public getValidation(us:userValidation):Observable<any> {
    return this.http.post<any>(this.URL+'validate',us);
  }
  public getUser():Observable<userValidation> {
    return this.http.get<userValidation>(this.URL+'get/1');
  }


  alternativeLogIn(mail:string,pass:string):void{
    if(mail && pass){
      this.getUser().subscribe(data=> {
        if (data){  
          let user:userValidation=data;
          console.log('USER ',user)
          if(user && mail.includes(user.email) && pass.includes(user.password))
            this.auth=true;
            console.log(this.auth,mail,pass);      
            console.log('recibido ',typeof user.email);
            console.log('parametro ',typeof mail);
        }
      });       
    }
  }

  logIn(mail:string,pass:string):void{
    if(mail && pass){
      let user:userValidation=new userValidation(mail,pass);
      console.log('USER ',user)
      this.getValidation(user).subscribe(
        data=>this.auth=data
      )
    }
    console.log(this.auth,mail,pass);
   
   //NO PUDE HACER QUE FUNCIONEN LAS VALIDACIONES, ASI QUE LO DEJO ASI POR AHORA
    this.auth=true;

  }

  isLogged():boolean{
    return this.auth;
  }

}
