import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  bgColor = "red";
  show = true;
  title = "On";
  changeStatuts() {
    if(this.title == "On")
    {
      this.title = "Off";
    }else{
      this.title = "On";
    }
    this.show = !this.show;
  }
}
