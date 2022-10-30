import { Component, OnInit } from '@angular/core';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  sk:skills[]=[];

  isLogged=false;
  
  constructor(public skillsService:SkillsService,public validationService:ValidationService) { }

  ngOnInit(): void {
    this.createSkill();
    this.isLogged=this.validationService.isLogged();
  }

  createSkill(){
    this.skillsService.list().subscribe(data=> {
      this.sk=data;
    })
  }

  deleteSki(id?:number):void{
    if(id!= undefined){
      console.log("El id es: ",id);
      this.skillsService.delete(id).subscribe(
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
