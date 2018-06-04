import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ActiviteService} from "../services/activite/activite.service";
import {Location} from "@angular/common";
import {Observable} from "rxjs/index";

@Component({
  selector: 'app-planning-activite',
  templateUrl: './planning-activite.component.html',
  styleUrls: ['./planning-activite.component.css']
})
export class PlanningActiviteComponent implements OnInit {

  activites: Observable<any>;
  nomActivite: String;

  constructor(
    private route: ActivatedRoute,
    private activiteService: ActiviteService,
    private location: Location
  ) { }

  ngOnInit() {
    this.getActivites();
  }

  getActivites(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.activiteService.getAllBySport(id).subscribe(data => {
        this.activites = data;
        this.nomActivite = data[0].nomActivite;
    });
  }

  goBack(): void {
    this.location.back();
  }


}
