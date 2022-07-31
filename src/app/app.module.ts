import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AboutmeComponent } from './aboutme/aboutme.component';
import { ExpierenceComponent } from './expierence/expierence.component';
import { AcademicComponent } from './academic/academic.component';
import { SkillsComponent } from './skills/skills.component';
import { ProyectComponent } from './proyect/proyect.component';
import { ExpcardComponent } from './expierence/expcard/expcard.component';
import { AcademiccardComponent } from './academic/academiccard/academiccard.component';
import { SkillcardComponent } from './skills/skillcard/skillcard.component';
import { ProyectcardComponent } from './proyect/proyectcard/proyectcard.component';
import { NavComponent } from './nav/nav.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutmeComponent,
    ExpierenceComponent,
    AcademicComponent,
    SkillsComponent,
    ProyectComponent,
    ExpcardComponent,
    AcademiccardComponent,
    SkillcardComponent,
    ProyectcardComponent,
    NavComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
