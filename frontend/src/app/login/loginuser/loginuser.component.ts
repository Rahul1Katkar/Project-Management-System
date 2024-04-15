import { Component } from '@angular/core';
import { register } from '../registerclass/register';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-loginuser',
  templateUrl: './loginuser.component.html',
  styleUrls: ['./loginuser.component.css']
})
export class LoginuserComponent {
  constructor( private Http: HttpClient ){};
  
  register: register =new register();

cnt=0;

   
submit()
{
this.Http.get("http://localhost:8080/checklogin"+this.register.email+"and"+this.register.password).subscribe((data:any)=>{
  if(data)
  {
  window.alert("login sucessful");
  this.cnt=1;
}
  else{
  window.alert("login unsucessful");}
})
  
}

}
