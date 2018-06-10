import { Component, OnInit } from '@angular/core';
import {ActiviteService} from "../services/activite/activite.service";
import {Observable} from "rxjs/index";

@Component({
  selector: 'app-planning-global',
  templateUrl: './planning-global.component.html',
  styleUrls: ['./planning-global.component.css']
})
export class PlanningGlobalComponent implements OnInit {

  activites: Observable<any>;

  constructor(private activiteService: ActiviteService) { }

  ngOnInit() {

    this.activiteService.getAll().subscribe(data => {
      this.activites = data;
    })

  }
}
