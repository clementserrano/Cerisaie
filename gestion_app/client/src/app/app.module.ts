import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { AppRoutingModule } from './/app-routing.module';
import { PlanningGlobalComponent } from './planning-global/planning-global.component';
import { SelectionActiviteComponent } from './selection-activite/selection-activite.component';
import { PlanningActiviteComponent } from './planning-activite/planning-activite.component';

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
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
