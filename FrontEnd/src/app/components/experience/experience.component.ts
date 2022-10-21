import { Component, OnInit } from '@angular/core';
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

}
