import { createMayBeForwardRefExpression } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {

  exp:experience[]=[];

  constructor(private experienceService:ExperienceService) { }

  isLogged=true;

  ngOnInit(): void {
    this.createExp();

  }

  createExp():void{
    this.experienceService.list().subscribe(data=> {
      this.exp=data;
    })

  }

}
