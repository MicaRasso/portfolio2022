import { Component, OnInit } from '@angular/core';
import { aboutme } from 'src/app/model/aboutme.model';
import { AboutmeService } from 'src/app/service/aboutme.service';
@Component({
  selector: 'app-aboutme',
  templateUrl: './aboutme.component.html',
  styleUrls: ['./aboutme.component.css']
})
export class AboutmeComponent implements OnInit {

  public aboutme:aboutme=new aboutme("","","","","","","");
  
  constructor(public aboutmeService:AboutmeService) { }

  ngOnInit(): void {
    this.aboutmeService.getAboutMe().subscribe(data => (
      this.aboutme=data));
  }

}
