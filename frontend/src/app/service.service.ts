import { Injectable } from '@angular/core';
import { register } from './login/registerclass/register';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor() { }

  allregisteruser: register[]=[];

  Allregisteruser(registeruser:register)
  {
    this.allregisteruser.push(registeruser)
  }
getallregisteruser()
{
  return this.allregisteruser;
}

}
