import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
import {Title} from "@angular/platform-browser";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private router: Router, private titleService: Title) {
  }

  ngOnInit() {
    this.titleService.setTitle("Modifier une oeuvre");
  }

}
