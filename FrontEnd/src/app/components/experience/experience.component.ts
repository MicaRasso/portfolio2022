import { ResourceLoader } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {

  exp:experience[]=[];

  constructor(private experienceService:ExperienceService,public validationService:ValidationService) { }

  isLogged=false;

  ngOnInit(): void {
    this.createExp();
    this.isLogged=this.validationService.isLogged();
  }

  createExp():void{
    this.experienceService.list().subscribe(data=> {
      this.exp=data;
    })
  }

  deleteExp(id?:number):void{
    if(id!= undefined){
      console.log("El id es: ",id);
      this.experienceService.delete(id).subscribe(
        data=>{
          console.log("Experiencia eliminada")
          location.reload();
        },err=>{
          console.log("No se pudo eliminar")
        })
    }else
    console.log("No se identifico el id ",id);
  }
}
