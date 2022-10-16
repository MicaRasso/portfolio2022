import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { academic } from '../model/academic.model';

@Injectable({
  providedIn: 'root'
})
export class AcademicService {
  URL='http://localhost:8090/academic/';

  constructor(private http:HttpClient) { }

  public getAcademic():Observable<academic>{
    return this.http.get<academic>(this.URL+'get')
  }
}
