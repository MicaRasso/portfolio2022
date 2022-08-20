import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent implements OnInit {

  public validated=false;
  public userForm: FormGroup<{
    email:FormControl<string>;
    password:FormControl<string>;
  }>;
  constructor(private fb:FormBuilder) { 
    this.userForm= this.fb.group({
      email: new FormControl("",{validators:[
        Validators.required,
        //Validators.email,
      ],nonNullable:true}),
      password: new FormControl("",{validators:[
        Validators.required,
        Validators.maxLength(10),
        Validators.minLength(5),
      ],nonNullable:true}),
    })
  }
  
  logIn():void{
    console.log(this.userForm.value)
    this.validated=true;
    if (!this.userForm.valid){
      console.log("Errores");
      return;
    }
    console.log("LogIn");
  }



  get form(){
    return this.userForm.controls;
  }

  ngOnInit(): void {
  }

}
