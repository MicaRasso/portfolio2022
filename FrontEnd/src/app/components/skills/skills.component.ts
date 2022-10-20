import { Component, OnInit } from '@angular/core';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  sk:skills[]=[];

  isLogged=true 
  
  constructor(public skillsService:SkillsService) { }

  ngOnInit(): void {
    this.createSkill();
  }

  createSkill(){
    this.skillsService.list().subscribe(data=> {
      this.sk=data;
    })
  }

}
