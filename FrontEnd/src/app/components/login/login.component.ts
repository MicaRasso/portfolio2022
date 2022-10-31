import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { userValidation } from 'src/app/model/userval.model';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  email:string='';
  password:string='';
  isLogged:boolean;
  
  constructor(public userValService:ValidationService, private router:Router) {
  }


  ngOnInit(): void {
    this.isLogged=false;
  }


  onLogIn():void{
    const user= new userValidation(this.email,this.password);
    this.userValService.logIn(user);
    this.isLogged=this.userValService.isLogged();
    if(this.isLogged)
      this.router.navigate([""])
    }
  
}
