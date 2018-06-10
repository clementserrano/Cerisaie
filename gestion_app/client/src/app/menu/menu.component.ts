import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  quit() :void{
    if (confirm('Do you really want to close the application?')) {
      window.open('', '_parent', '');
      window.close();
    }
    //Impossible for this projet => doesn't work !!
  }
}
