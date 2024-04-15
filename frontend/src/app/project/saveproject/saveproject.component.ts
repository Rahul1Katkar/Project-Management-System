import { Component } from '@angular/core';
import { projectdetail } from '../projectdetail';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-saveproject',
  templateUrl: './saveproject.component.html',
  styleUrls: ['./saveproject.component.css']
})
export class SaveprojectComponent {
  project: projectdetail[]=[];
constructor(private http:HttpClient){
  this.http.get("http://localhost:8080/getallproject").subscribe((data:any)=>{
    if(!data)
    window.alert("fail to fetch data");
    else{
    console.log(data);
    this.project=data;}

  })

}
checkstatusstart(projectid: number)
{
  this.http.get("http://localhost:8080/updatestatus"+projectid+"and"+"running").subscribe((data:any)=>{
    if(!data)
    window.alert("data not found");
    else
    {
      for(let i=0;i<this.project.length;i++){
        if(this.project[i].id==projectid){
        this.project[i].status="running";
        break;}
      }
    }
  })
}

checkstatusclose(projectid: number)
{
  this.http.get("http://localhost:8080/updatestatus"+projectid+"and"+"close").subscribe((data:any)=>{
    if(!data)
    window.alert("data not found");
    else
    {
      for(let i=0;i<this.project.length;i++){
        if(this.project[i].id==projectid){
        this.project[i].status="close";
        break;}
      }
    }
  })
}

checkstatusclear(projectid: number)
{
  this.http.get("http://localhost:8080/updatestatus"+projectid+"and"+"clear").subscribe((data:any)=>{
    if(!data)
    window.alert("data not found");
    else
    {
      for(let i=0;i<this.project.length;i++){
        if(this.project[i].id==projectid){
        this.project[i].status="clear";
        break;}
      }
    }
  })
}



}
