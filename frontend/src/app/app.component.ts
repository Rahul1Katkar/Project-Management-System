import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'project1';


  constructor(){}
  whatToShow=0;

  show(num:number)
  {
    this.whatToShow=num;
    console.log("success");
  }

  
}
