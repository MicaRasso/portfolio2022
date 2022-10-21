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



  logIn(mail:string,pass:string):void{
    if(mail && pass){
      let user:userValidation=new userValidation(mail,pass);
      console.log('USER ',user)
      this.getValidation(user).subscribe(
        data=>this.auth=data
      )
    }
    console.log(this.auth,' ',mail,' ',pass);
  }

  isLogged():boolean{
    return this.auth;
  }

/*
  logIn(info:any):void{
    console.log(info.value);

    console.log(this.userForm.value)
    let info=this.userForm.value;
  
    if (!this.userForm.valid){
      console.log("Errores");
    }else
      if(info.email && info.password){
        let userVal:userValidation=new userValidation(info.email,info.password);
        console.log(userVal);

        this.userValService.getValidation(userVal).subscribe(data=>
          this.isLogged=data
        )
        console.log(this.isLogged);
 
        return;   
      }
  }
*/
}
