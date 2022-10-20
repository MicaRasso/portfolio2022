import { Component, OnInit } from '@angular/core';
import { experience } from 'src/app/model/experience.model';
import { images } from 'src/app/model/images.model';
import { ImagesService } from 'src/app/service/images.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  
  constructor() { }
  
  ngOnInit(): void {
  }

}
