import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ActiviteService} from "../services/activite/activite.service";
import {Observable} from "rxjs/index";

@Component({
  selector: 'app-planning-activite',
  templateUrl: './planning-activite.component.html',
  styleUrls: ['./planning-activite.component.css']
})
export class PlanningActiviteComponent implements OnInit {

  activites: Observable<any>;
  nomActivite: string;
  id: string;

  constructor(
    private route: ActivatedRoute,
    private activiteService: ActiviteService) { }

  ngOnInit() {
    this.getId();
    this.getActivites();
  }

  getId(): void {
    this.route.url.subscribe(url => {
      this.id = (url[1] !== undefined && url[1] !== null) ? url[1].path : null;
      this.getActivites();
    });
  }

  getActivites(): void {
    if(this.id !== null && this.id !== undefined){
      this.activiteService.getAllBySport(this.id).subscribe(data => {
        this.activites = data;
        this.nomActivite = data[0].nomActivite;
      });
    }
  }
}
