import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experience } from '../model/experience.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienceService {
  URL='http://localhost:8090/experience/';

  constructor(private http:HttpClient) { }

  public getExperience():Observable<experience>{
    return this.http.get<experience>(this.URL+'get/')
  }

}
