import { Component, OnInit } from '@angular/core';
import { proyect } from 'src/app/model/proyect.model';
import { ProyectService } from 'src/app/service/proyect.service';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-proyect',
  templateUrl: './proyect.component.html',
  styleUrls: ['./proyect.component.css']
})
export class ProyectComponent implements OnInit {

  proy:proyect[]=[];

  isLogged=false;
  
  constructor(public proyectService:ProyectService,public validationService:ValidationService) {}

  ngOnInit(): void {
    
    this.createProy();
    this.isLogged=this.validationService.isLogged();
  }

  createProy():void{
    this.proyectService.list().subscribe(data=> {
      this.proy=data;
    })
  }
}