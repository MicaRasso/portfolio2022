import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LayoutComponent } from './components/layout/layout.component';
import { Page404Component } from './components/page404/page404.component';
import { LoginComponent } from './components/login/login.component';
import { NewExperienceComponent } from "./components/experience/new-experience/new-experience.component";

const routes: Routes = [
  {path:'', redirectTo:'/inicio', pathMatch:'full'},
  {path:'inicio', component:LayoutComponent},
  {path:'login',component:LoginComponent},
  {path:'newExp',component:NewExperienceComponent},
  {path:'**',component:Page404Component},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
