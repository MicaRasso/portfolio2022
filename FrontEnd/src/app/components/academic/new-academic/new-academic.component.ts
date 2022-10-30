import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { academic } from 'src/app/model/academic.model';
import { AcademicService } from 'src/app/service/academic.service';

@Component({
  selector: 'app-new-academic',
  templateUrl: './new-academic.component.html',
  styleUrls: ['./new-academic.component.css']
})
export class NewAcademicComponent implements OnInit {
  title: string= '';
  iDate: string='';
  fDate:string='';
  institute: string='';  


  constructor(private acaService:AcademicService, private router:Router) {}

  ngOnInit(): void {
  }

  onCreate():void{
    const aca= new academic(this.title,this.iDate,this.fDate,this.institute);
    this.acaService.save(aca).subscribe(
      data=>{
        console.log("Formación académica añadida")
      },err=>{
        console.log("No se pudo añadir")
      })
      this.router.navigate([""])
  }


}
