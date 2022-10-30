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
  title: string= '';
  iDate: string='';
  fDate:string='';
  description: string='';
  company: string='';  


  constructor(private expService:ExperienceService, private router:Router) {}

  ngOnInit(): void {
  }

  onCreate():void{
    const ski= new experience(this.title,this.iDate,this.fDate,this.description,this.company);
    this.expService.save(ski).subscribe(
      data=>{
        console.log("Experiencia añadida")
      },err=>{
        console.log("No se pudo añadir")
      })
      this.router.navigate([""])
  }
}
