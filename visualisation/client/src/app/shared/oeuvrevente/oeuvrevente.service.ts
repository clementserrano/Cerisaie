import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class OeuvreventeService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('/api/oeuvrevente/getAll');
  }

  get(idOeuvrevente): Observable<any> {
    return this.http.get('/api/oeuvrevente/get/' + idOeuvrevente);
  }

  add(oeuvrevente): Observable<any> {
    return this.http.post('/api/oeuvrevente/add', oeuvrevente);
  }

}
