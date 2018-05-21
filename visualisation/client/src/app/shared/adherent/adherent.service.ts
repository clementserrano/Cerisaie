import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class AdherentService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('/api/adherent/getAll');
  }

  add(adherent): Observable<any> {
    return this.http.post('/api/adherent/add', adherent);
  }
}
