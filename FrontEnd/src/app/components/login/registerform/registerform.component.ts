import { getLocaleDateFormat } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators, EmailValidator, FormArrayName} from '@angular/forms';

@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.css']
})
export class RegisterformComponent implements OnInit {

  public validated=false;
  public userForm: FormGroup<{
    name:FormControl<string>;
    lastname:FormControl<string>;
    email:FormControl<string>;
    password:FormControl<string>;
    birthday:FormControl<string>;
    cellphone:FormControl<string>;
  }>;
  constructor(private fb:FormBuilder) { 
    this.userForm= this.fb.group({
      name: new FormControl("",{validators:[
        Validators.required,
        Validators.maxLength(15),
        Validators.minLength(2),
      ],nonNullable:true}),
      lastname: new FormControl("",{validators:[
        Validators.required,
        Validators.maxLength(15),
        Validators.minLength(2),
      ],nonNullable:true}),
      email: new FormControl("",{validators:[
        Validators.required,
        Validators.email,
      ],nonNullable:true}),
      password: new FormControl("",{validators:[
        Validators.required,
        Validators.maxLength(10),
        Validators.minLength(5),
      ],nonNullable:true}),
      birthday: new FormControl("",{validators:[
        Validators.required,
      ],nonNullable:true}),
      cellphone: new FormControl("",{validators:[
        Validators.required,
      ],nonNullable:true}),
    })
  }
  
/*validDate():boolean{
  console.log(this.userForm.get("birthday")?.value);
  
  var str =this.userForm.get("birthday")?.value;
  console.log(str);
  var str1= str?.toString();
  var date= new Date(str1);
  console.log(date);
  var str2="2022-08-11";
  date= new Date(str2);
  console.log(date);
  return true;


}*/

  logIn():void{
    console.log(this.userForm.value);
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
