import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-new-experience',
  templateUrl: './new-experience.component.html',
  styleUrls: ['./new-experience.component.css']
})
export class NewExperienceComponent implements OnInit {
  title:string="";
  iDate:Date=new Date;
  fDate:Date=new Date;
  description:string="";
  company:string="";

  constructor(private expService:ExperienceService, private router:Router) { }

  ngOnInit(): void {
  }

  onCreate():void{
    const exp= new experience(this.title,this.iDate,this.fDate,this.description,this.company);
    this.expService.save(exp).subscribe(
      data=>{
        alert("Experiencia añadida")
        //this.router.navigate([""]);
      },err=>{
        alert("No se pudo añadir")
        //this.router.navigate([""])
      })
      this.router.navigate([""])
  }


  

}
