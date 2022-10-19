import { Component, OnInit } from '@angular/core';
import { proyect } from 'src/app/model/proyect.model';
import { ProyectService } from 'src/app/service/proyect.service';

@Component({
  selector: 'app-proyect',
  templateUrl: './proyect.component.html',
  styleUrls: ['./proyect.component.css']
})
export class ProyectComponent implements OnInit {

  proy:proyect[]=[];

  constructor(public proyectService:ProyectService) {}

  ngOnInit(): void {
    
    this.createProy();
  }

  createProy():void{
    this.proyectService.list().subscribe(data=> {
      this.proy=data;
    })
  }
}