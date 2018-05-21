import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
import {Title} from "@angular/platform-browser";
import {AdherentService} from "../shared/adherent/adherent.service";

@Component({
  selector: 'app-ajout-adherent',
  templateUrl: './ajout-adherent.component.html',
  styleUrls: ['./ajout-adherent.component.css']
})
export class AjoutAdherentComponent implements OnInit {

  constructor(private router: Router,
              private adherentService: AdherentService,
              private titleService: Title) {
  }

  ngOnInit() {
    this.titleService.setTitle("Ajouter un Adhérent");
  }

  adherent = {
    nomAdherent: "",
    prenomAdherent: "",
    villeAdherent: ""
  }

  result = {
    status: "",
    message: ""
  }

  addAdherent() {
    this.adherentService.add(this.adherent).subscribe(success => {
      this.result.status = "success";
      this.result.message = "L'adhérent a été ajouté avec succès !"
    }, error => {
      this.result.status = "error";
      this.result.message = "Erreur : L'adhérent n'a pas pu être ajouté."
    });
  }
}
