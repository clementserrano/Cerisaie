import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs/index";

@Injectable({
  providedIn: 'root'
})
export class ActiviteService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get('api/activite/getAll');
  }

  getAllBySport(id): Observable<any>{
    return this.http.get('api/activite/get/' + id);
  }
}
