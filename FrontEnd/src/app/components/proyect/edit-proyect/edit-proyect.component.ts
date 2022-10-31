import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { proyect } from 'src/app/model/proyect.model';
import { ImagesService } from 'src/app/service/images.service';
import { ProyectService } from 'src/app/service/proyect.service';

@Component({
  selector: 'app-edit-proyect',
  templateUrl: './edit-proyect.component.html',
  styleUrls: ['./edit-proyect.component.css']
})
export class EditProyectComponent implements OnInit {
  proy:proyect=null;
  constructor(private proyService:ProyectService, private router:Router, private activatedRouter:ActivatedRoute, private imgService:ImagesService) {}

  ngOnInit(): void {
    const id=this.activatedRouter.snapshot.params['id'];
    this.proyService.detail(id).subscribe(
      data=>{
        this.proy=data;
      },err=>{
        this.router.navigate([""])
      })
  }

  onUpdate():void{
   const id=this.activatedRouter.snapshot.params['id'];
   this.proy.img_URL = this.imgService.URL;
   this.proyService.update(id,this.proy).subscribe(
    data=>{
      alert("Experiencia editada")
      this.router.navigate([""])
    },err=>{
      alert("No se pudo editar")
      this.router.navigate([""])
    });
  }

  uploadImg($event:any){
    const id=this.activatedRouter.snapshot.params['id'];
    let name=`proyect${id}`;
    this.imgService.uploadImg($event,name);
  }

}
