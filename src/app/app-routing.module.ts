import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { NavComponent } from './components/nav/nav.component';
import { FooterComponent } from './components/footer/footer.component';
import { AboutmeComponent } from './components/aboutme/aboutme.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { AcademicComponent } from './components/academic/academic.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProyectComponent } from './components/proyect/proyect.component';
import { Page404Component } from './components/page404/page404.component';

const routes: Routes = [
  {path:'', redirectTo:'/inicio', pathMatch:'full'},
  {path:'inicio', component: AppComponent},
  {path:'aboutme', component: AboutmeComponent},
  {path:'experience',component:ExperienceComponent},
  {path:'academic', component: AcademicComponent},
  {path:'footer', component:FooterComponent},
  {path:'header',component:HeaderComponent},
  {path:'nav',component:NavComponent},
  {path:'proyects',component:ProyectComponent},
  {path:'proyects/:id',component:ProyectComponent},
  {path:'skills',component:SkillsComponent},
  {path:'**',component:Page404Component},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    useHash:false, 
    anchorScrolling: 'enabled', //modulos necesarios para el scrolling, me falta hacer la parte en los links del app.html
    onSameUrlNavigation: 'reload', 
    scrollPositionRestoration: 'enabled',
  })
  ],
  /*imports: [RouterModule.forRoot(routes)],*/
  exports: [RouterModule]
})
export class AppRoutingModule { }
