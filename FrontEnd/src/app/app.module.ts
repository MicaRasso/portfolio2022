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
import { LayoutComponent } from './components/layout/layout.component';
import { NewExperienceComponent } from './components/experience/new-experience/new-experience.component';
import { EditExperienceComponent } from './components/experience/edit-experience/edit-experience.component';
import { NewSkillComponent } from './components/skills/new-skill/new-skill.component';
import { EditSkillComponent } from './components/skills/edit-skill/edit-skill.component';
import { NewAcademicComponent } from './components/academic/new-academic/new-academic.component';
import { EditAcademicComponent } from './components/academic/edit-academic/edit-academic.component';
import { EditAboutMeComponent } from './components/aboutme/edit-about-me/edit-about-me.component';
import { NewProyectComponent } from './components/proyect/new-proyect/new-proyect.component';
import { EditProyectComponent } from './components/proyect/edit-proyect/edit-proyect.component';
import { initializeApp,provideFirebaseApp } from '@angular/fire/app';
import { environment } from '../environments/environment';
import { provideStorage,getStorage } from '@angular/fire/storage';

 
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
    LayoutComponent,
    NewExperienceComponent,
    EditExperienceComponent,
    NewSkillComponent,
    EditSkillComponent,
    NewAcademicComponent,
    EditAcademicComponent,
    EditAboutMeComponent,
    NewProyectComponent,
    EditProyectComponent,
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
    provideFirebaseApp(() => initializeApp(environment.firebase)),
    provideStorage(() => getStorage()),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
