import {Component, OnInit} from "@angular/core";
import {Title} from "@angular/platform-browser";
import {OeuvreventeService} from "../shared/oeuvrevente/oeuvrevente.service";

@Component({
  selector: 'app-liste-oeuvre',
  templateUrl: './liste-oeuvre.component.html',
  styleUrls: ['./liste-oeuvre.component.css']
})
export class ListeOeuvreComponent implements OnInit {

  oeuvres: Array<any>;

  constructor(private oeuvreventeService: OeuvreventeService, private titleService: Title) {
  }

  ngOnInit() {
    this.titleService.setTitle("Affichage de toutes les oeuvres en vente");

    this.oeuvreventeService.getAll().subscribe(data => {
      this.oeuvres = data;
    })
  }

}
