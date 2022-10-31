import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';
import { ValidationService } from 'src/app/service/validation.service';


@Component({
  selector: 'app-new-experience',
  templateUrl: './new-experience.component.html',
  styleUrls: ['./new-experience.component.css']
})
export class NewExperienceComponent implements OnInit {
  title: string= '';
  iDate: string='';
  fDate:string='';
  description: string='';
  company: string='';  

  isLogged:boolean;

  constructor(private expService:ExperienceService, private router:Router, private valService:ValidationService) {}

  ngOnInit(): void {
    this.isLogged=this.valService.isLogged();
    if(this.isLogged==false)
    this.router.navigate([""]);
  }

  onCreate():void{
    const exp= new experience(this.title,this.iDate,this.fDate,this.description,this.company);
    this.expService.save(exp).subscribe(
      data=>{
        console.log("Experiencia añadida")
        location.reload();
      },err=>{
        console.log("No se pudo añadir")
        this.router.navigate([""])
      })
  }
}
