import { Component, OnInit } from '@angular/core';
import { academic } from 'src/app/model/academic.model';
import { AcademicService } from 'src/app/service/academic.service';
import { ValidationService } from 'src/app/service/validation.service';

@Component({
  selector: 'app-academic',
  templateUrl: './academic.component.html',
  styleUrls: ['./academic.component.css']
})
export class AcademicComponent implements OnInit {

  aca:academic[]=[];
  
  constructor(public academicService:AcademicService,public validationService:ValidationService) { }

  isLogged=false;

  ngOnInit(): void {
    this.createAcad();
    this.isLogged=this.validationService.isLogged();
  }

  createAcad():void{
    this.academicService.list().subscribe(data=> {
      this.aca=data;
    })
  }

  deleteAca(id?:number):void{
    if(id!= undefined){
      console.log("El id es: ",id);
      this.academicService.delete(id).subscribe(
        data=>{
          console.log("Experiencia eliminada")
          location.reload();
        },err=>{
          console.log("No se pudo eliminar")
        })
    }else
    console.log("No se identifico el id ",id);
  }

}
