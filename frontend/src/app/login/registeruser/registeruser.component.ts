import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { register } from '../registerclass/register';

@Component({
  selector: 'app-registeruser',
  templateUrl: './registeruser.component.html',
  styleUrls: ['./registeruser.component.css']
})
export class RegisteruserComponent {

  constructor( private Http: HttpClient ){}

 register: register =new register(); //create of object of class
 

 // name: string;
 // email: string;
 // password: string;
addregister()
{
  const url='http://localhost:8080/register';
  const body=this.register;

  this.Http.post(url,body).subscribe((data:any)=>
  {
    if(data)
    window.alert("yup");
    else
    window.alert("not yup");
  })
}
}
