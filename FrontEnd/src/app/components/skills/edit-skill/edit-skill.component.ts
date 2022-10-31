import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-edit-skill',
  templateUrl: './edit-skill.component.html',
  styleUrls: ['./edit-skill.component.css']
})
export class EditSkillComponent implements OnInit {
  ski:skills=null;
  constructor(private skiService:SkillsService, private router:Router, private activatedRouter:ActivatedRoute) {}

  ngOnInit(): void {
    const id=this.activatedRouter.snapshot.params['id'];
    this.skiService.detail(id).subscribe(
      data=>{
        this.ski=data;
      },err=>{
        this.router.navigate([""])
      })
  }

  onUpdate():void{
   const id=this.activatedRouter.snapshot.params['id'];
   this.skiService.update(id,this.ski).subscribe(
    data=>{
      alert("Experiencia editada")
      location.reload();
    },err=>{
      alert("No se pudo editar")
      this.router.navigate([""])
    });
  }
}
