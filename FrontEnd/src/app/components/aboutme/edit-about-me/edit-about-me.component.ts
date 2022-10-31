import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { aboutme } from 'src/app/model/aboutme.model';
import { AboutmeService } from 'src/app/service/aboutme.service';
import { ImagesService } from 'src/app/service/images.service';

@Component({
  selector: 'app-edit-about-me',
  templateUrl: './edit-about-me.component.html',
  styleUrls: ['./edit-about-me.component.css']
})
export class EditAboutMeComponent implements OnInit {

  about:aboutme=null;

  constructor(private aboutService:AboutmeService, private router:Router,private activatedRouter:ActivatedRoute, private imgService:ImagesService) { }

  ngOnInit(): void {
    this.aboutService.getAboutMe().subscribe(
      data=>{
        this.about=data;
        this.about.img_profile='';
      },err=>{
        this.router.navigate([""])
      })
  }


  onUpdate():void{
    this.about.img_profile=this.imgService.URL;
    this.aboutService.update(this.about).subscribe(
     data=>{
       alert("Información personal actualizada")
       this.router.navigate([""]);
     },err=>{
       alert("No se pudo editar")
       this.router.navigate([""])
     });
  }

  uploadImg($event:any){
    let name='profile';
    this.imgService.uploadImg($event,name);
  }

}
