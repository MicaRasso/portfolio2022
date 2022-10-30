import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-edit-experience',
  templateUrl: './edit-experience.component.html',
  styleUrls: ['./edit-experience.component.css']
})
export class EditExperienceComponent implements OnInit {
  exp:experience=null;
  constructor(private expService:ExperienceService, private router:Router, private activatedRouter:ActivatedRoute) {}

  ngOnInit(): void {
    const id=this.activatedRouter.snapshot.params['id'];
    this.expService.detail(id).subscribe(
      data=>{
        this.exp=data;
      },err=>{
        this.router.navigate([""])
      })
  }

  onUpdate():void{
   const id=this.activatedRouter.snapshot.params['id'];
   this.expService.update(id,this.exp).subscribe(
    data=>{
      alert("Experiencia editada")
      this.router.navigate([""]);
    },err=>{
      alert("No se pudo editar")
      this.router.navigate([""])
    });
  }

}
