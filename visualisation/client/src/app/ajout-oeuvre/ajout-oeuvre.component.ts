import {Component, OnInit} from "@angular/core";
import {Title} from "@angular/platform-browser";
import {ProprietaireService} from "../shared/proprietaire/proprietaire.service";
import {OeuvreventeService} from "../shared/oeuvrevente/oeuvrevente.service";

@Component({
  selector: 'app-ajout-oeuvre',
  templateUrl: './ajout-oeuvre.component.html',
  styleUrls: ['./ajout-oeuvre.component.css']
})
export class AjoutOeuvreComponent implements OnInit {

  oeuvrevente: any;
  proprietaires: Array<any>;

  constructor(private proprietaireService: ProprietaireService,
              private oeuvreventeService: OeuvreventeService,
              private titleService: Title) {
    this.oeuvrevente = {
      titreOeuvrevente: "",
      prixOeuvrevente: "",
      proprietaire: {},
      etatOeuvrevente: 'L'
    }
  }

  ngOnInit() {
    this.titleService.setTitle("Ajouter une Oeuvre");

    this.proprietaireService.getAll().subscribe(data => {
      this.proprietaires = data;
      this.oeuvrevente.proprietaire = this.proprietaires[0]; // init with premier propriétaire
    })
  }

  result = {
    status: "",
    message: ""
  }

  addOeuvre() {
    this.oeuvreventeService.add(this.oeuvrevente).subscribe(success => {
      this.result.status = "success";
      this.result.message = "L'oeuvre a été ajoutée avec succès !"
    }, error => {
      this.result.status = "error";
      this.result.message = "Erreur : L'oeuvre n'a pas pu être ajoutée."
    });
  }

}
