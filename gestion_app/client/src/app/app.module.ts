import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { AppRoutingModule } from './app-routing.module';
import { PlanningGlobalComponent } from './planning-global/planning-global.component';
import { SelectionActiviteComponent } from './selection-activite/selection-activite.component';
import { PlanningActiviteComponent } from './planning-activite/planning-activite.component';
import {ActiviteService} from "./services/activite/activite.service";
import {SportService} from "./services/sport/sport.service";

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    PlanningGlobalComponent,
    SelectionActiviteComponent,
    PlanningActiviteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ActiviteService, SportService],
  bootstrap: [AppComponent]
})
export class AppModule { }
