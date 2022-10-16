import { Component, OnInit } from '@angular/core';
import { academic } from 'src/app/model/academic.model';
import { AcademicService } from 'src/app/service/academic.service';

@Component({
  selector: 'app-academic',
  templateUrl: './academic.component.html',
  styleUrls: ['./academic.component.css']
})
export class AcademicComponent implements OnInit {

  public academic:Array<academic>=[];

  constructor(public academicService:AcademicService) { }

  ngOnInit(): void {
    this.academicService.getAcademic().subscribe(data=>{
      this.academic.push(data);
      console.log("ACADEMICA", this.academic)
    })
  }

}
