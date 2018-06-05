import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/index";

@Injectable({
  providedIn: 'root'
})
export class PrixService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get('api/prix/getAll');
  }
}
