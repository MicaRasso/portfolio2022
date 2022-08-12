import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { AboutmeComponent } from './components/aboutme/aboutme.component';
import { AcademicComponent } from './components/academic/academic.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProyectComponent } from './components/proyect/proyect.component';
import { AcademiccardComponent } from './components/academic/academiccard/academiccard.component';
import { SkillcardComponent } from './components/skills/skillcard/skillcard.component';
import { ProyectcardComponent } from './components/proyect/proyectcard/proyectcard.component';
import { NavComponent } from './components/nav/nav.component';
import { FooterComponent } from './components/footer/footer.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { ExpcardComponent } from './components/experience/expcard/expcard.component';
import { Page404Component } from './components/page404/page404.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutmeComponent,
    AcademicComponent,
    SkillsComponent,
    ProyectComponent,
    AcademiccardComponent,
    SkillcardComponent,
    ProyectcardComponent,
    NavComponent,
    FooterComponent,
    ExperienceComponent,
    ExpcardComponent,
    Page404Component,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
