import {Component, OnInit} from "@angular/core";
import {Title} from "@angular/platform-browser";
import {ActivatedRoute} from "@angular/router";
import {OeuvreventeService} from "../shared/oeuvrevente/oeuvrevente.service";
import {ProprietaireService} from "../shared/proprietaire/proprietaire.service";

@Component({
  selector: 'app-modifie-oeuvre',
  templateUrl: './modifie-oeuvre.component.html',
  styleUrls: ['./modifie-oeuvre.component.css']
})
export class ModifieOeuvreComponent implements OnInit {

  idOeuvre: number;
  oeuvrevente: any;
  proprietaires: Array<any>;

  constructor(private route: ActivatedRoute,
              private titleService: Title,
              private oeuvreventeService: OeuvreventeService,
              private proprietaireService: ProprietaireService) {
    this.oeuvrevente = {};
  }

  ngOnInit() {
    this.titleService.setTitle("Expo : Médiathèque De POLYTECH");

    this.route.params.subscribe(params => {
      this.idOeuvre = +params['idOeuvre'];
      this.proprietaireService.getAll().subscribe(data => {
        this.proprietaires = data;
        this.oeuvreventeService.get(this.idOeuvre).subscribe(data => {
          this.oeuvrevente = data;
          this.proprietaires.forEach(proprietaire => {
            if (this.oeuvrevente.proprietaire.idProprietaire == proprietaire.idProprietaire) {
              this.oeuvrevente.proprietaire = proprietaire;
            }
          })
        })
      })
    })
  }

  result = {
    status: "",
    message: ""
  }

  modifyOeuvre() {

    this.oeuvreventeService.add(this.oeuvrevente).subscribe(success => {
      this.result.status = "success";
      this.result.message = "L'oeuvre a été modifiée avec succès !"
    }, error => {
      this.result.status = "error";
      this.result.message = "Erreur : L'oeuvre n'a pas pu être modifiée."
    });
  }

}
