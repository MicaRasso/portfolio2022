import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loggedin(){
    if(true)//verificacion de que el usuario este logueado
    return true;
  }

  ngOnInit(): void {
  }

}
