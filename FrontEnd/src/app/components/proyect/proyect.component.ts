import { Component, OnInit } from '@angular/core';
import { proyect } from 'src/app/model/proyect.model';
import { ProyectService } from 'src/app/service/proyect.service';

@Component({
  selector: 'app-proyect',
  templateUrl: './proyect.component.html',
  styleUrls: ['./proyect.component.css']
})
export class ProyectComponent implements OnInit {

  public proyect:Array<proyect>=[];

  constructor(public proyectService:ProyectService) {}

  ngOnInit(): void {
    
    this.proyectService.getProyects().subscribe(data=>{
    this.proyect.push(data);
    console.log("PROYECTO", this.proyect)
  })

    
   /*
    let aux =this.proyectService.getProyects()

    aux.forEach(el=>{
      this.proyect.push(el);

    })
    */
  }
}
