import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs/index";
import {PrixService} from "../services/prix/prix.service";

@Component({
  selector: 'app-consulter-prix',
  templateUrl: './consulter-prix.component.html',
  styleUrls: ['./consulter-prix.component.css']
})
export class ConsulterPrixComponent implements OnInit {

  prixl: Observable<any>

  constructor(private prixService: PrixService) { }

  ngOnInit() {

    this.prixService.getAll().subscribe(data => {
      this.prixl = data;
    })
  }

}
