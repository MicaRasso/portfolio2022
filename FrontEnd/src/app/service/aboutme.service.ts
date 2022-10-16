import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { aboutme } from '../model/aboutme.model';

@Injectable({
  providedIn: 'root'
})
export class AboutmeService {
  URL='http://localhost:8090/aboutme/';

  constructor(private http:HttpClient) { }

  public getAboutMe():Observable<aboutme>{
    return this.http.get<aboutme>(this.URL+'get/1')
  }
}
