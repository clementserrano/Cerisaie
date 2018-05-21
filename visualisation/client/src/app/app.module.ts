import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import {HttpClientModule} from "@angular/common/http";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import {RouterModule, Routes} from "@angular/router";

import {AppComponent} from "./app.component";
import {ListeAdherentComponent} from "./liste-adherent/liste-adherent.component";
import {ListeOeuvreComponent} from "./liste-oeuvre/liste-oeuvre.component";
import {AjoutOeuvreComponent} from "./ajout-oeuvre/ajout-oeuvre.component";
import {AjoutAdherentComponent} from "./ajout-adherent/ajout-adherent.component";
import {ModifieOeuvreComponent} from "./modifie-oeuvre/modifie-oeuvre.component";
import {ReserveOeuvreComponent} from "./reserve-oeuvre/reserve-oeuvre.component";

import {AdherentService} from "./shared/adherent/adherent.service";
import {ProprietaireService} from "./shared/proprietaire/proprietaire.service";
import {OeuvreventeService} from "./shared/oeuvrevente/oeuvrevente.service";
import {ReservationService} from "./shared/reservation/reservation.service";
import {MenuComponent} from "./menu/menu.component";
import {FormsModule} from "@angular/forms";

export const routes: Routes = [
  {path: 'accueil', component: MenuComponent},
  {path: 'ajouterAdherent', component: AjoutAdherentComponent},
  {path: 'ajouterOeuvre', component: AjoutOeuvreComponent},
  {path: 'listerAdherent', component: ListeAdherentComponent},
  {path: 'listerOeuvre', component: ListeOeuvreComponent},
  {path: 'modifierOeuvre/:idOeuvre', component: ModifieOeuvreComponent},
  {path: 'reserverOeuvre/:idOeuvre', component: ReserveOeuvreComponent},
  {path: '', redirectTo: '/accueil', pathMatch: 'full'},
  {path: '**', redirectTo: '/accueil', pathMatch: 'full'}
]

@NgModule({
  declarations: [
    AppComponent,
    ListeAdherentComponent,
    ListeOeuvreComponent,
    AjoutOeuvreComponent,
    AjoutAdherentComponent,
    ModifieOeuvreComponent,
    ReserveOeuvreComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(routes),
    FormsModule
  ],
  exports: [RouterModule],
  providers: [AdherentService, ProprietaireService, OeuvreventeService, ReservationService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
