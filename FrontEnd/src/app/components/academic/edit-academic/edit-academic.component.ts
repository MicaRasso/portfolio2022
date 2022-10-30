import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { academic } from 'src/app/model/academic.model';
import { AcademicService } from 'src/app/service/academic.service';

@Component({
  selector: 'app-edit-academic',
  templateUrl: './edit-academic.component.html',
  styleUrls: ['./edit-academic.component.css']
})
export class EditAcademicComponent implements OnInit {
  aca:academic=null;
  constructor(private acaService:AcademicService, private router:Router, private activatedRouter:ActivatedRoute) {}

  ngOnInit(): void {
    const id=this.activatedRouter.snapshot.params['id'];
    this.acaService.detail(id).subscribe(
      data=>{
        this.aca=data;
      },err=>{
        this.router.navigate([""])
      })
  }

  onUpdate():void{
   const id=this.activatedRouter.snapshot.params['id'];
   this.acaService.update(id,this.aca).subscribe(
    data=>{
      alert("Formación academica actualizada")
      this.router.navigate([""]);
    },err=>{
      alert("No se pudo editar")
      this.router.navigate([""])
    });
  }


}
