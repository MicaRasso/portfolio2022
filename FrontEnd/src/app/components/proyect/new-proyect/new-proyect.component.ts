import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { proyect } from 'src/app/model/proyect.model';
import { ImagesService } from 'src/app/service/images.service';
import { ProyectService } from 'src/app/service/proyect.service';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-new-proyect',
  templateUrl: './new-proyect.component.html',
  styleUrls: ['./new-proyect.component.css']
})
export class NewProyectComponent implements OnInit {
  title:string;
  fDate:string;
  description:string;
  link:string;
  img_URL:string;
  company:string;
  

  isLogged:boolean;

  constructor(private proyService:ProyectService, private router:Router, private valService:ValidationService, private activatedRouter:ActivatedRoute, private imgService:ImagesService) { }

  ngOnInit(): void {
    this.isLogged=this.valService.isLogged();
    if(this.isLogged==false)
    this.router.navigate([""]);
  }

  onCreate():void{
    if(this.imgService.URL!='')
      this.img_URL=this.imgService.URL;
    const proy= new proyect(this.title,this.fDate,this.description,this.link,this.img_URL,this.company);
    this.proyService.save(proy).subscribe(
      data=>{
        console.log("Proyecto añadido")
        location.reload();
      },err=>{
        console.log("No se pudo añadir")
        this.router.navigate([""])
      })
  }

  uploadImg($event:any){
    const id=this.activatedRouter.snapshot.params['id'];
    let name=`proyect${id}`;
    this.imgService.uploadImg($event,name);
  }
}
