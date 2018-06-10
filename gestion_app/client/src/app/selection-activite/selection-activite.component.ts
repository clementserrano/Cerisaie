import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs/index";
import {SportService} from "../services/sport/sport.service";

@Component({
  selector: 'app-selection-activite',
  templateUrl: './selection-activite.component.html',
  styleUrls: ['./selection-activite.component.css']
})
export class SelectionActiviteComponent implements OnInit {

  sports: Observable<any>;

  constructor(private sportService: SportService) { }

  ngOnInit() {
    this.sportService.getAll().subscribe(data => {
      this.sports = data;
    })
  }

}
