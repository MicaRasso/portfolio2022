import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule } from '@angular/common/http';
import { NgCircleProgressModule } from 'ng-circle-progress';
 
import { HeaderComponent } from './components/header/header.component';
import { AboutmeComponent } from './components/aboutme/aboutme.component';
import { LoginComponent } from './components/login/login.component';
import { AcademicComponent } from './components/academic/academic.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProyectComponent } from './components/proyect/proyect.component';
import { FooterComponent } from './components/footer/footer.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { Page404Component } from './components/page404/page404.component';
import { LoginformComponent } from './components/login/loginform/loginform.component';
import { RegisterformComponent } from './components/login/registerform/registerform.component';
import { LayoutComponent } from './components/layout/layout.component';

 
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutmeComponent,
    AcademicComponent,
    SkillsComponent,
    ProyectComponent,
    FooterComponent,
    ExperienceComponent,
    LoginComponent,
    Page404Component,
    LoginformComponent,
    RegisterformComponent,
    LayoutComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, 
    ReactiveFormsModule,
    NgCircleProgressModule.forRoot({
      radius: 100,
      outerStrokeWidth: 16,
      innerStrokeWidth: 8,
      outerStrokeColor: "#78C000",
      innerStrokeColor: "#C7E596",
      animationDuration: 300
    }),
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
