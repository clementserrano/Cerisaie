import {Component, OnInit} from "@angular/core";
import {Title} from "@angular/platform-browser";
import {ActivatedRoute} from "@angular/router";
import {OeuvreventeService} from "../shared/oeuvrevente/oeuvrevente.service";
import {ReservationService} from "../shared/reservation/reservation.service";
import {AdherentService} from "../shared/adherent/adherent.service";

@Component({
  selector: 'app-reserve-oeuvre',
  templateUrl: './reserve-oeuvre.component.html',
  styleUrls: ['./reserve-oeuvre.component.css']
})
export class ReserveOeuvreComponent implements OnInit {

  idOeuvre: number;
  reservation: any;
  adherents: Array<any>;

  constructor(private route: ActivatedRoute,
              private titleService: Title,
              private oeuvreventeService: OeuvreventeService,
              private reservationService: ReservationService,
              private adherentService: AdherentService) {
    this.reservation = {
      reservationId: {
        adherent: {},
        oeuvrevente: {}
      },
      dateReservation: null,
      statut: "reservee"
    }
  }

  ngOnInit() {
    this.titleService.setTitle("Réserver une oeuvre");

    this.route.params.subscribe(params => {
      this.idOeuvre = +params['idOeuvre'];
    })

    this.adherentService.getAll().subscribe(data => {
      this.adherents = data;
      this.reservation.reservationId.adherent = this.adherents[0]; // init with premier adhérent
    })

    this.oeuvreventeService.get(this.idOeuvre).subscribe(data => {
      this.reservation.reservationId.oeuvrevente = data;
    })
  }

  result = {
    status: "",
    message: ""
  }

  bookOeuvre() {
    this.reservation.reservationId.oeuvrevente.etatOeuvrevente = 'R';
    this.reservationService.add(this.reservation).subscribe(success => {
      this.result.status = "success";
      this.result.message = "L'oeuvre a été réservée avec succès !"
    }, error => {
      this.result.status = "error";
      this.result.message = "Erreur : L'oeuvre n'a pas pu être réservée."
    });
  }

}
