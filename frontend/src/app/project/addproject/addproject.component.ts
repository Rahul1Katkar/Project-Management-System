import { Component } from '@angular/core';
import { projectdetail } from '../projectdetail';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-addproject',
  templateUrl: './addproject.component.html',
  styleUrls: ['./addproject.component.css']
})
export class AddprojectComponent {

  constructor(private htttp:HttpClient){};

  project: projectdetail=new projectdetail();

  statusvar="register";
  addproject(){
    this.project.status=this.statusvar;
    this.htttp.post("http://localhost:8080/addproject",this.project).subscribe((data:any)=>{

      if(!data)
      window.alert("data not get");
      else
      window.alert("sucessful");

    
    })
  }

}
