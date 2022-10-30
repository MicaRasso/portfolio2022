import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-new-skill',
  templateUrl: './new-skill.component.html',
  styleUrls: ['./new-skill.component.css']
})
export class NewSkillComponent implements OnInit {
  name:string;
  percentage:number;
  hard:boolean;

  constructor(private skiService:SkillsService, private router:Router) { }

  ngOnInit(): void {
  }

  onCreate():void{
    const exp= new skills(this.name,this.percentage,this.hard);
    this.skiService.save(exp).subscribe(
      data=>{
        console.log("Experiencia añadida")
      },err=>{
        console.log("No se pudo añadir")
      })
      this.router.navigate([""])
  }
}
