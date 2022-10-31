import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-new-skill',
  templateUrl: './new-skill.component.html',
  styleUrls: ['./new-skill.component.css']
})
export class NewSkillComponent implements OnInit {
  name:string;
  percentage:number;

  isLogged:boolean;

  constructor(private skiService:SkillsService, private router:Router, private valService:ValidationService) { }

  ngOnInit(): void {
    this.isLogged=this.valService.isLogged();
    if(this.isLogged==false)
    this.router.navigate([""]);
  }

  onCreate():void{
    const ski= new skills(this.name,this.percentage);
    this.skiService.save(ski).subscribe(
      data=>{
        console.log("Experiencia añadida")
        location.reload();
      },err=>{
        console.log("No se pudo añadir")
        this.router.navigate([""])
      })
  }
}
