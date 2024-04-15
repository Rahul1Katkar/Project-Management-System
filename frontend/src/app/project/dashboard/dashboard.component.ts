import { Component } from '@angular/core';
 
import { HttpClient } from '@angular/common/http';
import { countdeatail } from '../countdeatail';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

 
  
constructor(private http: HttpClient){

  

  this.http.get("http://localhost:8080/getcountofall").subscribe((data:any)=>{
    this.count=data;

  })
}

count:countdeatail=new countdeatail();


 ToShow:number=0;


  show(num: number){

    this.ToShow=num;
    
    // this.http.get("http://localhost:8080/getcountofall").subscribe((data:any)=>{
    // if(!data ){
    // window.alert("data not fetched");
    // }else{
    // this.count=data;}

  // })
  }


}
