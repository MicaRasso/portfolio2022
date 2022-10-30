import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LayoutComponent } from './components/layout/layout.component';
import { Page404Component } from './components/page404/page404.component';
import { LoginComponent } from './components/login/login.component';
import { NewExperienceComponent } from "./components/experience/new-experience/new-experience.component";
import { EditExperienceComponent } from './components/experience/edit-experience/edit-experience.component';
import { NewAcademicComponent } from './components/academic/new-academic/new-academic.component';
import { EditAcademicComponent } from './components/academic/edit-academic/edit-academic.component';
import { NewSkillComponent } from './components/skills/new-skill/new-skill.component';
import { EditSkillComponent } from './components/skills/edit-skill/edit-skill.component';


const routes: Routes = [
  {path:'', redirectTo:'/inicio', pathMatch:'full'},
  {path:'inicio', component:LayoutComponent},
  {path:'login',component:LoginComponent},
  {path:'newExp',component:NewExperienceComponent},
  {path:'editExp/:id',component:EditExperienceComponent},
  {path:'newSki',component:NewSkillComponent},
  {path:'editSki/:id',component:EditSkillComponent},
  {path:'newAca',component:NewAcademicComponent},
  {path:'editAca/:id',component:EditAcademicComponent},
  {path:'**',component:Page404Component},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
