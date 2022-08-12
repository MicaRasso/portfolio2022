import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Params } from '@angular/router';

@Component({
  selector: 'app-proyect',
  templateUrl: './proyect.component.html',
  styleUrls: ['./proyect.component.css']
})
export class ProyectComponent implements OnInit {

  constructor(private rutaActiva:ActivatedRoute) { 
    this.rutaActiva.params.subscribe((params:Params)=>{
      console.log(params['id']);
      //  const id=params.id.toString();

    })
  }

  ngOnInit(): void {
  }
}
