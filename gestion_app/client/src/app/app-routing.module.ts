import { NgModule } from '@angular/core';
import { RouterModule, Routes } from "@angular/router";
import {MenuComponent} from "./menu/menu.component";
import {PlanningGlobalComponent} from "./planning-global/planning-global.component";
import {SelectionActiviteComponent} from "./selection-activite/selection-activite.component";
import {PlanningActiviteComponent} from "./planning-activite/planning-activite.component";

const routes: Routes = [
  { path: '', redirectTo: '/menu', pathMatch: 'full' },
  { path: 'menu', component: MenuComponent },
  { path: 'planningGlobal', component: PlanningGlobalComponent },
  { path: 'choixActivite', component: SelectionActiviteComponent },
  { path: 'planning/:id', component: PlanningActiviteComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
