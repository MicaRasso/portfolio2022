import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { userValidation } from 'src/app/model/userval.model';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public validated=false;
    public userForm: FormGroup<{
      email:FormControl<string>;
      password:FormControl<string>;
    }>;

  //private userVal:userValidation=new userValidation("","");
  public isLogged:boolean=false;


  constructor(public userValService:ValidationService,private fb:FormBuilder, private router:Router) {
    this.userForm= this.fb.group({
      email: new FormControl("",{validators:[
        Validators.required,
      ],nonNullable:true}),
      password: new FormControl("",{validators:[
        Validators.required,
        Validators.maxLength(10),
        Validators.minLength(5),
      ],nonNullable:true}),
    })
  }

  ngOnInit(): void {
    this.isLogged=false;
  }

    loggedin(){
        let mail=this.form.email.value.toString();
        let pass=this.form.password.value.toString();

        this.userValService.logIn(mail,pass);   
//        this.userValService.alternativeLogIn(mail,pass);  
        
        this.isLogged=this.userValService.isLogged();
        if(this.isLogged)
          this.router.navigate(['']);
    }



  
/*
    logIn():void{
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
  
    get form(){
      return this.userForm.controls;
    }
  

}
